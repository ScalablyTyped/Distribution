package typings.reactDnd.interfacesMod

import typings.reactDnd.connectorsMod.ConnectDragPreview
import typings.reactDnd.connectorsMod.ConnectDragSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragSourceConnector extends js.Object {
  /**
    * Optional. Returns a function that may be used inside the component to assign the drag preview role to a node. By
    * returning { connectDragPreview: connect.dragPreview() } from your collecting function, you can mark any React element
    * as the drag preview node. To do that, replace any element with this.props.connectDragPreview(element) inside the render
    * function. The drag preview is the node that will be screenshotted by the HTML5 backend when the drag begins. For example,
    * if you want to make something draggable by a small custom handle, you can mark this handle as the dragSource(), but also
    * mark an outer, larger component node as the dragPreview(). Thus the larger drag preview appears on the screenshot, but
    * only the smaller drag source is actually draggable. Another possible customization is passing an Image instance to dragPreview
    * from a lifecycle method like componentDidMount. This lets you use the actual images for drag previews. (Note that IE does not
    * support this customization). See the example code below for the different usage examples.
    */
  def dragPreview(): ConnectDragPreview = js.native
  /**
    * Returns a function that must be used inside the component to assign the drag source role to a node. By
    * returning { connectDragSource: connect.dragSource() } from your collecting function, you can mark any React
    * element as the draggable node. To do that, replace any element with this.props.connectDragSource(element) inside
    * the render function.
    */
  def dragSource(): ConnectDragSource = js.native
}

object DragSourceConnector {
  @scala.inline
  def apply(dragPreview: () => ConnectDragPreview, dragSource: () => ConnectDragSource): DragSourceConnector = {
    val __obj = js.Dynamic.literal(dragPreview = js.Any.fromFunction0(dragPreview), dragSource = js.Any.fromFunction0(dragSource))
    __obj.asInstanceOf[DragSourceConnector]
  }
  @scala.inline
  implicit class DragSourceConnectorOps[Self <: DragSourceConnector] (val x: Self) extends AnyVal {
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
    def setDragPreview(value: () => ConnectDragPreview): Self = this.set("dragPreview", js.Any.fromFunction0(value))
    @scala.inline
    def setDragSource(value: () => ConnectDragSource): Self = this.set("dragSource", js.Any.fromFunction0(value))
  }
  
}

