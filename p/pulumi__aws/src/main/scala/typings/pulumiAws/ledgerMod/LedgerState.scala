package typings.pulumiAws.ledgerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LedgerState extends js.Object {
  /**
    * The ARN of the QLDB Ledger
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via this provider, this value must be configured to `false` and applied first before attempting deletion.
    */
  val deletionProtection: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The friendly name for the QLDB Ledger instance.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object LedgerState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    deletionProtection: Input[Boolean] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): LedgerState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (deletionProtection != null) __obj.updateDynamic("deletionProtection")(deletionProtection.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerState]
  }
}

