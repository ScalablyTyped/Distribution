package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAttributeDimValues...
  */
trait INxAttributeDimValues extends js.Object {
  /**
    * List of values.
    */
  var qValues: js.Array[INxSimpleDimValue]
}

object INxAttributeDimValues {
  @scala.inline
  def apply(qValues: js.Array[INxSimpleDimValue]): INxAttributeDimValues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qValues")(qValues)
    __obj.asInstanceOf[INxAttributeDimValues]
  }
}

