package typings.pulumiAws.getSubnetIdsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetSubnetIdsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSubnetIdsArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetSubnetIdsFilter]] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired subnets.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The VPC ID that you want to filter from.
    */
  val vpcId: String = js.native
}

object GetSubnetIdsArgs {
  @scala.inline
  def apply(vpcId: String, filters: js.Array[GetSubnetIdsFilter] = null, tags: StringDictionary[js.Any] = null): GetSubnetIdsArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubnetIdsArgs]
  }
}

