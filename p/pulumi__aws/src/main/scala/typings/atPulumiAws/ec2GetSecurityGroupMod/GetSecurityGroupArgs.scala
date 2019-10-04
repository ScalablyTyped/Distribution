package typings.atPulumiAws.ec2GetSecurityGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2Ns.GetSecurityGroupFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecurityGroupArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetSecurityGroupFilter]] = js.undefined
  /**
    * The id of the specific security group to retrieve.
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html).
    */
  val name: js.UndefOr[String] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired security group.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The id of the VPC that the desired security group belongs to.
    */
  val vpcId: js.UndefOr[String] = js.undefined
}

object GetSecurityGroupArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetSecurityGroupFilter] = null,
    id: String = null,
    name: String = null,
    tags: StringDictionary[js.Any] = null,
    vpcId: String = null
  ): GetSecurityGroupArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[GetSecurityGroupArgs]
  }
}

