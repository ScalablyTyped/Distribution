package typings.reduxDevtoolsDockMonitor.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDockMonitorProps extends js.Object {
  /**
    * A key or a key combination that switches the currently visible monitor.
    * Must be recognizable by parse-key (for example, 'ctrl-m')
    * Required if you use more than one monitor.
    *
    * @default undefined
    */
  var changeMonitorKey: js.UndefOr[String] = js.native
  /**
    * A key or a key combination that toggles the dock position.
    * Must be recognizable by parse-key (for example, 'ctrl-w')
    */
  var changePositionKey: String = js.native
  /**
    * Any valid Redux DevTools monitor.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * @default true
    */
  var defaultIsVisible: js.UndefOr[Boolean] = js.native
  /**
    * Where the dock appears on the screen.
    * Valid values: 'left', 'top', 'right', 'bottom'
    *
    * @default 'right'
    */
  var defaultPosition: js.UndefOr[DockPosition] = js.native
  /**
    * Size of the dock. When fluid is true, a float (0.5 means half the window size).
    * When fluid is false, a width in pixels
    *
    * @default 0.3 (3/10th of the window size)
    */
  var defaultSize: js.UndefOr[Double] = js.native
  /**
    * When true, the dock size is a fraction of the window size, fixed otherwise.
    *
    * @default true
    */
  var fluid: js.UndefOr[Boolean] = js.native
  /**
    * A key or a key combination that toggles the dock visibility.
    * Must be recognizable by parse-key (for example, 'ctrl-h')
    */
  var toggleVisibilityKey: String = js.native
}

object IDockMonitorProps {
  @scala.inline
  def apply(changePositionKey: String, toggleVisibilityKey: String): IDockMonitorProps = {
    val __obj = js.Dynamic.literal(changePositionKey = changePositionKey.asInstanceOf[js.Any], toggleVisibilityKey = toggleVisibilityKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDockMonitorProps]
  }
  @scala.inline
  implicit class IDockMonitorPropsOps[Self <: IDockMonitorProps] (val x: Self) extends AnyVal {
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
    def setChangePositionKey(value: String): Self = this.set("changePositionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setToggleVisibilityKey(value: String): Self = this.set("toggleVisibilityKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeMonitorKey(value: String): Self = this.set("changeMonitorKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeMonitorKey: Self = this.set("changeMonitorKey", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDefaultIsVisible(value: Boolean): Self = this.set("defaultIsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultIsVisible: Self = this.set("defaultIsVisible", js.undefined)
    @scala.inline
    def setDefaultPosition(value: DockPosition): Self = this.set("defaultPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPosition: Self = this.set("defaultPosition", js.undefined)
    @scala.inline
    def setDefaultSize(value: Double): Self = this.set("defaultSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSize: Self = this.set("defaultSize", js.undefined)
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
  }
  
}

