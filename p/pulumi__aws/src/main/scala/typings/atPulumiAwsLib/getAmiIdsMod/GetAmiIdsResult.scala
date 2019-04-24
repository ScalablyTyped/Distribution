package typings
package atPulumiAwsLib.getAmiIdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAmiIdsResult extends js.Object {
  val executableUsers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val ids: js.Array[java.lang.String]
  val nameRegex: js.UndefOr[java.lang.String] = js.undefined
  val owners: js.Array[java.lang.String]
  val sortAscending: js.UndefOr[scala.Boolean] = js.undefined
}

object GetAmiIdsResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    ids: js.Array[java.lang.String],
    owners: js.Array[java.lang.String],
    executableUsers: js.Array[java.lang.String] = null,
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    nameRegex: java.lang.String = null,
    sortAscending: js.UndefOr[scala.Boolean] = js.undefined
  ): GetAmiIdsResult = {
    val __obj = js.Dynamic.literal(id = id, ids = ids, owners = owners)
    if (executableUsers != null) __obj.updateDynamic("executableUsers")(executableUsers)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (nameRegex != null) __obj.updateDynamic("nameRegex")(nameRegex)
    if (!js.isUndefined(sortAscending)) __obj.updateDynamic("sortAscending")(sortAscending)
    __obj.asInstanceOf[GetAmiIdsResult]
  }
}

