package typings.reactNativeShare.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareSheetProps extends js.Object {
  var children: ReactNode = js.native
  var overlayStyle: js.UndefOr[StyleProp[ViewProps]] = js.native
  var style: js.UndefOr[StyleProp[ViewProps]] = js.native
  var visible: Boolean = js.native
  def onCancel(): Unit = js.native
}

object ShareSheetProps {
  @scala.inline
  def apply(onCancel: () => Unit, visible: Boolean): ShareSheetProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareSheetProps]
  }
  @scala.inline
  implicit class ShareSheetPropsOps[Self <: ShareSheetProps] (val x: Self) extends AnyVal {
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
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setOverlayStyle(value: StyleProp[ViewProps]): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setOverlayStyleNull: Self = this.set("overlayStyle", null)
    @scala.inline
    def setStyle(value: StyleProp[ViewProps]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

