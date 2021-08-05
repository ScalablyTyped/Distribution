package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionOrderedCacheBehaviorForwardedValuesCookies extends StObject {
  
  /**
    * Specifies whether you want CloudFront to forward
    * cookies to the origin that is associated with this cache behavior. You can
    * specify `all`, `none` or `whitelist`. If `whitelist`, you must include the
    * subsequent `whitelistedNames`
    */
  var forward: Input[String]
  
  /**
    * If you have specified `whitelist` to
    * `forward`, the whitelisted cookies that you want CloudFront to forward to
    * your origin.
    */
  var whitelistedNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object DistributionOrderedCacheBehaviorForwardedValuesCookies {
  
  inline def apply(forward: Input[String]): DistributionOrderedCacheBehaviorForwardedValuesCookies = {
    val __obj = js.Dynamic.literal(forward = forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOrderedCacheBehaviorForwardedValuesCookies]
  }
  
  extension [Self <: DistributionOrderedCacheBehaviorForwardedValuesCookies](x: Self) {
    
    inline def setForward(value: Input[String]): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setWhitelistedNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "whitelistedNames", value.asInstanceOf[js.Any])
    
    inline def setWhitelistedNamesUndefined: Self = StObject.set(x, "whitelistedNames", js.undefined)
    
    inline def setWhitelistedNamesVarargs(value: Input[String]*): Self = StObject.set(x, "whitelistedNames", js.Array(value :_*))
  }
}
