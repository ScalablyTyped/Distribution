package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxAttributeDimValues extends js.Object {
  var qValues: js.Array[NxSimpleDimValue]
}

object NxAttributeDimValues {
  @scala.inline
  def apply(qValues: js.Array[NxSimpleDimValue]): NxAttributeDimValues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qValues")(qValues)
    __obj.asInstanceOf[NxAttributeDimValues]
  }
}

