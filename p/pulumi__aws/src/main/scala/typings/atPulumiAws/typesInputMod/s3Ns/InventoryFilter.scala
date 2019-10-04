package typings.atPulumiAws.typesInputMod.s3Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryFilter extends js.Object {
  /**
    * The prefix that is prepended to all inventory results.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
}

object InventoryFilter {
  @scala.inline
  def apply(prefix: Input[String] = null): InventoryFilter = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryFilter]
  }
}

