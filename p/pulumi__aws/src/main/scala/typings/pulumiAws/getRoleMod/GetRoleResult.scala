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
    * The provider-assigned unique ID for this managed resource.
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
  val tags: StringDictionary[String] = js.native
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
    tags: StringDictionary[String],
    uniqueId: String
  ): GetRoleResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], assumeRolePolicy = assumeRolePolicy.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxSessionDuration = maxSessionDuration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permissionsBoundary = permissionsBoundary.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoleResult]
  }
  @scala.inline
  implicit class GetRoleResultOps[Self <: GetRoleResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssumeRolePolicy(value: String): Self = this.set("assumeRolePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateDate(value: String): Self = this.set("createDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSessionDuration(value: Double): Self = this.set("maxSessionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionsBoundary(value: String): Self = this.set("permissionsBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueId(value: String): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
  }
  
}

