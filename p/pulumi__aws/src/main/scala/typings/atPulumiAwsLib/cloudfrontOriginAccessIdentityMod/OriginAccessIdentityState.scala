package typings
package atPulumiAwsLib.cloudfrontOriginAccessIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginAccessIdentityState extends js.Object {
  /**
    * Internal value used by CloudFront to allow future
    * updates to the origin access identity.
    */
  val callerReference: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A shortcut to the full path for the
    * origin access identity to use in CloudFront, see below.
    */
  val cloudfrontAccessIdentityPath: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * An optional comment for the origin access identity.
    */
  val comment: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The current version of the origin access identity's information.
    * For example: `E2QWRUHAPOMQZL`.
    */
  val etag: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A pre-generated ARN for use in S3 bucket policies (see below).
    * Example: `arn:aws:iam::cloudfront:user/CloudFront Origin Access Identity
    * E2QWRUHAPOMQZL`.
    */
  val iamArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon S3 canonical user ID for the origin
    * access identity, which you use when giving the origin access identity read
    * permission to an object in Amazon S3.
    */
  val s3CanonicalUserId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object OriginAccessIdentityState {
  @scala.inline
  def apply(
    callerReference: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    cloudfrontAccessIdentityPath: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    comment: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    etag: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    iamArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    s3CanonicalUserId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): OriginAccessIdentityState = {
    val __obj = js.Dynamic.literal()
    if (callerReference != null) __obj.updateDynamic("callerReference")(callerReference.asInstanceOf[js.Any])
    if (cloudfrontAccessIdentityPath != null) __obj.updateDynamic("cloudfrontAccessIdentityPath")(cloudfrontAccessIdentityPath.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (iamArn != null) __obj.updateDynamic("iamArn")(iamArn.asInstanceOf[js.Any])
    if (s3CanonicalUserId != null) __obj.updateDynamic("s3CanonicalUserId")(s3CanonicalUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginAccessIdentityState]
  }
}

