package typings.pulumiAws.getAmiIdsMod

import typings.pulumiAws.outputMod.GetAmiIdsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAmiIdsResult extends js.Object {
  val executableUsers: js.UndefOr[js.Array[String]] = js.native
  val filters: js.UndefOr[js.Array[GetAmiIdsFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val ids: js.Array[String] = js.native
  val nameRegex: js.UndefOr[String] = js.native
  val owners: js.Array[String] = js.native
  val sortAscending: js.UndefOr[Boolean] = js.native
}

object GetAmiIdsResult {
  @scala.inline
  def apply(
    id: String,
    ids: js.Array[String],
    owners: js.Array[String],
    executableUsers: js.Array[String] = null,
    filters: js.Array[GetAmiIdsFilter] = null,
    nameRegex: String = null,
    sortAscending: js.UndefOr[Boolean] = js.undefined
  ): GetAmiIdsResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any])
    if (executableUsers != null) __obj.updateDynamic("executableUsers")(executableUsers.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (nameRegex != null) __obj.updateDynamic("nameRegex")(nameRegex.asInstanceOf[js.Any])
    if (!js.isUndefined(sortAscending)) __obj.updateDynamic("sortAscending")(sortAscending.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiIdsResult]
  }
}

