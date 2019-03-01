package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllocationStrategy extends js.Object {
  var allocationStrategy: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AllocationStrategy {
  @scala.inline
  def apply(allocationStrategy: java.lang.String = null): Anon_AllocationStrategy = {
    val __obj = js.Dynamic.literal()
    if (allocationStrategy != null) __obj.updateDynamic("allocationStrategy")(allocationStrategy)
    __obj.asInstanceOf[Anon_AllocationStrategy]
  }
}

