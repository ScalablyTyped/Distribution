package typings
package smoothDashScrollbarLib.interfacesScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scrollbar extends js.Object {
  var bounding: ScrollbarBounding = js.native
  val containerEl: stdLib.HTMLElement = js.native
  val contentEl: stdLib.HTMLElement = js.native
  var limit: smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d = js.native
  var offset: smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d = js.native
  val options: ScrollbarOptions = js.native
  val parent: Scrollbar | scala.Null = js.native
  var scrollLeft: scala.Double = js.native
  var scrollTop: scala.Double = js.native
  var size: ScrollbarSize = js.native
  val track: smoothDashScrollbarLib.interfacesTrackMod.TrackController = js.native
  def addListener(fn: ScrollListener): scala.Unit = js.native
  def addMomentum(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def addTransformableMomentum(x: scala.Double, y: scala.Double, fromEvent: stdLib.Event): scala.Unit = js.native
  def addTransformableMomentum(
    x: scala.Double,
    y: scala.Double,
    fromEvent: stdLib.Event,
    callback: AddTransformableMomentumCallback
  ): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def getSize(): ScrollbarSize = js.native
  def isVisible(elem: stdLib.HTMLElement): scala.Boolean = js.native
  def removeListener(fn: ScrollListener): scala.Unit = js.native
  def scrollIntoView(elem: stdLib.HTMLElement): scala.Unit = js.native
  def scrollIntoView(elem: stdLib.HTMLElement, options: stdLib.Partial[ScrollIntoViewOptions]): scala.Unit = js.native
  def scrollTo(): scala.Unit = js.native
  def scrollTo(x: scala.Double): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double, duration: scala.Double): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double, duration: scala.Double, options: stdLib.Partial[ScrollToOptions]): scala.Unit = js.native
  def setMomentum(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setPosition(): scala.Unit = js.native
  def setPosition(x: scala.Double): scala.Unit = js.native
  def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setPosition(x: scala.Double, y: scala.Double, options: stdLib.Partial[SetPositionOptions]): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def updatePluginOptions(pluginName: java.lang.String): scala.Unit = js.native
  def updatePluginOptions(pluginName: java.lang.String, options: js.Any): scala.Unit = js.native
}

