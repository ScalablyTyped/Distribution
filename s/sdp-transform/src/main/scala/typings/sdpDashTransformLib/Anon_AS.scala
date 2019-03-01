package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AS extends js.Object {
  var limit: scala.Double | java.lang.String
  var `type`: sdpDashTransformLib.sdpDashTransformLibStrings.TIAS | sdpDashTransformLib.sdpDashTransformLibStrings.AS | sdpDashTransformLib.sdpDashTransformLibStrings.CT | sdpDashTransformLib.sdpDashTransformLibStrings.RR | sdpDashTransformLib.sdpDashTransformLibStrings.RS
}

object Anon_AS {
  @scala.inline
  def apply(
    limit: scala.Double | java.lang.String,
    `type`: sdpDashTransformLib.sdpDashTransformLibStrings.TIAS | sdpDashTransformLib.sdpDashTransformLibStrings.AS | sdpDashTransformLib.sdpDashTransformLibStrings.CT | sdpDashTransformLib.sdpDashTransformLibStrings.RR | sdpDashTransformLib.sdpDashTransformLibStrings.RS
  ): Anon_AS = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AS]
  }
}

