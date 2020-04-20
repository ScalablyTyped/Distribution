package typings.pulumiAws.getRoleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoleResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the role.
    */
  val arn: String = js.native
  /**
    * The policy document associated with the role.
    */
  val assumeRolePolicy: String = js.native
  /**
    * Creation date of the role in RFC 3339 format.
    */
  val createDate: String = js.native
  /**
    * Description for the role.
    */
  val description: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Maximum session duration.
    */
  val maxSessionDuration: Double = js.native
  val name: String = js.native
  /**
    * The path to the role.
    */
  val path: String = js.native
  /**
    * The ARN of the policy that is used to set the permissions boundary for the role.
    */
  val permissionsBoundary: String = js.native
  /**
    * The tags attached to the role.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * The stable and unique string identifying the role.
    */
  val uniqueId: String = js.native
}

object GetRoleResult {
  @scala.inline
  def apply(
    arn: String,
    assumeRolePolicy: String,
    createDate: String,
    description: String,
    id: String,
    maxSessionDuration: Double,
    name: String,
    path: String,
    permissionsBoundary: String,
    tags: StringDictionary[js.Any],
    uniqueId: String
  ): GetRoleResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], assumeRolePolicy = assumeRolePolicy.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxSessionDuration = maxSessionDuration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permissionsBoundary = permissionsBoundary.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoleResult]
  }
}

