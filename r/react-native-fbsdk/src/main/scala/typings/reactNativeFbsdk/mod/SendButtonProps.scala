package typings.reactNativeFbsdk.mod

import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendButtonProps extends StObject {
  
  /**
    * Content to be shared.
    */
  var shareContent: ShareContent
  
  /**
    * View style, if any.
    */
  var style: js.UndefOr[ViewStyle] = js.undefined
}
object SendButtonProps {
  
  @scala.inline
  def apply(shareContent: ShareContent): SendButtonProps = {
    val __obj = js.Dynamic.literal(shareContent = shareContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendButtonProps]
  }
  
  @scala.inline
  implicit class SendButtonPropsMutableBuilder[Self <: SendButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShareContent(value: ShareContent): Self = StObject.set(x, "shareContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
