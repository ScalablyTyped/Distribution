package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketVersioning extends js.Object {
  /**
    * Boolean which indicates if this criteria is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Enable MFA delete for either `Change the versioning state of your bucket` or `Permanently delete an object version`. Default is `false`.
    */
  var mfaDelete: js.UndefOr[Boolean] = js.native
}

object BucketVersioning {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, mfaDelete: js.UndefOr[Boolean] = js.undefined): BucketVersioning = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(mfaDelete)) __obj.updateDynamic("mfaDelete")(mfaDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketVersioning]
  }
}

