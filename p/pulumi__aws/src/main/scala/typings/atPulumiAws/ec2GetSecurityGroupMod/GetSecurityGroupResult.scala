package typings.atPulumiAws.ec2GetSecurityGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.GetSecurityGroupFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecurityGroupResult extends js.Object {
  /**
    * The computed ARN of the security group.
    */
  val arn: String = js.native
  /**
    * The description of the security group.
    */
  val description: String = js.native
  val filters: js.UndefOr[js.Array[GetSecurityGroupFilter]] = js.native
  val id: String = js.native
  val name: String = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcId: String = js.native
}

object GetSecurityGroupResult {
  @scala.inline
  def apply(
    arn: String,
    description: String,
    id: String,
    name: String,
    tags: StringDictionary[js.Any],
    vpcId: String,
    filters: js.Array[GetSecurityGroupFilter] = null
  ): GetSecurityGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecurityGroupResult]
  }
}

