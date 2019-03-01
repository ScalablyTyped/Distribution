package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxAttributeExpressionValues extends js.Object {
  var qValues: js.Array[NxSimpleValue]
}

object NxAttributeExpressionValues {
  @scala.inline
  def apply(qValues: js.Array[NxSimpleValue]): NxAttributeExpressionValues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qValues")(qValues)
    __obj.asInstanceOf[NxAttributeExpressionValues]
  }
}

