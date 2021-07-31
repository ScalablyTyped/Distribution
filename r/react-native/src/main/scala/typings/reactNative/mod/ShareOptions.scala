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
  
  @scala.inline
  def apply(): ShareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareOptions]
  }
  
  @scala.inline
  implicit class ShareOptionsMutableBuilder[Self <: ShareOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialogTitle(value: String): Self = StObject.set(x, "dialogTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogTitleUndefined: Self = StObject.set(x, "dialogTitle", js.undefined)
    
    @scala.inline
    def setExcludedActivityTypes(value: js.Array[String]): Self = StObject.set(x, "excludedActivityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedActivityTypesUndefined: Self = StObject.set(x, "excludedActivityTypes", js.undefined)
    
    @scala.inline
    def setExcludedActivityTypesVarargs(value: String*): Self = StObject.set(x, "excludedActivityTypes", js.Array(value :_*))
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
  }
}
