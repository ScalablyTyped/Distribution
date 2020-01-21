package typings.pulumiAws.receiptFilterMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptFilterArgs extends js.Object {
  /**
    * The IP address or address range to filter, in CIDR notation
    */
  val cidr: Input[String] = js.native
  /**
    * The name of the filter
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Block or Allow
    */
  val policy: Input[String] = js.native
}

object ReceiptFilterArgs {
  @scala.inline
  def apply(cidr: Input[String], policy: Input[String], name: Input[String] = null): ReceiptFilterArgs = {
    val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptFilterArgs]
  }
}

