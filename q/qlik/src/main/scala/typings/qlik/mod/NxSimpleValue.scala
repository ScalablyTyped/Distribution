package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxSimpleValue extends js.Object {
  var qNum: Double
  var qText: String
}

object NxSimpleValue {
  @scala.inline
  def apply(qNum: Double, qText: String): NxSimpleValue = {
    val __obj = js.Dynamic.literal(qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NxSimpleValue]
  }
}

