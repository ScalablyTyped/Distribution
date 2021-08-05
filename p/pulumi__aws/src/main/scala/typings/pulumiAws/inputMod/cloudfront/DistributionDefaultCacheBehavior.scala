package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionDefaultCacheBehavior extends StObject {
  
  /**
    * Controls which HTTP methods CloudFront
    * processes and forwards to your Amazon S3 bucket or your custom origin.
    */
  var allowedMethods: Input[js.Array[Input[String]]]
  
  /**
    * Controls whether CloudFront caches the
    * response to requests using the specified HTTP methods.
    */
  var cachedMethods: Input[js.Array[Input[String]]]
  
  /**
    * Whether you want CloudFront to automatically
    * compress content for web requests that include `Accept-Encoding: gzip` in
    * the request header (default: `false`).
    */
  var compress: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The default amount of time (in seconds) that an
    * object is in a CloudFront cache before CloudFront forwards another request
    * in the absence of an `Cache-Control max-age` or `Expires` header. Defaults to
    * 1 day.
    */
  var defaultTtl: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Field level encryption configuration ID
    */
  var fieldLevelEncryptionId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The forwarded values configuration that specifies how CloudFront
    * handles query strings, cookies and headers (maximum one).
    */
  var forwardedValues: Input[DistributionDefaultCacheBehaviorForwardedValues]
  
  /**
    * A config block that triggers a lambda function with
    * specific actions. Defined below, maximum 4.
    */
  var lambdaFunctionAssociations: js.UndefOr[
    Input[js.Array[Input[DistributionDefaultCacheBehaviorLambdaFunctionAssociation]]]
  ] = js.undefined
  
  /**
    * The maximum amount of time (in seconds) that an
    * object is in a CloudFront cache before CloudFront forwards another request
    * to your origin to determine whether the object has been updated. Only
    * effective in the presence of `Cache-Control max-age`, `Cache-Control
    * s-maxage`, and `Expires` headers. Defaults to 365 days.
    */
  var maxTtl: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The minimum amount of time that you want objects to
    * stay in CloudFront caches before CloudFront queries your origin to see
    * whether the object has been updated. Defaults to 0 seconds.
    */
  var minTtl: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Indicates whether you want to distribute
    * media files in Microsoft Smooth Streaming format using the origin that is
    * associated with this cache behavior.
    */
  var smoothStreaming: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The value of ID for the origin that you want
    * CloudFront to route requests to when a request matches the path pattern
    * either for a cache behavior or for the default cache behavior.
    */
  var targetOriginId: Input[String]
  
  /**
    * List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content.
    * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
    */
  var trustedSigners: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * Use this element to specify the
    * protocol that users can use to access the files in the origin specified by
    * TargetOriginId when a request matches the path pattern in PathPattern. One
    * of `allow-all`, `https-only`, or `redirect-to-https`.
    */
  var viewerProtocolPolicy: Input[String]
}
object DistributionDefaultCacheBehavior {
  
  inline def apply(
    allowedMethods: Input[js.Array[Input[String]]],
    cachedMethods: Input[js.Array[Input[String]]],
    forwardedValues: Input[DistributionDefaultCacheBehaviorForwardedValues],
    targetOriginId: Input[String],
    viewerProtocolPolicy: Input[String]
  ): DistributionDefaultCacheBehavior = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], cachedMethods = cachedMethods.asInstanceOf[js.Any], forwardedValues = forwardedValues.asInstanceOf[js.Any], targetOriginId = targetOriginId.asInstanceOf[js.Any], viewerProtocolPolicy = viewerProtocolPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionDefaultCacheBehavior]
  }
  
  extension [Self <: DistributionDefaultCacheBehavior](x: Self) {
    
    inline def setAllowedMethods(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowedMethodsVarargs(value: Input[String]*): Self = StObject.set(x, "allowedMethods", js.Array(value :_*))
    
    inline def setCachedMethods(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "cachedMethods", value.asInstanceOf[js.Any])
    
    inline def setCachedMethodsVarargs(value: Input[String]*): Self = StObject.set(x, "cachedMethods", js.Array(value :_*))
    
    inline def setCompress(value: Input[Boolean]): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setDefaultTtl(value: Input[Double]): Self = StObject.set(x, "defaultTtl", value.asInstanceOf[js.Any])
    
    inline def setDefaultTtlUndefined: Self = StObject.set(x, "defaultTtl", js.undefined)
    
    inline def setFieldLevelEncryptionId(value: Input[String]): Self = StObject.set(x, "fieldLevelEncryptionId", value.asInstanceOf[js.Any])
    
    inline def setFieldLevelEncryptionIdUndefined: Self = StObject.set(x, "fieldLevelEncryptionId", js.undefined)
    
    inline def setForwardedValues(value: Input[DistributionDefaultCacheBehaviorForwardedValues]): Self = StObject.set(x, "forwardedValues", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionAssociations(value: Input[js.Array[Input[DistributionDefaultCacheBehaviorLambdaFunctionAssociation]]]): Self = StObject.set(x, "lambdaFunctionAssociations", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionAssociationsUndefined: Self = StObject.set(x, "lambdaFunctionAssociations", js.undefined)
    
    inline def setLambdaFunctionAssociationsVarargs(value: Input[DistributionDefaultCacheBehaviorLambdaFunctionAssociation]*): Self = StObject.set(x, "lambdaFunctionAssociations", js.Array(value :_*))
    
    inline def setMaxTtl(value: Input[Double]): Self = StObject.set(x, "maxTtl", value.asInstanceOf[js.Any])
    
    inline def setMaxTtlUndefined: Self = StObject.set(x, "maxTtl", js.undefined)
    
    inline def setMinTtl(value: Input[Double]): Self = StObject.set(x, "minTtl", value.asInstanceOf[js.Any])
    
    inline def setMinTtlUndefined: Self = StObject.set(x, "minTtl", js.undefined)
    
    inline def setSmoothStreaming(value: Input[Boolean]): Self = StObject.set(x, "smoothStreaming", value.asInstanceOf[js.Any])
    
    inline def setSmoothStreamingUndefined: Self = StObject.set(x, "smoothStreaming", js.undefined)
    
    inline def setTargetOriginId(value: Input[String]): Self = StObject.set(x, "targetOriginId", value.asInstanceOf[js.Any])
    
    inline def setTrustedSigners(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "trustedSigners", value.asInstanceOf[js.Any])
    
    inline def setTrustedSignersUndefined: Self = StObject.set(x, "trustedSigners", js.undefined)
    
    inline def setTrustedSignersVarargs(value: Input[String]*): Self = StObject.set(x, "trustedSigners", js.Array(value :_*))
    
    inline def setViewerProtocolPolicy(value: Input[String]): Self = StObject.set(x, "viewerProtocolPolicy", value.asInstanceOf[js.Any])
  }
}
