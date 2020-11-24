package typings.reactResizable.mod

import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizableProps extends js.Object {
  
  var axis: js.UndefOr[Axis] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var draggableOpts: js.UndefOr[js.Any] = js.native
  
  var handle: js.UndefOr[ReactNode | (js.Function1[/* resizeHandle */ ResizeHandle, ReactNode])] = js.native
  
  var handleSize: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var height: Double = js.native
  
  var lockAspectRatio: js.UndefOr[Boolean] = js.native
  
  var maxConstraints: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var minConstraints: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var onResize: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData, _]
  ] = js.native
  
  var onResizeStart: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData, _]
  ] = js.native
  
  var onResizeStop: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData, _]
  ] = js.native
  
  var resizeHandles: js.UndefOr[js.Array[ResizeHandle]] = js.native
  
  var width: Double = js.native
}
object ResizableProps {
  
  @scala.inline
  def apply(height: Double, width: Double): ResizableProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxis(value: Axis): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDraggableOpts(value: js.Any): Self = this.set("draggableOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableOpts: Self = this.set("draggableOpts", js.undefined)
    
    @scala.inline
    def setHandleFunction1(value: /* resizeHandle */ ResizeHandle => ReactNode): Self = this.set("handle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandle(value: ReactNode | (js.Function1[/* resizeHandle */ ResizeHandle, ReactNode])): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    
    @scala.inline
    def setHandleSize(value: js.Tuple2[Double, Double]): Self = this.set("handleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleSize: Self = this.set("handleSize", js.undefined)
    
    @scala.inline
    def setLockAspectRatio(value: Boolean): Self = this.set("lockAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockAspectRatio: Self = this.set("lockAspectRatio", js.undefined)
    
    @scala.inline
    def setMaxConstraints(value: js.Tuple2[Double, Double]): Self = this.set("maxConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConstraints: Self = this.set("maxConstraints", js.undefined)
    
    @scala.inline
    def setMinConstraints(value: js.Tuple2[Double, Double]): Self = this.set("minConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinConstraints: Self = this.set("minConstraints", js.undefined)
    
    @scala.inline
    def setOnResize(value: (/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData) => _): Self = this.set("onResize", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setOnResizeStart(value: (/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData) => _): Self = this.set("onResizeStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnResizeStart: Self = this.set("onResizeStart", js.undefined)
    
    @scala.inline
    def setOnResizeStop(value: (/* e */ SyntheticEvent[Element, Event], /* data */ ResizeCallbackData) => _): Self = this.set("onResizeStop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnResizeStop: Self = this.set("onResizeStop", js.undefined)
    
    @scala.inline
    def setResizeHandlesVarargs(value: ResizeHandle*): Self = this.set("resizeHandles", js.Array(value :_*))
    
    @scala.inline
    def setResizeHandles(value: js.Array[ResizeHandle]): Self = this.set("resizeHandles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeHandles: Self = this.set("resizeHandles", js.undefined)
  }
}
