package typings.pulumiAws.iamGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupState extends js.Object {
  /**
    * The ARN assigned by AWS for this group.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The group's name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. Group names are not distinguished by case. For example, you cannot create groups named both "ADMINS" and "admins".
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Path in which to create the group.
    */
  val path: js.UndefOr[Input[String]] = js.native
  /**
    * The [unique ID][1] assigned by AWS.
    */
  val uniqueId: js.UndefOr[Input[String]] = js.native
}

object GroupState {
  @scala.inline
  def apply(): GroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupState]
  }
  @scala.inline
  implicit class GroupStateOps[Self <: GroupState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setUniqueId(value: Input[String]): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueId: Self = this.set("uniqueId", js.undefined)
  }
  
}

