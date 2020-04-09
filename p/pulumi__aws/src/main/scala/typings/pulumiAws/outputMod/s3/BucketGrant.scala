package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketGrant extends js.Object {
  /**
    * Canonical user id to grant for. Used only when `type` is `CanonicalUser`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * List of permissions to apply for grantee. Valid values are `READ`, `WRITE`, `READ_ACP`, `WRITE_ACP`, `FULL_CONTROL`.
    */
  var permissions: js.Array[String] = js.native
  /**
    * - Type of grantee to apply for. Valid values are `CanonicalUser` and `Group`. `AmazonCustomerByEmail` is not supported.
    */
  var `type`: String = js.native
  /**
    * Uri address to grant for. Used only when `type` is `Group`.
    */
  var uri: js.UndefOr[String] = js.native
}

object BucketGrant {
  @scala.inline
  def apply(permissions: js.Array[String], `type`: String, id: String = null, uri: String = null): BucketGrant = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketGrant]
  }
}

