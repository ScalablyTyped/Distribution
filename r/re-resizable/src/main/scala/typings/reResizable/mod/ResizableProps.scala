package typings.reResizable.mod

import typings.reResizable.anon.X
import typings.reResizable.reResizableStrings.parent
import typings.reResizable.reResizableStrings.window
import typings.reResizable.resizerMod.Direction
import typings.react.mod.CSSProperties
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizableProps extends js.Object {
  var bounds: js.UndefOr[parent | window | HTMLElement] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var defaultSize: js.UndefOr[Size] = js.native
  var enable: js.UndefOr[Enable] = js.native
  var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var handleClasses: js.UndefOr[HandleClassName] = js.native
  var handleComponent: js.UndefOr[HandleComponent] = js.native
  var handleStyles: js.UndefOr[HandleStyles] = js.native
  var handleWrapperClass: js.UndefOr[String] = js.native
  var handleWrapperStyle: js.UndefOr[CSSProperties] = js.native
  var lockAspectRatio: js.UndefOr[Boolean | Double] = js.native
  var lockAspectRatioExtraHeight: js.UndefOr[Double] = js.native
  var lockAspectRatioExtraWidth: js.UndefOr[Double] = js.native
  var maxHeight: js.UndefOr[String | Double] = js.native
  var maxWidth: js.UndefOr[String | Double] = js.native
  var minHeight: js.UndefOr[String | Double] = js.native
  var minWidth: js.UndefOr[String | Double] = js.native
  var onResize: js.UndefOr[ResizeCallback] = js.native
  var onResizeStart: js.UndefOr[ResizeStartCallback] = js.native
  var onResizeStop: js.UndefOr[ResizeCallback] = js.native
  var resizeRatio: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Size] = js.native
  var snap: js.UndefOr[X] = js.native
  var snapGap: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object ResizableProps {
  @scala.inline
  def apply(): ResizableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizableProps]
  }
  @scala.inline
  implicit class ResizablePropsOps[Self <: ResizableProps] (val x: Self) extends AnyVal {
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
    def setBounds(value: parent | window | HTMLElement): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefaultSize(value: Size): Self = this.set("defaultSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSize: Self = this.set("defaultSize", js.undefined)
    @scala.inline
    def setEnable(value: Enable): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setGrid(value: js.Tuple2[Double, Double]): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHandleClasses(value: HandleClassName): Self = this.set("handleClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleClasses: Self = this.set("handleClasses", js.undefined)
    @scala.inline
    def setHandleComponent(value: HandleComponent): Self = this.set("handleComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleComponent: Self = this.set("handleComponent", js.undefined)
    @scala.inline
    def setHandleStyles(value: HandleStyles): Self = this.set("handleStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleStyles: Self = this.set("handleStyles", js.undefined)
    @scala.inline
    def setHandleWrapperClass(value: String): Self = this.set("handleWrapperClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleWrapperClass: Self = this.set("handleWrapperClass", js.undefined)
    @scala.inline
    def setHandleWrapperStyle(value: CSSProperties): Self = this.set("handleWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleWrapperStyle: Self = this.set("handleWrapperStyle", js.undefined)
    @scala.inline
    def setLockAspectRatio(value: Boolean | Double): Self = this.set("lockAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockAspectRatio: Self = this.set("lockAspectRatio", js.undefined)
    @scala.inline
    def setLockAspectRatioExtraHeight(value: Double): Self = this.set("lockAspectRatioExtraHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockAspectRatioExtraHeight: Self = this.set("lockAspectRatioExtraHeight", js.undefined)
    @scala.inline
    def setLockAspectRatioExtraWidth(value: Double): Self = this.set("lockAspectRatioExtraWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockAspectRatioExtraWidth: Self = this.set("lockAspectRatioExtraWidth", js.undefined)
    @scala.inline
    def setMaxHeight(value: String | Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: String | Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: String | Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: String | Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOnResize(
      value: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLDivElement, /* delta */ NumberSize) => Unit
    ): Self = this.set("onResize", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setOnResizeStart(
      value: (/* e */ (typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent]) | typings.react.mod.TouchEvent[HTMLDivElement], /* dir */ Direction, /* elementRef */ HTMLDivElement) => Unit | Boolean
    ): Self = this.set("onResizeStart", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnResizeStart: Self = this.set("onResizeStart", js.undefined)
    @scala.inline
    def setOnResizeStop(
      value: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLDivElement, /* delta */ NumberSize) => Unit
    ): Self = this.set("onResizeStop", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnResizeStop: Self = this.set("onResizeStop", js.undefined)
    @scala.inline
    def setResizeRatio(value: Double): Self = this.set("resizeRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeRatio: Self = this.set("resizeRatio", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSnap(value: X): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setSnapGap(value: Double): Self = this.set("snapGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapGap: Self = this.set("snapGap", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

