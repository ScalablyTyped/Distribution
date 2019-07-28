package typings.atPulumiAws.ec2GetSecurityGroupsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecurityGroupsResult extends js.Object {
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * IDs of the matches security groups.
    */
  val ids: js.Array[String]
  val tags: StringDictionary[js.Any]
  /**
    * The VPC IDs of the matched security groups. The data source's tag or filter *will span VPCs*
    * unless the `vpc-id` filter is also used.
    */
  val vpcIds: js.Array[String]
}

object GetSecurityGroupsResult {
  @scala.inline
  def apply(
    id: String,
    ids: js.Array[String],
    tags: StringDictionary[js.Any],
    vpcIds: js.Array[String],
    filters: js.Array[Anon_NameValues] = null
  ): GetSecurityGroupsResult = {
    val __obj = js.Dynamic.literal(id = id, ids = ids, tags = tags, vpcIds = vpcIds)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetSecurityGroupsResult]
  }
}

