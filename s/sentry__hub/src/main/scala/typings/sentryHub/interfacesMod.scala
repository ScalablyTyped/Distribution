package typings.sentryHub

import org.scalablytyped.runtime.StringDictionary
import typings.sentryHub.anon.Extensions
import typings.sentryHub.scopeMod.Scope
import typings.sentryTypes.clientMod.Client
import typings.sentryTypes.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  trait Carrier extends StObject {
    
    var __SENTRY__ : js.UndefOr[Extensions] = js.undefined
  }
  object Carrier {
    
    @scala.inline
    def apply(): Carrier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Carrier]
    }
    
    @scala.inline
    implicit class CarrierMutableBuilder[Self <: Carrier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__SENTRY__(value: Extensions): Self = StObject.set(x, "__SENTRY__", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__SENTRY__Undefined: Self = StObject.set(x, "__SENTRY__", js.undefined)
    }
  }
  
  trait DomainAsCarrier
    extends StObject
       with Carrier {
    
    var members: js.Array[StringDictionary[js.Any]]
  }
  object DomainAsCarrier {
    
    @scala.inline
    def apply(members: js.Array[StringDictionary[js.Any]]): DomainAsCarrier = {
      val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainAsCarrier]
    }
    
    @scala.inline
    implicit class DomainAsCarrierMutableBuilder[Self <: DomainAsCarrier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMembers(value: js.Array[StringDictionary[js.Any]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "members", js.Array(value :_*))
    }
  }
  
  trait Layer extends StObject {
    
    var client: js.UndefOr[Client[Options]] = js.undefined
    
    var scope: js.UndefOr[Scope] = js.undefined
  }
  object Layer {
    
    @scala.inline
    def apply(): Layer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Layer]
    }
    
    @scala.inline
    implicit class LayerMutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: Client[Options]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
