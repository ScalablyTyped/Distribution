package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxSimpleDimValue extends js.Object {
  var qElemNo: Double
  var qText: String
}

object NxSimpleDimValue {
  @scala.inline
  def apply(qElemNo: Double, qText: String): NxSimpleDimValue = {
    val __obj = js.Dynamic.literal(qElemNo = qElemNo.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NxSimpleDimValue]
  }
}

