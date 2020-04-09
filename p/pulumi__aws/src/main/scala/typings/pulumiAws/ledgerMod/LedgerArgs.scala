package typings.pulumiAws.ledgerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LedgerArgs extends js.Object {
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

object LedgerArgs {
  @scala.inline
  def apply(
    deletionProtection: Input[Boolean] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): LedgerArgs = {
    val __obj = js.Dynamic.literal()
    if (deletionProtection != null) __obj.updateDynamic("deletionProtection")(deletionProtection.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerArgs]
  }
}

