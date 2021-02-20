package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBucketMod {
  
  @JSImport("@pulumi/aws/s3/getBucket", "getBucket")
  @js.native
  def getBucket(args: GetBucketArgs): js.Promise[GetBucketResult] = js.native
  @JSImport("@pulumi/aws/s3/getBucket", "getBucket")
  @js.native
  def getBucket(args: GetBucketArgs, opts: InvokeOptions): js.Promise[GetBucketResult] = js.native
  
  @js.native
  trait GetBucketArgs extends StObject {
    
    /**
      * The name of the bucket
      */
    val bucket: String = js.native
  }
  object GetBucketArgs {
    
    @scala.inline
    def apply(bucket: String): GetBucketArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketArgs]
    }
    
    @scala.inline
    implicit class GetBucketArgsMutableBuilder[Self <: GetBucketArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetBucketResult extends StObject {
    
    /**
      * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
      */
    val arn: String = js.native
    
    val bucket: String = js.native
    
    /**
      * The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
      */
    val bucketDomainName: String = js.native
    
    /**
      * The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
      */
    val bucketRegionalDomainName: String = js.native
    
    /**
      * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
      */
    val hostedZoneId: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The AWS region this bucket resides in.
      */
    val region: String = js.native
    
    /**
      * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
      */
    val websiteDomain: String = js.native
    
    /**
      * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
      */
    val websiteEndpoint: String = js.native
  }
  object GetBucketResult {
    
    @scala.inline
    def apply(
      arn: String,
      bucket: String,
      bucketDomainName: String,
      bucketRegionalDomainName: String,
      hostedZoneId: String,
      id: String,
      region: String,
      websiteDomain: String,
      websiteEndpoint: String
    ): GetBucketResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], bucketDomainName = bucketDomainName.asInstanceOf[js.Any], bucketRegionalDomainName = bucketRegionalDomainName.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], websiteDomain = websiteDomain.asInstanceOf[js.Any], websiteEndpoint = websiteEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketResult]
    }
    
    @scala.inline
    implicit class GetBucketResultMutableBuilder[Self <: GetBucketResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketDomainName(value: String): Self = StObject.set(x, "bucketDomainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketRegionalDomainName(value: String): Self = StObject.set(x, "bucketRegionalDomainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostedZoneId(value: String): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsiteDomain(value: String): Self = StObject.set(x, "websiteDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsiteEndpoint(value: String): Self = StObject.set(x, "websiteEndpoint", value.asInstanceOf[js.Any])
    }
  }
}
