package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComputeEnvironment extends js.Object {
  var computeEnvironment: java.lang.String
  var order: scala.Double
}

object Anon_ComputeEnvironment {
  @scala.inline
  def apply(computeEnvironment: java.lang.String, order: scala.Double): Anon_ComputeEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("computeEnvironment")(computeEnvironment)
    __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[Anon_ComputeEnvironment]
  }
}

