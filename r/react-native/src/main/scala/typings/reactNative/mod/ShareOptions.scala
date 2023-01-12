package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareOptions extends StObject {
  
  var dialogTitle: js.UndefOr[String] = js.undefined
  
  var excludedActivityTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var tintColor: js.UndefOr[ColorValue] = js.undefined
}
object ShareOptions {
  
  inline def apply(): ShareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShareOptions] (val x: Self) extends AnyVal {
    
    inline def setDialogTitle(value: String): Self = StObject.set(x, "dialogTitle", value.asInstanceOf[js.Any])
    
    inline def setDialogTitleUndefined: Self = StObject.set(x, "dialogTitle", js.undefined)
    
    inline def setExcludedActivityTypes(value: js.Array[String]): Self = StObject.set(x, "excludedActivityTypes", value.asInstanceOf[js.Any])
    
    inline def setExcludedActivityTypesUndefined: Self = StObject.set(x, "excludedActivityTypes", js.undefined)
    
    inline def setExcludedActivityTypesVarargs(value: String*): Self = StObject.set(x, "excludedActivityTypes", js.Array(value*))
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
  }
}
