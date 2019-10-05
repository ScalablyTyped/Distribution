package typings.atPulumiAws.ec2GetNetworkAclsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.GetNetworkAclsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkAclsResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetNetworkAclsFilter]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * A list of all the network ACL ids found. This data source will fail if none are found.
    */
  val ids: js.Array[String]
  val tags: StringDictionary[js.Any]
  val vpcId: js.UndefOr[String] = js.undefined
}

object GetNetworkAclsResult {
  @scala.inline
  def apply(
    id: String,
    ids: js.Array[String],
    tags: StringDictionary[js.Any],
    filters: js.Array[GetNetworkAclsFilter] = null,
    vpcId: String = null
  ): GetNetworkAclsResult = {
    val __obj = js.Dynamic.literal(id = id, ids = ids, tags = tags)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[GetNetworkAclsResult]
  }
}

