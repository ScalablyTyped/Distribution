package typings.atPulumiAws.typesInputMod.workspaces

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpGroupRule extends js.Object {
  /**
    * The description.
    */
  var description: js.UndefOr[Input[String]] = js.native
  /**
    * The IP address range, in CIDR notation, e.g. `10.0.0.0/16`
    */
  var source: Input[String] = js.native
}

object IpGroupRule {
  @scala.inline
  def apply(source: Input[String], description: Input[String] = null): IpGroupRule = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpGroupRule]
  }
}

