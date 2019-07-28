package typings.atPulumiAws.ec2GetSecurityGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecurityGroupResult extends js.Object {
  /**
    * The computed ARN of the security group.
    */
  val arn: String
  /**
    * The description of the security group.
    */
  val description: String
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  val id: String
  val name: String
  val tags: StringDictionary[js.Any]
  val vpcId: String
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
    filters: js.Array[Anon_NameValues] = null
  ): GetSecurityGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn, description = description, id = id, name = name, tags = tags, vpcId = vpcId)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetSecurityGroupResult]
  }
}

