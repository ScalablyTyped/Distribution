package typings.reactDashNativeDashCanvas.reactDashNativeDashCanvasMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canvas
  extends Component[CanvasProps, js.Object, js.Any] {
  var height: Double = js.native
  var width: Double = js.native
  def getContext(context: String): CanvasRenderingContext2D = js.native
  def toDataURL(): String = js.native
}

