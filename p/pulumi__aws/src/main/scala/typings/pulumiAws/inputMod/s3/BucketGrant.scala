package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketGrant extends js.Object {
  /**
    * Canonical user id to grant for. Used only when `type` is `CanonicalUser`.
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * List of permissions to apply for grantee. Valid values are `READ`, `WRITE`, `READ_ACP`, `WRITE_ACP`, `FULL_CONTROL`.
    */
  var permissions: Input[js.Array[Input[String]]] = js.native
  /**
    * - Type of grantee to apply for. Valid values are `CanonicalUser` and `Group`. `AmazonCustomerByEmail` is not supported.
    */
  var `type`: Input[String] = js.native
  /**
    * Uri address to grant for. Used only when `type` is `Group`.
    */
  var uri: js.UndefOr[Input[String]] = js.native
}

object BucketGrant {
  @scala.inline
  def apply(permissions: Input[js.Array[Input[String]]], `type`: Input[String]): BucketGrant = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketGrant]
  }
  @scala.inline
  implicit class BucketGrantOps[Self <: BucketGrant] (val x: Self) extends AnyVal {
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
    def setPermissionsVarargs(value: Input[String]*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: Input[js.Array[Input[String]]]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setUri(value: Input[String]): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

