package typings
package rcDashSwipeoutLib.esSwipeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Swipeout
  extends reactLib.reactMod.Component[rcDashSwipeoutLib.esPropTypesMod.IPropTypes, js.Any, js.Any] {
  var btnsLeftWidth: scala.Double = js.native
  var btnsRightWidth: scala.Double = js.native
  var content: js.Any = js.native
  var cover: js.Any = js.native
  var left: js.Any = js.native
  var needShowLeft: scala.Boolean = js.native
  var needShowRight: scala.Boolean = js.native
  var openedLeft: scala.Boolean = js.native
  var openedRight: scala.Boolean = js.native
  var right: js.Any = js.native
  var swiping: scala.Boolean = js.native
  def _getContentEasing(value: js.Any, limit: js.Any): js.Any = js.native
  def _setStyle(value: js.Any): scala.Unit = js.native
  def close(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSwipeout(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSwipeout(): scala.Unit = js.native
  def doOpenLeft(): scala.Unit = js.native
  def doOpenRight(): scala.Unit = js.native
  def onBtnClick(ev: js.Any, btn: js.Any): scala.Unit = js.native
  def onCloseSwipe(ev: js.Any): scala.Unit = js.native
  def onPanEnd(e: js.Any): scala.Unit = js.native
  def onPanMove(e: js.Any): scala.Unit = js.native
  def onPanStart(e: js.Any): scala.Unit = js.native
  def onTouchMove(e: js.Any): scala.Unit = js.native
  def open(value: js.Any, openedLeft: js.Any, openedRight: js.Any): scala.Unit = js.native
  def renderButtons(buttons: js.Any, ref: js.Any): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
}

