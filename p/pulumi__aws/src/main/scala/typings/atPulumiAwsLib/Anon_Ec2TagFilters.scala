package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ec2TagFilters extends js.Object {
  var ec2TagFilters: js.UndefOr[js.Array[Anon_KeyTypeValueString]] = js.undefined
}

object Anon_Ec2TagFilters {
  @scala.inline
  def apply(ec2TagFilters: js.Array[Anon_KeyTypeValueString] = null): Anon_Ec2TagFilters = {
    val __obj = js.Dynamic.literal()
    if (ec2TagFilters != null) __obj.updateDynamic("ec2TagFilters")(ec2TagFilters)
    __obj.asInstanceOf[Anon_Ec2TagFilters]
  }
}

