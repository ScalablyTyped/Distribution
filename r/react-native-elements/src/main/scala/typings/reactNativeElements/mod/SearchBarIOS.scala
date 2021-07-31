package typings.reactNativeElements.mod

import typings.reactNativeElements.anon.PartialTouchableOpacityPr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBarIOS
  extends StObject
     with SearchBarPlatform {
  
  /**
    * Props passed to cancel button
    */
  var cancelButtonProps: js.UndefOr[PartialTouchableOpacityPr] = js.undefined
  
  /**
    * title of cancel button on iOS.  Default: 'Cancel'.
    */
  var cancelButtonTitle: js.UndefOr[String] = js.undefined
  
  /**
    * When `true` the cancel button will stay visible after blur events.
    */
  var showCancel: js.UndefOr[Boolean] = js.undefined
}
object SearchBarIOS {
  
  @scala.inline
  def apply(): SearchBarIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarIOS]
  }
  
  @scala.inline
  implicit class SearchBarIOSMutableBuilder[Self <: SearchBarIOS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelButtonProps(value: PartialTouchableOpacityPr): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
    
    @scala.inline
    def setCancelButtonTitle(value: String): Self = StObject.set(x, "cancelButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonTitleUndefined: Self = StObject.set(x, "cancelButtonTitle", js.undefined)
    
    @scala.inline
    def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
  }
}
