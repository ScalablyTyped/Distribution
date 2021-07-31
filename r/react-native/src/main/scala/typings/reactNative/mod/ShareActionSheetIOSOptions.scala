package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareActionSheetIOSOptions extends StObject {
  
  /** The activities to exclude from the ActionSheet.
    * For example: ['com.apple.UIKit.activity.PostToTwitter']
    */
  var excludedActivityTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object ShareActionSheetIOSOptions {
  
  @scala.inline
  def apply(): ShareActionSheetIOSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareActionSheetIOSOptions]
  }
  
  @scala.inline
  implicit class ShareActionSheetIOSOptionsMutableBuilder[Self <: ShareActionSheetIOSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedActivityTypes(value: js.Array[String]): Self = StObject.set(x, "excludedActivityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedActivityTypesUndefined: Self = StObject.set(x, "excludedActivityTypes", js.undefined)
    
    @scala.inline
    def setExcludedActivityTypesVarargs(value: String*): Self = StObject.set(x, "excludedActivityTypes", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
