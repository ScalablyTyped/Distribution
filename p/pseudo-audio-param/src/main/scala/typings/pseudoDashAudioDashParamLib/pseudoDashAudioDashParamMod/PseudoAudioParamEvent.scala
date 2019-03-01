package typings
package pseudoDashAudioDashParamLib.pseudoDashAudioDashParamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoAudioParamEvent extends js.Object {
  var time: scala.Double
  var `type`: java.lang.String
}

object PseudoAudioParamEvent {
  @scala.inline
  def apply(time: scala.Double, `type`: java.lang.String): PseudoAudioParamEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[PseudoAudioParamEvent]
  }
}

