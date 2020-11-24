package typings.pulumiAws.bucketPublicAccessBlockMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketPublicAccessBlockState extends js.Object {
  
  /**
    * Whether Amazon S3 should block public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
    * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
    * * PUT Object calls will fail if the request includes an object ACL.
    */
  val blockPublicAcls: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Whether Amazon S3 should block public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the existing bucket policy. When set to `true` causes Amazon S3 to:
    * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
    */
  val blockPublicPolicy: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * S3 Bucket to which this Public Access Block configuration should be applied.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether Amazon S3 should ignore public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
    * * Ignore public ACLs on this bucket and any objects that it contains.
    */
  val ignorePublicAcls: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Whether Amazon S3 should restrict public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the previously stored bucket policy, except that public and cross-account access within the public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
    * * Only the bucket owner and AWS Services can access this buckets if it has a public policy.
    */
  val restrictPublicBuckets: js.UndefOr[Input[Boolean]] = js.native
}
object BucketPublicAccessBlockState {
  
  @scala.inline
  def apply(): BucketPublicAccessBlockState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketPublicAccessBlockState]
  }
  
  @scala.inline
  implicit class BucketPublicAccessBlockStateOps[Self <: BucketPublicAccessBlockState] (val x: Self) extends AnyVal {
    
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
    def setBlockPublicAcls(value: Input[Boolean]): Self = this.set("blockPublicAcls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockPublicAcls: Self = this.set("blockPublicAcls", js.undefined)
    
    @scala.inline
    def setBlockPublicPolicy(value: Input[Boolean]): Self = this.set("blockPublicPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockPublicPolicy: Self = this.set("blockPublicPolicy", js.undefined)
    
    @scala.inline
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setIgnorePublicAcls(value: Input[Boolean]): Self = this.set("ignorePublicAcls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePublicAcls: Self = this.set("ignorePublicAcls", js.undefined)
    
    @scala.inline
    def setRestrictPublicBuckets(value: Input[Boolean]): Self = this.set("restrictPublicBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictPublicBuckets: Self = this.set("restrictPublicBuckets", js.undefined)
  }
}
