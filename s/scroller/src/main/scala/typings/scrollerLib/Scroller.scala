package typings
package scrollerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Scroller")
@js.native
class Scroller protected () extends js.Object {
  def this(callback: js.Function3[/* left */ scala.Double, /* top */ scala.Double, /* zoom */ scala.Double, scala.Unit]) = this()
  def this(callback: js.Function3[/* left */ scala.Double, /* top */ scala.Double, /* zoom */ scala.Double, scala.Unit], options: scrollerLib.ScrollerNs.Options) = this()
  def activatePullToRefresh(
    height: scala.Double,
    activate: js.Function0[scala.Unit],
    deactivate: js.Function0[scala.Unit],
    start: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def doMouseZoom(wheelData: scala.Double, timeStamp: scala.Double, pageX: scala.Double, pageY: scala.Double): scala.Unit = js.native
  def doTouchEnd(timeStamp: scala.Double): scala.Unit = js.native
  def doTouchMove(touches: js.Array[Anon_PageX], timeStamp: scala.Double): scala.Unit = js.native
  def doTouchMove(touches: js.Array[Anon_PageX], timeStamp: scala.Double, scale: scala.Double): scala.Unit = js.native
  def doTouchStart(touches: js.Array[Anon_PageX], timeStamp: scala.Double): scala.Unit = js.native
  def finishPullToRefresh(): scala.Unit = js.native
  def getScrollMax(): Anon_LeftTop = js.native
  def getValues(): Anon_Left = js.native
  def scrollBy(leftOffset: scala.Double, topOffset: scala.Double): scala.Unit = js.native
  def scrollBy(leftOffset: scala.Double, topOffset: scala.Double, animate: scala.Boolean): scala.Unit = js.native
  def scrollTo(left: scala.Double, top: scala.Double): scala.Unit = js.native
  def scrollTo(left: scala.Double, top: scala.Double, animate: scala.Boolean): scala.Unit = js.native
  def scrollTo(left: scala.Double, top: scala.Double, animate: scala.Boolean, zoom: scala.Double): scala.Unit = js.native
  def setDimensions(
    clientWidth: scala.Double,
    clientHeight: scala.Double,
    contentWidth: scala.Double,
    contentHeight: scala.Double
  ): scala.Unit = js.native
  def setPosition(clientLeft: scala.Double, clientTop: scala.Double): scala.Unit = js.native
  def setSnapSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def zoomBy(factor: scala.Double): scala.Unit = js.native
  def zoomBy(factor: scala.Double, animate: scala.Boolean): scala.Unit = js.native
  def zoomBy(factor: scala.Double, animate: scala.Boolean, originLeft: scala.Double): scala.Unit = js.native
  def zoomBy(factor: scala.Double, animate: scala.Boolean, originLeft: scala.Double, originTop: scala.Double): scala.Unit = js.native
  def zoomBy(
    factor: scala.Double,
    animate: scala.Boolean,
    originLeft: scala.Double,
    originTop: scala.Double,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def zoomTo(level: scala.Double): scala.Unit = js.native
  def zoomTo(level: scala.Double, animate: scala.Boolean): scala.Unit = js.native
  def zoomTo(level: scala.Double, animate: scala.Boolean, originLeft: scala.Double): scala.Unit = js.native
  def zoomTo(level: scala.Double, animate: scala.Boolean, originLeft: scala.Double, originTop: scala.Double): scala.Unit = js.native
  def zoomTo(
    level: scala.Double,
    animate: scala.Boolean,
    originLeft: scala.Double,
    originTop: scala.Double,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

