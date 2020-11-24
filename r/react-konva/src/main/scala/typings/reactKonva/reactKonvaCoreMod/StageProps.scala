package typings.reactKonva.reactKonvaCoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.konva.mod.Konva.KonvaEventObject
import typings.konva.nodeMod.Filter
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.globalCompositeOperationType
import typings.konva.typesMod.Vector2d
import typings.react.mod.CSSProperties
import typings.std.DragEvent
import typings.std.Event
import typings.std.MouseEvent
import typings.std.Number
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent konva.konva.default.NodeConfig */
/* Inlined parent react-konva.react-konva/lib/ReactKonvaCore.KonvaNodeEvents */
/* Inlined parent std.Pick<react.react.HTMLProps<any>, 'className' | 'role' | 'style' | 'tabIndex' | 'title'> */
@js.native
trait StageProps
  extends /* index */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.native
  
  var dragBoundFunc: js.UndefOr[js.ThisFunction1[/* this */ Node[this.type], /* pos */ Vector2d, Vector2d]] = js.native
  
  var dragDistance: js.UndefOr[Double] = js.native
  
  var draggable: js.UndefOr[Boolean] = js.native
  
  var filters: js.UndefOr[js.Array[Filter]] = js.native
  
  var globalCompositeOperation: js.UndefOr[globalCompositeOperationType] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var listening: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Vector2d] = js.native
  
  var offsetX: js.UndefOr[Double] = js.native
  
  var offsetY: js.UndefOr[Double] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onContentClick: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var onContentDblclick: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var onContentDbltap: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var onContentMousedown: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var onContentMousemove: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var onContentMouseout: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var onContentMouseover: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var onContentMouseup: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var onContentTap: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var onContentTouchend: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var onContentTouchmove: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var onContentTouchstart: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var onContentWheel: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
  
  var onContextMenu: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[PointerEvent], Unit]] = js.native
  
  var onDblClick: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onDblTap: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
  
  var onDragEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.native
  
  var onDragMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.native
  
  var onDragStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.native
  
  var onMouseDown: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onMouseEnter: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onMouseLeave: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onMouseMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onMouseOut: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onMouseOver: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onMouseUp: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onTap: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
  
  var onTouchEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.native
  
  var onTouchMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.native
  
  var onTouchStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.native
  
  var onTransform: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
  
  var onTransformEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
  
  var onTransformStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
  
  var onWheel: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[WheelEvent], Unit]] = js.native
  
  var opacity: js.UndefOr[Number] = js.native
  
  var preventDefault: js.UndefOr[Boolean] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var rotationDeg: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[Vector2d] = js.native
  
  var scaleX: js.UndefOr[Double] = js.native
  
  var scaleY: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object StageProps {
  
  @scala.inline
  def apply(): StageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageProps]
  }
  
  @scala.inline
  implicit class StagePropsOps[Self <: StageProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDragBoundFunc(value: js.ThisFunction1[/* this */ Node[StageProps], /* pos */ Vector2d, Vector2d]): Self = this.set("dragBoundFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragBoundFunc: Self = this.set("dragBoundFunc", js.undefined)
    
    @scala.inline
    def setDragDistance(value: Double): Self = this.set("dragDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragDistance: Self = this.set("dragDistance", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[Filter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setGlobalCompositeOperation(value: globalCompositeOperationType): Self = this.set("globalCompositeOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalCompositeOperation: Self = this.set("globalCompositeOperation", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setListening(value: Boolean): Self = this.set("listening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListening: Self = this.set("listening", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOffset(value: Vector2d): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnContentClick(value: /* evt */ js.Any => Unit): Self = this.set("onContentClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentClick: Self = this.set("onContentClick", js.undefined)
    
    @scala.inline
    def setOnContentDblclick(value: /* evt */ js.Any => Unit): Self = this.set("onContentDblclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentDblclick: Self = this.set("onContentDblclick", js.undefined)
    
    @scala.inline
    def setOnContentDbltap(value: /* evt */ js.Any => Unit): Self = this.set("onContentDbltap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentDbltap: Self = this.set("onContentDbltap", js.undefined)
    
    @scala.inline
    def setOnContentMousedown(value: /* evt */ js.Any => Unit): Self = this.set("onContentMousedown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentMousedown: Self = this.set("onContentMousedown", js.undefined)
    
    @scala.inline
    def setOnContentMousemove(value: /* evt */ js.Any => Unit): Self = this.set("onContentMousemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentMousemove: Self = this.set("onContentMousemove", js.undefined)
    
    @scala.inline
    def setOnContentMouseout(value: /* evt */ js.Any => Unit): Self = this.set("onContentMouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentMouseout: Self = this.set("onContentMouseout", js.undefined)
    
    @scala.inline
    def setOnContentMouseover(value: /* evt */ js.Any => Unit): Self = this.set("onContentMouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentMouseover: Self = this.set("onContentMouseover", js.undefined)
    
    @scala.inline
    def setOnContentMouseup(value: /* evt */ js.Any => Unit): Self = this.set("onContentMouseup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentMouseup: Self = this.set("onContentMouseup", js.undefined)
    
    @scala.inline
    def setOnContentTap(value: /* evt */ js.Any => Unit): Self = this.set("onContentTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentTap: Self = this.set("onContentTap", js.undefined)
    
    @scala.inline
    def setOnContentTouchend(value: /* evt */ js.Any => Unit): Self = this.set("onContentTouchend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentTouchend: Self = this.set("onContentTouchend", js.undefined)
    
    @scala.inline
    def setOnContentTouchmove(value: /* evt */ js.Any => Unit): Self = this.set("onContentTouchmove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentTouchmove: Self = this.set("onContentTouchmove", js.undefined)
    
    @scala.inline
    def setOnContentTouchstart(value: /* evt */ js.Any => Unit): Self = this.set("onContentTouchstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentTouchstart: Self = this.set("onContentTouchstart", js.undefined)
    
    @scala.inline
    def setOnContentWheel(value: /* evt */ js.Any => Unit): Self = this.set("onContentWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentWheel: Self = this.set("onContentWheel", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: /* evt */ KonvaEventObject[PointerEvent] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnDblClick(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onDblClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDblClick: Self = this.set("onDblClick", js.undefined)
    
    @scala.inline
    def setOnDblTap(value: /* evt */ KonvaEventObject[Event] => Unit): Self = this.set("onDblTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDblTap: Self = this.set("onDblTap", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragMove(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = this.set("onDragMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragMove: Self = this.set("onDragMove", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnTap(value: /* evt */ KonvaEventObject[Event] => Unit): Self = this.set("onTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTap: Self = this.set("onTap", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransform(value: /* evt */ KonvaEventObject[Event] => Unit): Self = this.set("onTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransform: Self = this.set("onTransform", js.undefined)
    
    @scala.inline
    def setOnTransformEnd(value: /* evt */ KonvaEventObject[Event] => Unit): Self = this.set("onTransformEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransformEnd: Self = this.set("onTransformEnd", js.undefined)
    
    @scala.inline
    def setOnTransformStart(value: /* evt */ KonvaEventObject[Event] => Unit): Self = this.set("onTransformStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransformStart: Self = this.set("onTransformStart", js.undefined)
    
    @scala.inline
    def setOnWheel(value: /* evt */ KonvaEventObject[WheelEvent] => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    
    @scala.inline
    def setOpacity(value: Number): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setRotationDeg(value: Double): Self = this.set("rotationDeg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationDeg: Self = this.set("rotationDeg", js.undefined)
    
    @scala.inline
    def setScale(value: Vector2d): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
