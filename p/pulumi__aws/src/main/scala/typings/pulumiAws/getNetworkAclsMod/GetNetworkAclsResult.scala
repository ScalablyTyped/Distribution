package typings.pulumiAws.getNetworkAclsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetNetworkAclsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkAclsResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetNetworkAclsFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * A list of all the network ACL ids found. This data source will fail if none are found.
    */
  val ids: js.Array[String] = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcId: js.UndefOr[String] = js.native
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkAclsResult]
  }
}

