package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketVersioning extends js.Object {
  /**
    * Enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Enable MFA delete for either `Change the versioning state of your bucket` or `Permanently delete an object version`. Default is `false`. This cannot be used to toggle this setting but is available to allow managed buckets to reflect the state in AWS
    */
  var mfaDelete: js.UndefOr[Input[Boolean]] = js.native
}

object BucketVersioning {
  @scala.inline
  def apply(): BucketVersioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketVersioning]
  }
  @scala.inline
  implicit class BucketVersioningOps[Self <: BucketVersioning] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMfaDelete(value: Input[Boolean]): Self = this.set("mfaDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMfaDelete: Self = this.set("mfaDelete", js.undefined)
  }
  
}

