package typings.reactEasyCrop.mod

import typings.react.mod.Component
import typings.reactEasyCrop.anon.X
import typings.reactEasyCrop.typesMod.MediaSize
import typings.reactEasyCrop.typesMod.Point
import typings.std.DOMRect
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLImageElement
import typings.std.HTMLStyleElement
import typings.std.HTMLVideoElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cropper
  extends Component[Props, State, js.Any] {
  var containerRect: DOMRect | Null = js.native
  var containerRef: HTMLDivElement | Null = js.native
  var dragStartCrop: Point = js.native
  var dragStartPosition: Point = js.native
  var imageRef: HTMLImageElement | Null = js.native
  var lastPinchDistance: Double = js.native
  var lastPinchRotation: Double = js.native
  var mediaSize: MediaSize = js.native
  var rafDragTimeout: Double | Null = js.native
  var rafPinchTimeout: Double | Null = js.native
  var styleRef: HTMLStyleElement | Null = js.native
  var videoRef: HTMLVideoElement | Null = js.native
  var wheelTimer: Double | Null = js.native
  def cleanEvents(): Unit = js.native
  def clearScrollEvent(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCropper(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCropper(prevProps: Props): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCropper(): Unit = js.native
  def computeSizes(): Unit = js.native
  def emitCropData(): Unit = js.native
  def getAspect(): Double = js.native
  def getPointOnContainer(hasXY: Point): X = js.native
  def getPointOnMedia(hasXY: Point): X = js.native
  def onDrag(hasXY: Point): Unit = js.native
  def onDragStart(hasXY: Point): Unit = js.native
  def onDragStopped(): Unit = js.native
  def onMediaLoad(): Unit = js.native
  def onMouseDown(e: typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent]): Unit = js.native
  def onMouseMove(e: MouseEvent): Unit = js.native
  def onPinchMove(e: TouchEvent): Unit = js.native
  def onPinchStart(e: typings.react.mod.TouchEvent[HTMLDivElement]): Unit = js.native
  def onTouchMove(e: TouchEvent): Unit = js.native
  def onTouchStart(e: typings.react.mod.TouchEvent[HTMLDivElement]): Unit = js.native
  def onWheel(e: WheelEvent): Unit = js.native
  def preventZoomSafari(e: Event): Unit = js.native
  def recomputeCropPosition(): Unit = js.native
  def setInitialCrop(): Unit = js.native
  def setNewZoom(zoom: Double, point: Point): Unit = js.native
}

