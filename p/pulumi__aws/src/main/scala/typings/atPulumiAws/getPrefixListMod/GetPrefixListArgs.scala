package typings.atPulumiAws.getPrefixListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPrefixListArgs extends js.Object {
  /**
    * The name of the prefix list to select.
    */
  val name: js.UndefOr[String] = js.undefined
  /**
    * The ID of the prefix list to select.
    */
  val prefixListId: js.UndefOr[String] = js.undefined
}

object GetPrefixListArgs {
  @scala.inline
  def apply(name: String = null, prefixListId: String = null): GetPrefixListArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefixListId != null) __obj.updateDynamic("prefixListId")(prefixListId)
    __obj.asInstanceOf[GetPrefixListArgs]
  }
}

