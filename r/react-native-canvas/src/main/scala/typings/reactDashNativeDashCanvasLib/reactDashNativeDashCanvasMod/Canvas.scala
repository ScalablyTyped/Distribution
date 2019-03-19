package typings
package reactDashNativeDashCanvasLib.reactDashNativeDashCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canvas
  extends reactLib.reactMod.Component[CanvasProps, js.Object, js.Any] {
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  def getContext(context: java.lang.String): CanvasRenderingContext2D = js.native
  def toDataURL(): java.lang.String = js.native
}

