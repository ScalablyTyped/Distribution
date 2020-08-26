package typings.pulumiAws.inputMod.macie

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3BucketAssociationClassificationType extends js.Object {
  /**
    * A string value indicating that Macie perform a one-time classification of all of the existing objects in the bucket.
    * The only valid value is the default value, `FULL`.
    */
  var continuous: js.UndefOr[Input[String]] = js.native
  /**
    * A string value indicating whether or not Macie performs a one-time classification of all of the existing objects in the bucket.
    * Valid values are `NONE` and `FULL`. Defaults to `NONE` indicating that Macie only classifies objects that are added after the association was created.
    */
  var oneTime: js.UndefOr[Input[String]] = js.native
}

object S3BucketAssociationClassificationType {
  @scala.inline
  def apply(): S3BucketAssociationClassificationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketAssociationClassificationType]
  }
  @scala.inline
  implicit class S3BucketAssociationClassificationTypeOps[Self <: S3BucketAssociationClassificationType] (val x: Self) extends AnyVal {
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
    def setContinuous(value: Input[String]): Self = this.set("continuous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuous: Self = this.set("continuous", js.undefined)
    @scala.inline
    def setOneTime(value: Input[String]): Self = this.set("oneTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneTime: Self = this.set("oneTime", js.undefined)
  }
  
}

