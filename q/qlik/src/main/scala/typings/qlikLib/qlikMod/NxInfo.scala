package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxInfo extends js.Object {
  var qId: java.lang.String
  var qType: java.lang.String
}

object NxInfo {
  @scala.inline
  def apply(qId: java.lang.String, qType: java.lang.String): NxInfo = {
    val __obj = js.Dynamic.literal(qId = qId, qType = qType)
  
    __obj.asInstanceOf[NxInfo]
  }
}

