package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxInfo extends js.Object {
  var qId: String
  var qType: String
}

object NxInfo {
  @scala.inline
  def apply(qId: String, qType: String): NxInfo = {
    val __obj = js.Dynamic.literal(qId = qId.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxInfo]
  }
}

