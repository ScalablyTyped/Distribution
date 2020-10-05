package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.always
import typings.reactNative.reactNativeStrings.ifRoom
import typings.reactNative.reactNativeStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarAndroidAction extends js.Object {
  /**
    * icon: the icon for this action, e.g. require('./some_icon.png')
    */
  var icon: js.UndefOr[ImageURISource] = js.native
  /**
    * show: when to show this action as an icon or hide it in the overflow menu: always, ifRoom or never
    */
  var show: js.UndefOr[always | ifRoom | never] = js.native
  /**
    * showWithText: boolean, whether to show text alongside the icon or not
    */
  var showWithText: js.UndefOr[Boolean] = js.native
  /**
    *  title: required, the title of this action
    */
  var title: String = js.native
}

object ToolbarAndroidAction {
  @scala.inline
  def apply(title: String): ToolbarAndroidAction = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarAndroidAction]
  }
  @scala.inline
  implicit class ToolbarAndroidActionOps[Self <: ToolbarAndroidAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: ImageURISource): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setShow(value: always | ifRoom | never): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setShowWithText(value: Boolean): Self = this.set("showWithText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWithText: Self = this.set("showWithText", js.undefined)
  }
  
}

