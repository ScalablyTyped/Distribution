package typings.atPulumiAws.ec2GetSubnetIdsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSubnetIdsArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired subnets.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The VPC ID that you want to filter from.
    */
  val vpcId: String
}

object GetSubnetIdsArgs {
  @scala.inline
  def apply(vpcId: String, filters: js.Array[Anon_NameValues] = null, tags: StringDictionary[js.Any] = null): GetSubnetIdsArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetSubnetIdsArgs]
  }
}

