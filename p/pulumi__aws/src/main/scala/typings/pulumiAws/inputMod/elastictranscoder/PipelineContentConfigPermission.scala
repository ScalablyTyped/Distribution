package typings.pulumiAws.inputMod.elastictranscoder

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineContentConfigPermission extends js.Object {
  /**
    * The permission that you want to give to the AWS user that you specified in `content_config_permissions.grantee`
    */
  var accesses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The AWS user or group that you want to have access to transcoded files and playlists.
    */
  var grantee: js.UndefOr[Input[String]] = js.native
  /**
    * Specify the type of value that appears in the `content_config_permissions.grantee` object. Valid values are `Canonical`, `Email` or `Group`.
    */
  var granteeType: js.UndefOr[Input[String]] = js.native
}

object PipelineContentConfigPermission {
  @scala.inline
  def apply(): PipelineContentConfigPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineContentConfigPermission]
  }
  @scala.inline
  implicit class PipelineContentConfigPermissionOps[Self <: PipelineContentConfigPermission] (val x: Self) extends AnyVal {
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
    def setAccessesVarargs(value: Input[String]*): Self = this.set("accesses", js.Array(value :_*))
    @scala.inline
    def setAccesses(value: Input[js.Array[Input[String]]]): Self = this.set("accesses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccesses: Self = this.set("accesses", js.undefined)
    @scala.inline
    def setGrantee(value: Input[String]): Self = this.set("grantee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantee: Self = this.set("grantee", js.undefined)
    @scala.inline
    def setGranteeType(value: Input[String]): Self = this.set("granteeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranteeType: Self = this.set("granteeType", js.undefined)
  }
  
}

