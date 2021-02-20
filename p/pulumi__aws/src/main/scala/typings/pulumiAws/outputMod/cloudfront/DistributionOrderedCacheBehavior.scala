package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionOrderedCacheBehavior extends StObject {
  
  /**
    * Controls which HTTP methods CloudFront
    * processes and forwards to your Amazon S3 bucket or your custom origin.
    */
  var allowedMethods: js.Array[String] = js.native
  
  /**
    * Controls whether CloudFront caches the
    * response to requests using the specified HTTP methods.
    */
  var cachedMethods: js.Array[String] = js.native
  
  /**
    * Whether you want CloudFront to automatically
    * compress content for web requests that include `Accept-Encoding: gzip` in
    * the request header (default: `false`).
    */
  var compress: js.UndefOr[Boolean] = js.native
  
  /**
    * The default amount of time (in seconds) that an
    * object is in a CloudFront cache before CloudFront forwards another request
    * in the absence of an `Cache-Control max-age` or `Expires` header. Defaults to
    * 1 day.
    */
  var defaultTtl: js.UndefOr[Double] = js.native
  
  /**
    * Field level encryption configuration ID
    */
  var fieldLevelEncryptionId: js.UndefOr[String] = js.native
  
  /**
    * The forwarded values configuration that specifies how CloudFront
    * handles query strings, cookies and headers (maximum one).
    */
  var forwardedValues: DistributionOrderedCacheBehaviorForwardedValues = js.native
  
  /**
    * A config block that triggers a lambda function with
    * specific actions. Defined below, maximum 4.
    */
  var lambdaFunctionAssociations: js.UndefOr[js.Array[DistributionOrderedCacheBehaviorLambdaFunctionAssociation]] = js.native
  
  /**
    * The maximum amount of time (in seconds) that an
    * object is in a CloudFront cache before CloudFront forwards another request
    * to your origin to determine whether the object has been updated. Only
    * effective in the presence of `Cache-Control max-age`, `Cache-Control
    * s-maxage`, and `Expires` headers. Defaults to 365 days.
    */
  var maxTtl: js.UndefOr[Double] = js.native
  
  /**
    * The minimum amount of time that you want objects to
    * stay in CloudFront caches before CloudFront queries your origin to see
    * whether the object has been updated. Defaults to 0 seconds.
    */
  var minTtl: js.UndefOr[Double] = js.native
  
  /**
    * The pattern (for example, `images/ *.jpg)` that
    * specifies which requests you want this cache behavior to apply to.
    */
  var pathPattern: String = js.native
  
  /**
    * Indicates whether you want to distribute
    * media files in Microsoft Smooth Streaming format using the origin that is
    * associated with this cache behavior.
    */
  var smoothStreaming: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of ID for the origin that you want
    * CloudFront to route requests to when a request matches the path pattern
    * either for a cache behavior or for the default cache behavior.
    */
  var targetOriginId: String = js.native
  
  /**
    * List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content.
    * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
    */
  var trustedSigners: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Use this element to specify the
    * protocol that users can use to access the files in the origin specified by
    * TargetOriginId when a request matches the path pattern in PathPattern. One
    * of `allow-all`, `https-only`, or `redirect-to-https`.
    */
  var viewerProtocolPolicy: String = js.native
}
object DistributionOrderedCacheBehavior {
  
  @scala.inline
  def apply(
    allowedMethods: js.Array[String],
    cachedMethods: js.Array[String],
    forwardedValues: DistributionOrderedCacheBehaviorForwardedValues,
    pathPattern: String,
    targetOriginId: String,
    viewerProtocolPolicy: String
  ): DistributionOrderedCacheBehavior = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], cachedMethods = cachedMethods.asInstanceOf[js.Any], forwardedValues = forwardedValues.asInstanceOf[js.Any], pathPattern = pathPattern.asInstanceOf[js.Any], targetOriginId = targetOriginId.asInstanceOf[js.Any], viewerProtocolPolicy = viewerProtocolPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOrderedCacheBehavior]
  }
  
  @scala.inline
  implicit class DistributionOrderedCacheBehaviorMutableBuilder[Self <: DistributionOrderedCacheBehavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedMethods(value: js.Array[String]): Self = StObject.set(x, "allowedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedMethodsVarargs(value: String*): Self = StObject.set(x, "allowedMethods", js.Array(value :_*))
    
    @scala.inline
    def setCachedMethods(value: js.Array[String]): Self = StObject.set(x, "cachedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachedMethodsVarargs(value: String*): Self = StObject.set(x, "cachedMethods", js.Array(value :_*))
    
    @scala.inline
    def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    @scala.inline
    def setDefaultTtl(value: Double): Self = StObject.set(x, "defaultTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTtlUndefined: Self = StObject.set(x, "defaultTtl", js.undefined)
    
    @scala.inline
    def setFieldLevelEncryptionId(value: String): Self = StObject.set(x, "fieldLevelEncryptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldLevelEncryptionIdUndefined: Self = StObject.set(x, "fieldLevelEncryptionId", js.undefined)
    
    @scala.inline
    def setForwardedValues(value: DistributionOrderedCacheBehaviorForwardedValues): Self = StObject.set(x, "forwardedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionAssociations(value: js.Array[DistributionOrderedCacheBehaviorLambdaFunctionAssociation]): Self = StObject.set(x, "lambdaFunctionAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionAssociationsUndefined: Self = StObject.set(x, "lambdaFunctionAssociations", js.undefined)
    
    @scala.inline
    def setLambdaFunctionAssociationsVarargs(value: DistributionOrderedCacheBehaviorLambdaFunctionAssociation*): Self = StObject.set(x, "lambdaFunctionAssociations", js.Array(value :_*))
    
    @scala.inline
    def setMaxTtl(value: Double): Self = StObject.set(x, "maxTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTtlUndefined: Self = StObject.set(x, "maxTtl", js.undefined)
    
    @scala.inline
    def setMinTtl(value: Double): Self = StObject.set(x, "minTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTtlUndefined: Self = StObject.set(x, "minTtl", js.undefined)
    
    @scala.inline
    def setPathPattern(value: String): Self = StObject.set(x, "pathPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothStreaming(value: Boolean): Self = StObject.set(x, "smoothStreaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothStreamingUndefined: Self = StObject.set(x, "smoothStreaming", js.undefined)
    
    @scala.inline
    def setTargetOriginId(value: String): Self = StObject.set(x, "targetOriginId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustedSigners(value: js.Array[String]): Self = StObject.set(x, "trustedSigners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustedSignersUndefined: Self = StObject.set(x, "trustedSigners", js.undefined)
    
    @scala.inline
    def setTrustedSignersVarargs(value: String*): Self = StObject.set(x, "trustedSigners", js.Array(value :_*))
    
    @scala.inline
    def setViewerProtocolPolicy(value: String): Self = StObject.set(x, "viewerProtocolPolicy", value.asInstanceOf[js.Any])
  }
}
