package typings.sidewayAddress.mod

import typings.sidewayAddress.mod.domain.Tlds.Allow
import typings.sidewayAddress.mod.domain.Tlds.Deny
import typings.sidewayAddress.sidewayAddressBooleans.`true`
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domain {
  
  /**
    * Analyzes a string to verify it is a valid domain name.
    * 
    * @param domain - the domain name to validate.
    * @param options - optional settings.
    * 
    * @return - undefined when valid, otherwise an object with single error key with a string message value.
    */
  @JSImport("@sideway/address", "domain.analyze")
  @js.native
  def analyze(domain: String): Analysis | Null = js.native
  @JSImport("@sideway/address", "domain.analyze")
  @js.native
  def analyze(domain: String, options: Options): Analysis | Null = js.native
  
  /**
    * Analyzes a string to verify it is a valid domain name.
    * 
    * @param domain - the domain name to validate.
    * @param options - optional settings.
    * 
    * @return - true when valid, otherwise false.
    */
  @JSImport("@sideway/address", "domain.isValid")
  @js.native
  def isValid(domain: String): Boolean = js.native
  @JSImport("@sideway/address", "domain.isValid")
  @js.native
  def isValid(domain: String, options: Options): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Determines whether Unicode characters are allowed.
      * 
      * @default true
      */
    val allowUnicode: js.UndefOr[Boolean] = js.native
    
    /**
      * The minimum number of domain segments (e.g. `x.y.z` has 3 segments) required.
      * 
      * @default 2
      */
    val minDomainSegments: js.UndefOr[Double] = js.native
    
    /**
      * Top-level-domain options
      * 
      * @default true
      */
    val tlds: js.UndefOr[Allow | Deny | Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUnicode(value: Boolean): Self = StObject.set(x, "allowUnicode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnicodeUndefined: Self = StObject.set(x, "allowUnicode", js.undefined)
      
      @scala.inline
      def setMinDomainSegments(value: Double): Self = StObject.set(x, "minDomainSegments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDomainSegmentsUndefined: Self = StObject.set(x, "minDomainSegments", js.undefined)
      
      @scala.inline
      def setTlds(value: Allow | Deny | Boolean): Self = StObject.set(x, "tlds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTldsUndefined: Self = StObject.set(x, "tlds", js.undefined)
    }
  }
  
  object Tlds {
    
    @js.native
    trait Allow extends StObject {
      
      val allow: Set[String] | `true` = js.native
    }
    object Allow {
      
      @scala.inline
      def apply(allow: Set[String] | `true`): Allow = {
        val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any])
        __obj.asInstanceOf[Allow]
      }
      
      @scala.inline
      implicit class AllowMutableBuilder[Self <: Allow] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllow(value: Set[String] | `true`): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Deny extends StObject {
      
      val deny: Set[String] = js.native
    }
    object Deny {
      
      @scala.inline
      def apply(deny: Set[String]): Deny = {
        val __obj = js.Dynamic.literal(deny = deny.asInstanceOf[js.Any])
        __obj.asInstanceOf[Deny]
      }
      
      @scala.inline
      implicit class DenyMutableBuilder[Self <: Deny] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeny(value: Set[String]): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
      }
    }
  }
}
