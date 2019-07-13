package typings
package reactDashMovableLib.libListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[Value]
  extends reactLib.reactMod.Component[reactDashMovableLib.libTypesMod.IProps[Value], js.Object, js.Any] {
  var afterIndex: scala.Double = js.native
  var ghostRef: reactLib.reactMod.RefObject[stdLib.HTMLElement] = js.native
  var initialYOffset: scala.Double = js.native
  var itemTranslateOffsets: js.Array[scala.Double] = js.native
  var lastScroll: scala.Double = js.native
  var listRef: reactLib.reactMod.RefObject[stdLib.HTMLElement] = js.native
  var needle: scala.Double = js.native
  @JSName("state")
  var state_List: reactDashMovableLib.Anon_InitialX = js.native
  var topOffsets: js.Array[scala.Double] = js.native
  def animateItems(needle: scala.Double, movedItem: scala.Double, offset: scala.Double): scala.Unit = js.native
  def animateItems(
    needle: scala.Double,
    movedItem: scala.Double,
    offset: scala.Double,
    animateMovedItem: scala.Boolean
  ): scala.Unit = js.native
  def autoScrolling(clientY: scala.Double): scala.Unit = js.native
  def calculateOffsets(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MList(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MList(_prevProps: js.Any, prevState: reactDashMovableLib.Anon_ScrollingSpeed): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MList(): scala.Unit = js.native
  def doScrolling(): scala.Unit = js.native
  def getChildren(): js.Array[stdLib.Element] = js.native
  def getTargetIndex(e: reactDashMovableLib.libTypesMod.TEvent): scala.Double = js.native
  def getYOffset(): scala.Double = js.native
  def isDraggedItemOutOfBounds(): scala.Boolean = js.native
  def moveOtherItems(): scala.Unit = js.native
  def onEnd(e: stdLib.TouchEvent with stdLib.MouseEvent): scala.Unit = js.native
  def onKeyDown(e: reactLib.reactMod.KeyboardEvent[stdLib.Element]): scala.Unit = js.native
  def onMouseMove(e: stdLib.MouseEvent): scala.Unit = js.native
  def onMouseOrTouchStart(e: stdLib.MouseEvent with stdLib.TouchEvent): scala.Unit = js.native
  def onMove(clientX: scala.Double, clientY: scala.Double): js.UndefOr[scala.Null] = js.native
  def onStart(target: stdLib.HTMLElement, clientX: scala.Double, clientY: scala.Double, index: scala.Double): scala.Unit = js.native
  def onTouchMove(e: stdLib.TouchEvent): scala.Unit = js.native
  def onWheel(e: reactLib.reactMod.WheelEvent[stdLib.Element]): scala.Unit = js.native
  def schdOnEnd(e: stdLib.Event): scala.Unit = js.native
  def schdOnMouseMove(e: stdLib.MouseEvent): scala.Unit = js.native
  def schdOnTouchMove(e: stdLib.TouchEvent): scala.Unit = js.native
}

