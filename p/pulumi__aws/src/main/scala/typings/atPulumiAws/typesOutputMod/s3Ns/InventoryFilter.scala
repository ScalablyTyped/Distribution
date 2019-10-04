package typings.atPulumiAws.typesOutputMod.s3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryFilter extends js.Object {
  /**
    * The prefix that is prepended to all inventory results.
    */
  var prefix: js.UndefOr[String] = js.undefined
}

object InventoryFilter {
  @scala.inline
  def apply(prefix: String = null): InventoryFilter = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[InventoryFilter]
  }
}

