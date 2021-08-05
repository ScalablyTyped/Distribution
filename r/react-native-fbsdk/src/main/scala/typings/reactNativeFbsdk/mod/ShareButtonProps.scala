package typings.reactNativeFbsdk.mod

import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareButtonProps extends StObject {
  
  /**
    * Content to be shared.
    */
  var shareContent: ShareContent
  
  /**
    * View style, if any.
    */
  var style: js.UndefOr[ViewStyle] = js.undefined
}
object ShareButtonProps {
  
  inline def apply(shareContent: ShareContent): ShareButtonProps = {
    val __obj = js.Dynamic.literal(shareContent = shareContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareButtonProps]
  }
  
  extension [Self <: ShareButtonProps](x: Self) {
    
    inline def setShareContent(value: ShareContent): Self = StObject.set(x, "shareContent", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
