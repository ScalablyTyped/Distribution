package typings.reactGridLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends js.Object {
  /**
    * Height in grid units.
    */
  var h: Double = js.native
  /**
    * A string corresponding to the component key.
    * Uses the index of components instead if not provided.
    */
  var i: String = js.native
  /**
    * If false, will not be draggable. Overrides `static`.
    */
  var isDraggable: js.UndefOr[Boolean] = js.native
  /**
    * If false, will not be resizable. Overrides `static`.
    */
  var isResizable: js.UndefOr[Boolean] = js.native
  /**
    * Maximum height in grid units.
    */
  var maxH: js.UndefOr[Double] = js.native
  /**
    * Maximum width in grid units.
    */
  var maxW: js.UndefOr[Double] = js.native
  /**
    * Minimum height in grid units.
    */
  var minH: js.UndefOr[Double] = js.native
  /**
    * Minimum width in grid units.
    */
  var minW: js.UndefOr[Double] = js.native
  /**
    * set by DragEvents (onDragStart, onDrag, onDragStop) and ResizeEvents (onResizeStart, onResize, onResizeStop)
    */
  var moved: js.UndefOr[Boolean] = js.native
  /**
    * If true, equal to `isDraggable: false` and `isResizable: false`.
    */
  var static: js.UndefOr[Boolean] = js.native
  /**
    * Width in grid units.
    */
  var w: Double = js.native
  /**
    * X position in grid units.
    */
  var x: Double = js.native
  /**
    * Y position in grid units.
    */
  var y: Double = js.native
}

object Layout {
  @scala.inline
  def apply(h: Double, i: String, w: Double, x: Double, y: Double): Layout = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
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
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setI(value: String): Self = this.set("i", value.asInstanceOf[js.Any])
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDraggable(value: Boolean): Self = this.set("isDraggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDraggable: Self = this.set("isDraggable", js.undefined)
    @scala.inline
    def setIsResizable(value: Boolean): Self = this.set("isResizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResizable: Self = this.set("isResizable", js.undefined)
    @scala.inline
    def setMaxH(value: Double): Self = this.set("maxH", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxH: Self = this.set("maxH", js.undefined)
    @scala.inline
    def setMaxW(value: Double): Self = this.set("maxW", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxW: Self = this.set("maxW", js.undefined)
    @scala.inline
    def setMinH(value: Double): Self = this.set("minH", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinH: Self = this.set("minH", js.undefined)
    @scala.inline
    def setMinW(value: Double): Self = this.set("minW", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinW: Self = this.set("minW", js.undefined)
    @scala.inline
    def setMoved(value: Boolean): Self = this.set("moved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoved: Self = this.set("moved", js.undefined)
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
  }
  
}

