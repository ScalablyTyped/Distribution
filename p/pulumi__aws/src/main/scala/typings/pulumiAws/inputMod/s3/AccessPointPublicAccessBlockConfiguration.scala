package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPointPublicAccessBlockConfiguration extends StObject {
  
  /**
    * Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
    * * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
    * * PUT Object calls fail if the request includes a public ACL.
    * * PUT Bucket calls fail if the request includes a public ACL.
    */
  var blockPublicAcls: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
    * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
    */
  var blockPublicPolicy: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
    * * Ignore all public ACLs on buckets in this account and any objects that they contain.
    */
  var ignorePublicAcls: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
    * * Only the bucket owner and AWS Services can access buckets with public policies.
    */
  var restrictPublicBuckets: js.UndefOr[Input[Boolean]] = js.undefined
}
object AccessPointPublicAccessBlockConfiguration {
  
  @scala.inline
  def apply(): AccessPointPublicAccessBlockConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPointPublicAccessBlockConfiguration]
  }
  
  @scala.inline
  implicit class AccessPointPublicAccessBlockConfigurationMutableBuilder[Self <: AccessPointPublicAccessBlockConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockPublicAcls(value: Input[Boolean]): Self = StObject.set(x, "blockPublicAcls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockPublicAclsUndefined: Self = StObject.set(x, "blockPublicAcls", js.undefined)
    
    @scala.inline
    def setBlockPublicPolicy(value: Input[Boolean]): Self = StObject.set(x, "blockPublicPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockPublicPolicyUndefined: Self = StObject.set(x, "blockPublicPolicy", js.undefined)
    
    @scala.inline
    def setIgnorePublicAcls(value: Input[Boolean]): Self = StObject.set(x, "ignorePublicAcls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePublicAclsUndefined: Self = StObject.set(x, "ignorePublicAcls", js.undefined)
    
    @scala.inline
    def setRestrictPublicBuckets(value: Input[Boolean]): Self = StObject.set(x, "restrictPublicBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictPublicBucketsUndefined: Self = StObject.set(x, "restrictPublicBuckets", js.undefined)
  }
}
