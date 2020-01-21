package typings.pulumiAws.receiptFilterMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptFilterState extends js.Object {
  /**
    * The IP address or address range to filter, in CIDR notation
    */
  val cidr: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the filter
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Block or Allow
    */
  val policy: js.UndefOr[Input[String]] = js.native
}

object ReceiptFilterState {
  @scala.inline
  def apply(cidr: Input[String] = null, name: Input[String] = null, policy: Input[String] = null): ReceiptFilterState = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptFilterState]
  }
}

