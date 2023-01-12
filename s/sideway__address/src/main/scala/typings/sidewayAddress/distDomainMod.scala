package typings.sidewayAddress

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomainMod {
  
  @JSImport("@sideway/address/dist/domain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def analyzeDomain(domain: String): Analysis | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("analyzeDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[Analysis | Null]
  inline def analyzeDomain(domain: String, options: DomainOptions): Analysis | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("analyzeDomain")(domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Analysis | Null]
  
  inline def isDomainValid(domain: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomainValid")(domain.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDomainValid(domain: String, options: DomainOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDomainValid")(domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validateDomainOptions(options: DomainOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateDomainOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Analysis extends StObject {
    
    /**
      * The error code.
      */
    var code: String
    
    /**
      * The reason validation failed.
      */
    var error: String
  }
  object Analysis {
    
    inline def apply(code: String, error: String): Analysis = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Analysis]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Analysis] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomainOptions extends StObject {
    
    /**
      * Allows passing fully qualified domain (ends with a period)
      *
      * @default false
      */
    val allowFullyQualified: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether Unicode characters are allowed.
      *
      * @default true
      */
    val allowUnicode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum number of domain segments (e.g. `x.y.z` has 3 segments) allowed.
      *
      * @default Infinity
      */
    val maxDomainSegments: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum number of domain segments (e.g. `x.y.z` has 3 segments) required.
      *
      * @default 2
      */
    val minDomainSegments: js.UndefOr[Double] = js.undefined
    
    /**
      * Top-level-domain options
      *
      * @default true
      */
    val tlds: js.UndefOr[TldsAllow | TldsDeny] = js.undefined
  }
  object DomainOptions {
    
    inline def apply(): DomainOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DomainOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowFullyQualified(value: Boolean): Self = StObject.set(x, "allowFullyQualified", value.asInstanceOf[js.Any])
      
      inline def setAllowFullyQualifiedUndefined: Self = StObject.set(x, "allowFullyQualified", js.undefined)
      
      inline def setAllowUnicode(value: Boolean): Self = StObject.set(x, "allowUnicode", value.asInstanceOf[js.Any])
      
      inline def setAllowUnicodeUndefined: Self = StObject.set(x, "allowUnicode", js.undefined)
      
      inline def setMaxDomainSegments(value: Double): Self = StObject.set(x, "maxDomainSegments", value.asInstanceOf[js.Any])
      
      inline def setMaxDomainSegmentsUndefined: Self = StObject.set(x, "maxDomainSegments", js.undefined)
      
      inline def setMinDomainSegments(value: Double): Self = StObject.set(x, "minDomainSegments", value.asInstanceOf[js.Any])
      
      inline def setMinDomainSegmentsUndefined: Self = StObject.set(x, "minDomainSegments", js.undefined)
      
      inline def setTlds(value: TldsAllow | TldsDeny): Self = StObject.set(x, "tlds", value.asInstanceOf[js.Any])
      
      inline def setTldsUndefined: Self = StObject.set(x, "tlds", js.undefined)
    }
  }
  
  trait TldsAllow extends StObject {
    
    val allow: Set[String]
  }
  object TldsAllow {
    
    inline def apply(allow: Set[String]): TldsAllow = {
      val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any])
      __obj.asInstanceOf[TldsAllow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TldsAllow] (val x: Self) extends AnyVal {
      
      inline def setAllow(value: Set[String]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    }
  }
  
  trait TldsDeny extends StObject {
    
    val deny: Set[String]
  }
  object TldsDeny {
    
    inline def apply(deny: Set[String]): TldsDeny = {
      val __obj = js.Dynamic.literal(deny = deny.asInstanceOf[js.Any])
      __obj.asInstanceOf[TldsDeny]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TldsDeny] (val x: Self) extends AnyVal {
      
      inline def setDeny(value: Set[String]): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
    }
  }
}
