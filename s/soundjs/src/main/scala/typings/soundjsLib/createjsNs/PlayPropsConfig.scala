package typings
package soundjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.PlayPropsConfig")
@js.native
class PlayPropsConfig () extends js.Object {
  var delay: scala.Double = js.native
  var duration: scala.Double = js.native
  var interrupt: java.lang.String = js.native
  var loop: scala.Double = js.native
  var offset: scala.Double = js.native
  var pan: scala.Double = js.native
  var startTime: scala.Double = js.native
  var volume: scala.Double = js.native
  def set(props: js.Any): PlayPropsConfig = js.native
}

@JSGlobal("createjs.PlayPropsConfig")
@js.native
object PlayPropsConfig extends js.Object {
  def create(value: js.Any): soundjsLib.createjsNs.PlayPropsConfig = js.native
  def create(value: soundjsLib.createjsNs.PlayPropsConfig): soundjsLib.createjsNs.PlayPropsConfig = js.native
}

