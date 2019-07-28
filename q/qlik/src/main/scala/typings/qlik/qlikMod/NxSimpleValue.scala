package typings.qlik.qlikMod

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
    val __obj = js.Dynamic.literal(qNum = qNum, qText = qText)
  
    __obj.asInstanceOf[NxSimpleValue]
  }
}

