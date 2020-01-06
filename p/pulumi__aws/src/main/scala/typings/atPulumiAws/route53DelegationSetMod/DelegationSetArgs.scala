package typings.atPulumiAws.route53DelegationSetMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegationSetArgs extends js.Object {
  /**
    * This is a reference name used in Caller Reference
    * (helpful for identifying single delegation set amongst others)
    */
  val referenceName: js.UndefOr[Input[String]] = js.native
}

object DelegationSetArgs {
  @scala.inline
  def apply(referenceName: Input[String] = null): DelegationSetArgs = {
    val __obj = js.Dynamic.literal()
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationSetArgs]
  }
}

