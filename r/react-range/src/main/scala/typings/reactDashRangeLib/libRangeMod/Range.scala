package typings
package reactDashRangeLib.libRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range
  extends reactLib.reactMod.Component[reactDashRangeLib.libTypesMod.IProps, js.Object, js.Any] {
  @JSName("state")
  var state_Range: reactDashRangeLib.Anon_DraggedThumbIndex = js.native
  var trackRef: reactLib.reactMod.RefObject[stdLib.HTMLElement] = js.native
  def addMouseEvents(e: stdLib.MouseEvent): scala.Unit = js.native
  def addTouchEvents(e: stdLib.TouchEvent): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MRange(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MRange(prevProps: reactDashRangeLib.libTypesMod.IProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MRange(): scala.Unit = js.native
  def getOffsets(): js.Array[reactDashRangeLib.Anon_X] = js.native
  def getTargetIndex(e: stdLib.Event): scala.Double = js.native
  def getThumbs(): js.Array[stdLib.Element] = js.native
  def normalizeValue(value: scala.Double, index: scala.Double): scala.Double = js.native
  def onEnd(e: stdLib.Event): scala.Unit = js.native
  def onKeyDown(e: reactLib.reactMod.KeyboardEvent[stdLib.Element]): scala.Unit = js.native
  def onKeyUp(e: reactLib.reactMod.KeyboardEvent[stdLib.Element]): scala.Unit = js.native
  def onMouseDownTrack(e: reactLib.reactMod.MouseEvent[stdLib.Element, stdLib.MouseEvent]): scala.Unit = js.native
  def onMouseMove(e: stdLib.MouseEvent): scala.Unit = js.native
  def onMouseOrTouchStart(e: stdLib.MouseEvent with stdLib.TouchEvent): scala.Unit = js.native
  def onMove(clientX: scala.Double, clientY: scala.Double): js.UndefOr[scala.Null] = js.native
  def onTouchMove(e: stdLib.TouchEvent): scala.Unit = js.native
  def onTouchStartTrack(e: reactLib.reactMod.TouchEvent[stdLib.Element]): scala.Unit = js.native
  def onWindowResize(): scala.Unit = js.native
  def schdOnEnd(e: stdLib.Event): scala.Unit = js.native
  def schdOnMouseMove(e: stdLib.MouseEvent): scala.Unit = js.native
  def schdOnTouchMove(e: stdLib.TouchEvent): scala.Unit = js.native
  def schdOnWindowResize(): scala.Unit = js.native
}

