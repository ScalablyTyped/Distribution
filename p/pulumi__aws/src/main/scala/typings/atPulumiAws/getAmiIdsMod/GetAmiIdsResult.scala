package typings.atPulumiAws.getAmiIdsMod

import typings.atPulumiAws.typesOutputMod.GetAmiIdsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAmiIdsResult extends js.Object {
  val executableUsers: js.UndefOr[js.Array[String]] = js.undefined
  val filters: js.UndefOr[js.Array[GetAmiIdsFilter]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val ids: js.Array[String]
  val nameRegex: js.UndefOr[String] = js.undefined
  val owners: js.Array[String]
  val sortAscending: js.UndefOr[Boolean] = js.undefined
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
    val __obj = js.Dynamic.literal(id = id, ids = ids, owners = owners)
    if (executableUsers != null) __obj.updateDynamic("executableUsers")(executableUsers)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (nameRegex != null) __obj.updateDynamic("nameRegex")(nameRegex)
    if (!js.isUndefined(sortAscending)) __obj.updateDynamic("sortAscending")(sortAscending)
    __obj.asInstanceOf[GetAmiIdsResult]
  }
}

