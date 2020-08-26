package typings.protonNative.mod

import typings.protonNative.anon.W
import typings.protonNative.anon.Y
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowProps extends js.Object {
  /**
    * Whether the window will have a border on the inside.
    */
  var borderless: js.UndefOr[Boolean] = js.native
  /**
    * Window can only have one child. To have more than one child, use boxes.
    */
  var children: js.UndefOr[Element] = js.native
  /**
    * Whether the window is closed. If set to closed, then the window will be closed.
    */
  var closed: js.UndefOr[Boolean] = js.native
  /**
    * Whether the window will be fullscreen on start.
    */
  var fullscreen: js.UndefOr[Boolean] = js.native
  /**
    * Whether the window is the last window. If set to `true`, then the program will quit once the window is closed.
    */
  var lastWindow: js.UndefOr[Boolean] = js.native
  /**
    * Whether all children will have a margin around them and the outer edge of the window.
    */
  var margined: js.UndefOr[Boolean] = js.native
  /**
    * Whether a menubar will be shown on the top of the window.
    */
  var menuBar: js.UndefOr[Boolean] = js.native
  /**
    * Called when the window is closed.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when the window size is changed by the user. The new size is passed as an argument, in an object.
    */
  var onContentSizeChange: js.UndefOr[js.Function1[/* size */ Y, Unit]] = js.native
  /**
    * How big the window is when the application is first started.
    */
  var size: js.UndefOr[W] = js.native
  /**
    * The title of the window. Will be shown at the top left ribbon.
    */
  var title: js.UndefOr[String] = js.native
}

object WindowProps {
  @scala.inline
  def apply(): WindowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowProps]
  }
  @scala.inline
  implicit class WindowPropsOps[Self <: WindowProps] (val x: Self) extends AnyVal {
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
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    @scala.inline
    def setChildren(value: Element): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    @scala.inline
    def setLastWindow(value: Boolean): Self = this.set("lastWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastWindow: Self = this.set("lastWindow", js.undefined)
    @scala.inline
    def setMargined(value: Boolean): Self = this.set("margined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargined: Self = this.set("margined", js.undefined)
    @scala.inline
    def setMenuBar(value: Boolean): Self = this.set("menuBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuBar: Self = this.set("menuBar", js.undefined)
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnContentSizeChange(value: /* size */ Y => Unit): Self = this.set("onContentSizeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContentSizeChange: Self = this.set("onContentSizeChange", js.undefined)
    @scala.inline
    def setSize(value: W): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

