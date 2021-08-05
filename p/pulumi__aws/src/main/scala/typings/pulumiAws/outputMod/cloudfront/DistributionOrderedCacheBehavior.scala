package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionOrderedCacheBehavior extends StObject {
  
  /**
    * Controls which HTTP methods CloudFront
    * processes and forwards to your Amazon S3 bucket or your custom origin.
    */
  var allowedMethods: js.Array[String]
  
  /**
    * Controls whether CloudFront caches the
    * response to requests using the specified HTTP methods.
    */
  var cachedMethods: js.Array[String]
  
  /**
    * Whether you want CloudFront to automatically
    * compress content for web requests that include `Accept-Encoding: gzip` in
    * the request header (default: `false`).
    */
  var compress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default amount of time (in seconds) that an
    * object is in a CloudFront cache before CloudFront forwards another request
    * in the absence of an `Cache-Control max-age` or `Expires` header. Defaults to
    * 1 day.
    */
  var defaultTtl: js.UndefOr[Double] = js.undefined
  
  /**
    * Field level encryption configuration ID
    */
  var fieldLevelEncryptionId: js.UndefOr[String] = js.undefined
  
  /**
    * The forwarded values configuration that specifies how CloudFront
    * handles query strings, cookies and headers (maximum one).
    */
  var forwardedValues: DistributionOrderedCacheBehaviorForwardedValues
  
  /**
    * A config block that triggers a lambda function with
    * specific actions. Defined below, maximum 4.
    */
  var lambdaFunctionAssociations: js.UndefOr[js.Array[DistributionOrderedCacheBehaviorLambdaFunctionAssociation]] = js.undefined
  
  /**
    * The maximum amount of time (in seconds) that an
    * object is in a CloudFront cache before CloudFront forwards another request
    * to your origin to determine whether the object has been updated. Only
    * effective in the presence of `Cache-Control max-age`, `Cache-Control
    * s-maxage`, and `Expires` headers. Defaults to 365 days.
    */
  var maxTtl: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum amount of time that you want objects to
    * stay in CloudFront caches before CloudFront queries your origin to see
    * whether the object has been updated. Defaults to 0 seconds.
    */
  var minTtl: js.UndefOr[Double] = js.undefined
  
  /**
    * The pattern (for example, `images/ *.jpg)` that
    * specifies which requests you want this cache behavior to apply to.
    */
  var pathPattern: String
  
  /**
    * Indicates whether you want to distribute
    * media files in Microsoft Smooth Streaming format using the origin that is
    * associated with this cache behavior.
    */
  var smoothStreaming: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of ID for the origin that you want
    * CloudFront to route requests to when a request matches the path pattern
    * either for a cache behavior or for the default cache behavior.
    */
  var targetOriginId: String
  
  /**
    * List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content.
    * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
    */
  var trustedSigners: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Use this element to specify the
    * protocol that users can use to access the files in the origin specified by
    * TargetOriginId when a request matches the path pattern in PathPattern. One
    * of `allow-all`, `https-only`, or `redirect-to-https`.
    */
  var viewerProtocolPolicy: String
}
object DistributionOrderedCacheBehavior {
  
  inline def apply(
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
  
  extension [Self <: DistributionOrderedCacheBehavior](x: Self) {
    
    inline def setAllowedMethods(value: js.Array[String]): Self = StObject.set(x, "allowedMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowedMethodsVarargs(value: String*): Self = StObject.set(x, "allowedMethods", js.Array(value :_*))
    
    inline def setCachedMethods(value: js.Array[String]): Self = StObject.set(x, "cachedMethods", value.asInstanceOf[js.Any])
    
    inline def setCachedMethodsVarargs(value: String*): Self = StObject.set(x, "cachedMethods", js.Array(value :_*))
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setDefaultTtl(value: Double): Self = StObject.set(x, "defaultTtl", value.asInstanceOf[js.Any])
    
    inline def setDefaultTtlUndefined: Self = StObject.set(x, "defaultTtl", js.undefined)
    
    inline def setFieldLevelEncryptionId(value: String): Self = StObject.set(x, "fieldLevelEncryptionId", value.asInstanceOf[js.Any])
    
    inline def setFieldLevelEncryptionIdUndefined: Self = StObject.set(x, "fieldLevelEncryptionId", js.undefined)
    
    inline def setForwardedValues(value: DistributionOrderedCacheBehaviorForwardedValues): Self = StObject.set(x, "forwardedValues", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionAssociations(value: js.Array[DistributionOrderedCacheBehaviorLambdaFunctionAssociation]): Self = StObject.set(x, "lambdaFunctionAssociations", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionAssociationsUndefined: Self = StObject.set(x, "lambdaFunctionAssociations", js.undefined)
    
    inline def setLambdaFunctionAssociationsVarargs(value: DistributionOrderedCacheBehaviorLambdaFunctionAssociation*): Self = StObject.set(x, "lambdaFunctionAssociations", js.Array(value :_*))
    
    inline def setMaxTtl(value: Double): Self = StObject.set(x, "maxTtl", value.asInstanceOf[js.Any])
    
    inline def setMaxTtlUndefined: Self = StObject.set(x, "maxTtl", js.undefined)
    
    inline def setMinTtl(value: Double): Self = StObject.set(x, "minTtl", value.asInstanceOf[js.Any])
    
    inline def setMinTtlUndefined: Self = StObject.set(x, "minTtl", js.undefined)
    
    inline def setPathPattern(value: String): Self = StObject.set(x, "pathPattern", value.asInstanceOf[js.Any])
    
    inline def setSmoothStreaming(value: Boolean): Self = StObject.set(x, "smoothStreaming", value.asInstanceOf[js.Any])
    
    inline def setSmoothStreamingUndefined: Self = StObject.set(x, "smoothStreaming", js.undefined)
    
    inline def setTargetOriginId(value: String): Self = StObject.set(x, "targetOriginId", value.asInstanceOf[js.Any])
    
    inline def setTrustedSigners(value: js.Array[String]): Self = StObject.set(x, "trustedSigners", value.asInstanceOf[js.Any])
    
    inline def setTrustedSignersUndefined: Self = StObject.set(x, "trustedSigners", js.undefined)
    
    inline def setTrustedSignersVarargs(value: String*): Self = StObject.set(x, "trustedSigners", js.Array(value :_*))
    
    inline def setViewerProtocolPolicy(value: String): Self = StObject.set(x, "viewerProtocolPolicy", value.asInstanceOf[js.Any])
  }
}
