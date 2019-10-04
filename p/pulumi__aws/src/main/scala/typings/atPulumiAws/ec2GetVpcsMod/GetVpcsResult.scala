package typings.atPulumiAws.ec2GetVpcsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2Ns.GetVpcsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcsResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetVpcsFilter]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * A list of all the VPC Ids found. This data source will fail if none are found.
    */
  val ids: js.Array[String]
  val tags: StringDictionary[js.Any]
}

object GetVpcsResult {
  @scala.inline
  def apply(
    id: String,
    ids: js.Array[String],
    tags: StringDictionary[js.Any],
    filters: js.Array[GetVpcsFilter] = null
  ): GetVpcsResult = {
    val __obj = js.Dynamic.literal(id = id, ids = ids, tags = tags)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetVpcsResult]
  }
}

