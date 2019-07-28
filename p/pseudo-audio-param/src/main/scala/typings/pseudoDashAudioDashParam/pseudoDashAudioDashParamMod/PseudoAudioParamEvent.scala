package typings.pseudoDashAudioDashParam.pseudoDashAudioDashParamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoAudioParamEvent extends js.Object {
  var time: Double
  var `type`: String
}

object PseudoAudioParamEvent {
  @scala.inline
  def apply(time: Double, `type`: String): PseudoAudioParamEvent = {
    val __obj = js.Dynamic.literal(time = time)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PseudoAudioParamEvent]
  }
}

