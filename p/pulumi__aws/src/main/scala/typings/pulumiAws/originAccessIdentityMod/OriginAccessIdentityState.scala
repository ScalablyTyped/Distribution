package typings.pulumiAws.originAccessIdentityMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginAccessIdentityState extends js.Object {
  /**
    * Internal value used by CloudFront to allow future
    * updates to the origin access identity.
    */
  val callerReference: js.UndefOr[Input[String]] = js.native
  /**
    * A shortcut to the full path for the
    * origin access identity to use in CloudFront, see below.
    */
  val cloudfrontAccessIdentityPath: js.UndefOr[Input[String]] = js.native
  /**
    * An optional comment for the origin access identity.
    */
  val comment: js.UndefOr[Input[String]] = js.native
  /**
    * The current version of the origin access identity's information.
    * For example: `E2QWRUHAPOMQZL`.
    */
  val etag: js.UndefOr[Input[String]] = js.native
  /**
    * A pre-generated ARN for use in S3 bucket policies (see below).
    * Example: `arn:aws:iam::cloudfront:user/CloudFront Origin Access Identity
    * E2QWRUHAPOMQZL`.
    */
  val iamArn: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon S3 canonical user ID for the origin
    * access identity, which you use when giving the origin access identity read
    * permission to an object in Amazon S3.
    */
  val s3CanonicalUserId: js.UndefOr[Input[String]] = js.native
}

object OriginAccessIdentityState {
  @scala.inline
  def apply(): OriginAccessIdentityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginAccessIdentityState]
  }
  @scala.inline
  implicit class OriginAccessIdentityStateOps[Self <: OriginAccessIdentityState] (val x: Self) extends AnyVal {
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
    def setCallerReference(value: Input[String]): Self = this.set("callerReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallerReference: Self = this.set("callerReference", js.undefined)
    @scala.inline
    def setCloudfrontAccessIdentityPath(value: Input[String]): Self = this.set("cloudfrontAccessIdentityPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudfrontAccessIdentityPath: Self = this.set("cloudfrontAccessIdentityPath", js.undefined)
    @scala.inline
    def setComment(value: Input[String]): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setEtag(value: Input[String]): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setIamArn(value: Input[String]): Self = this.set("iamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamArn: Self = this.set("iamArn", js.undefined)
    @scala.inline
    def setS3CanonicalUserId(value: Input[String]): Self = this.set("s3CanonicalUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3CanonicalUserId: Self = this.set("s3CanonicalUserId", js.undefined)
  }
  
}

