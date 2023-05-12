package typings.primereact.apiApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIOptions extends StObject {
  
  var appendTo: js.UndefOr[AppendToType] = js.undefined
  
  var autoZIndex: js.UndefOr[Boolean] = js.undefined
  
  var changeTheme: js.UndefOr[
    js.Function4[
      /* theme */ js.UndefOr[String], 
      /* newTheme */ js.UndefOr[String], 
      /* linkElementId */ js.UndefOr[String], 
      /* callback */ js.UndefOr[js.Function0[Unit]], 
      Unit
    ]
  ] = js.undefined
  
  var cssTransition: js.UndefOr[Boolean] = js.undefined
  
  var filterMatchModeOptions: js.UndefOr[FilterMatchModeOptions] = js.undefined
  
  var inputStyle: js.UndefOr[InputStyleType] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var nullSortOrder: js.UndefOr[Double] = js.undefined
  
  var ripple: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[ZIndexOptions] = js.undefined
}
object APIOptions {
  
  inline def apply(): APIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APIOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: APIOptions] (val x: Self) extends AnyVal {
    
    inline def setAppendTo(value: AppendToType): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToNull: Self = StObject.set(x, "appendTo", null)
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
    
    inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
    
    inline def setChangeTheme(
      value: (/* theme */ js.UndefOr[String], /* newTheme */ js.UndefOr[String], /* linkElementId */ js.UndefOr[String], /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit
    ): Self = StObject.set(x, "changeTheme", js.Any.fromFunction4(value))
    
    inline def setChangeThemeUndefined: Self = StObject.set(x, "changeTheme", js.undefined)
    
    inline def setCssTransition(value: Boolean): Self = StObject.set(x, "cssTransition", value.asInstanceOf[js.Any])
    
    inline def setCssTransitionUndefined: Self = StObject.set(x, "cssTransition", js.undefined)
    
    inline def setFilterMatchModeOptions(value: FilterMatchModeOptions): Self = StObject.set(x, "filterMatchModeOptions", value.asInstanceOf[js.Any])
    
    inline def setFilterMatchModeOptionsUndefined: Self = StObject.set(x, "filterMatchModeOptions", js.undefined)
    
    inline def setInputStyle(value: InputStyleType): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setNullSortOrder(value: Double): Self = StObject.set(x, "nullSortOrder", value.asInstanceOf[js.Any])
    
    inline def setNullSortOrderUndefined: Self = StObject.set(x, "nullSortOrder", js.undefined)
    
    inline def setRipple(value: Boolean): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
    
    inline def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
    
    inline def setZIndex(value: ZIndexOptions): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
