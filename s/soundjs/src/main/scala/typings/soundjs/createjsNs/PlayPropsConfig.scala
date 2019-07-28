package typings.soundjs.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.PlayPropsConfig")
@js.native
class PlayPropsConfig () extends js.Object {
  var delay: Double = js.native
  var duration: Double = js.native
  var interrupt: String = js.native
  var loop: Double = js.native
  var offset: Double = js.native
  var pan: Double = js.native
  var startTime: Double = js.native
  var volume: Double = js.native
  def set(props: js.Any): PlayPropsConfig = js.native
}

/* static members */
@JSGlobal("createjs.PlayPropsConfig")
@js.native
object PlayPropsConfig extends js.Object {
  def create(value: js.Any): PlayPropsConfig = js.native
  def create(value: PlayPropsConfig): PlayPropsConfig = js.native
}

