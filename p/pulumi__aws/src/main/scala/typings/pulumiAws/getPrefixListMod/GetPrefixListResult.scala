package typings.pulumiAws.getPrefixListMod

import typings.pulumiAws.outputMod.GetPrefixListFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPrefixListResult extends js.Object {
  /**
    * The list of CIDR blocks for the AWS service associated with the prefix list.
    */
  val cidrBlocks: js.Array[String] = js.native
  val filters: js.UndefOr[js.Array[GetPrefixListFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The name of the selected prefix list.
    */
  val name: String = js.native
  val prefixListId: js.UndefOr[String] = js.native
}

object GetPrefixListResult {
  @scala.inline
  def apply(
    cidrBlocks: js.Array[String],
    id: String,
    name: String,
    filters: js.Array[GetPrefixListFilter] = null,
    prefixListId: String = null
  ): GetPrefixListResult = {
    val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (prefixListId != null) __obj.updateDynamic("prefixListId")(prefixListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrefixListResult]
  }
}

