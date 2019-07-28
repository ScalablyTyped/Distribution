package typings.sdpDashTransform

import typings.sdpDashTransform.sdpDashTransformStrings.AS
import typings.sdpDashTransform.sdpDashTransformStrings.CT
import typings.sdpDashTransform.sdpDashTransformStrings.RR
import typings.sdpDashTransform.sdpDashTransformStrings.RS
import typings.sdpDashTransform.sdpDashTransformStrings.TIAS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AS extends js.Object {
  var limit: Double | String
  var `type`: TIAS | AS | CT | RR | RS
}

object Anon_AS {
  @scala.inline
  def apply(limit: Double | String, `type`: TIAS | AS | CT | RR | RS): Anon_AS = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AS]
  }
}

