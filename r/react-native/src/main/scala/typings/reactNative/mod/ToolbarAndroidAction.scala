package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.always
import typings.reactNative.reactNativeStrings.ifRoom
import typings.reactNative.reactNativeStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarAndroidAction extends StObject {
  
  /**
    * icon: the icon for this action, e.g. require('./some_icon.png')
    */
  var icon: js.UndefOr[ImageURISource] = js.undefined
  
  /**
    * show: when to show this action as an icon or hide it in the overflow menu: always, ifRoom or never
    */
  var show: js.UndefOr[always | ifRoom | never] = js.undefined
  
  /**
    * showWithText: boolean, whether to show text alongside the icon or not
    */
  var showWithText: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  title: required, the title of this action
    */
  var title: String
}
object ToolbarAndroidAction {
  
  @scala.inline
  def apply(title: String): ToolbarAndroidAction = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarAndroidAction]
  }
  
  @scala.inline
  implicit class ToolbarAndroidActionMutableBuilder[Self <: ToolbarAndroidAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: ImageURISource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setShow(value: always | ifRoom | never): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setShowWithText(value: Boolean): Self = StObject.set(x, "showWithText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWithTextUndefined: Self = StObject.set(x, "showWithText", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
