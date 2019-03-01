package typings
package atPulumiAwsLib.route53DelegationSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelegationSetArgs extends js.Object {
  /**
    * This is a reference name used in Caller Reference
    * (helpful for identifying single delegation set amongst others)
    */
  val referenceName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object DelegationSetArgs {
  @scala.inline
  def apply(referenceName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): DelegationSetArgs = {
    val __obj = js.Dynamic.literal()
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationSetArgs]
  }
}

