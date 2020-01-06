package typings.atPulumiAws.getPrefixListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPrefixListArgs extends js.Object {
  /**
    * The name of the prefix list to select.
    */
  val name: js.UndefOr[String] = js.native
  /**
    * The ID of the prefix list to select.
    */
  val prefixListId: js.UndefOr[String] = js.native
}

object GetPrefixListArgs {
  @scala.inline
  def apply(name: String = null, prefixListId: String = null): GetPrefixListArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefixListId != null) __obj.updateDynamic("prefixListId")(prefixListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrefixListArgs]
  }
}

