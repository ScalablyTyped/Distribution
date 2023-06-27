package typings.smithyTypes

import typings.smithyTypes.distTypesAuthMod.AuthScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AuthSchemes extends StObject {
    
    var authSchemes: js.UndefOr[js.Array[AuthScheme]] = js.undefined
  }
  object AuthSchemes {
    
    inline def apply(): AuthSchemes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthSchemes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthSchemes] (val x: Self) extends AnyVal {
      
      inline def setAuthSchemes(value: js.Array[AuthScheme]): Self = StObject.set(x, "authSchemes", value.asInstanceOf[js.Any])
      
      inline def setAuthSchemesUndefined: Self = StObject.set(x, "authSchemes", js.undefined)
      
      inline def setAuthSchemesVarargs(value: AuthScheme*): Self = StObject.set(x, "authSchemes", js.Array(value*))
    }
  }
  
  trait ForceRefresh extends StObject {
    
    var forceRefresh: js.UndefOr[Boolean] = js.undefined
  }
  object ForceRefresh {
    
    inline def apply(): ForceRefresh = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForceRefresh]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ForceRefresh] (val x: Self) extends AnyVal {
      
      inline def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      inline def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{overrideInputFilterSensitiveLog (args : ...any): string | void, overrideOutputFilterSensitiveLog (args : ...any): string | void}> */
  trait PartialoverrideInputFilte extends StObject {
    
    var overrideInputFilterSensitiveLog: js.UndefOr[js.Function1[/* repeated */ Any, String | Unit]] = js.undefined
    
    var overrideOutputFilterSensitiveLog: js.UndefOr[js.Function1[/* repeated */ Any, String | Unit]] = js.undefined
  }
  object PartialoverrideInputFilte {
    
    inline def apply(): PartialoverrideInputFilte = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialoverrideInputFilte]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialoverrideInputFilte] (val x: Self) extends AnyVal {
      
      inline def setOverrideInputFilterSensitiveLog(value: /* repeated */ Any => String | Unit): Self = StObject.set(x, "overrideInputFilterSensitiveLog", js.Any.fromFunction1(value))
      
      inline def setOverrideInputFilterSensitiveLogUndefined: Self = StObject.set(x, "overrideInputFilterSensitiveLog", js.undefined)
      
      inline def setOverrideOutputFilterSensitiveLog(value: /* repeated */ Any => String | Unit): Self = StObject.set(x, "overrideOutputFilterSensitiveLog", js.Any.fromFunction1(value))
      
      inline def setOverrideOutputFilterSensitiveLogUndefined: Self = StObject.set(x, "overrideOutputFilterSensitiveLog", js.undefined)
    }
  }
}
