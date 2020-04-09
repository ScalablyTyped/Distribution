package typings.pulumiAws.getPrefixListMod

import typings.pulumiAws.inputMod.GetPrefixListFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPrefixListArgs extends js.Object {
  /**
    * Configuration block(s) for filtering. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetPrefixListFilter]] = js.native
  /**
    * The name of the filter field. Valid values can be found in the [EC2 DescribePrefixLists API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribePrefixLists.html).
    */
  val name: js.UndefOr[String] = js.native
  /**
    * The ID of the prefix list to select.
    */
  val prefixListId: js.UndefOr[String] = js.native
}

object GetPrefixListArgs {
  @scala.inline
  def apply(filters: js.Array[GetPrefixListFilter] = null, name: String = null, prefixListId: String = null): GetPrefixListArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefixListId != null) __obj.updateDynamic("prefixListId")(prefixListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrefixListArgs]
  }
}

