package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointPublicAccessBlockConfiguration extends js.Object {
  /**
    * Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
    * * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
    * * PUT Object calls fail if the request includes a public ACL.
    * * PUT Bucket calls fail if the request includes a public ACL.
    */
  var blockPublicAcls: js.UndefOr[Boolean] = js.native
  /**
    * Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
    * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
    */
  var blockPublicPolicy: js.UndefOr[Boolean] = js.native
  /**
    * Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
    * * Ignore all public ACLs on buckets in this account and any objects that they contain.
    */
  var ignorePublicAcls: js.UndefOr[Boolean] = js.native
  /**
    * Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
    * * Only the bucket owner and AWS Services can access buckets with public policies.
    */
  var restrictPublicBuckets: js.UndefOr[Boolean] = js.native
}

object AccessPointPublicAccessBlockConfiguration {
  @scala.inline
  def apply(
    blockPublicAcls: js.UndefOr[Boolean] = js.undefined,
    blockPublicPolicy: js.UndefOr[Boolean] = js.undefined,
    ignorePublicAcls: js.UndefOr[Boolean] = js.undefined,
    restrictPublicBuckets: js.UndefOr[Boolean] = js.undefined
  ): AccessPointPublicAccessBlockConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockPublicAcls)) __obj.updateDynamic("blockPublicAcls")(blockPublicAcls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blockPublicPolicy)) __obj.updateDynamic("blockPublicPolicy")(blockPublicPolicy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePublicAcls)) __obj.updateDynamic("ignorePublicAcls")(ignorePublicAcls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictPublicBuckets)) __obj.updateDynamic("restrictPublicBuckets")(restrictPublicBuckets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPointPublicAccessBlockConfiguration]
  }
}

