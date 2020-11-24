package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionOrderedCacheBehaviorForwardedValuesCookies extends js.Object {
  
  /**
    * Specifies whether you want CloudFront to forward
    * cookies to the origin that is associated with this cache behavior. You can
    * specify `all`, `none` or `whitelist`. If `whitelist`, you must include the
    * subsequent `whitelistedNames`
    */
  var forward: Input[String] = js.native
  
  /**
    * If you have specified `whitelist` to
    * `forward`, the whitelisted cookies that you want CloudFront to forward to
    * your origin.
    */
  var whitelistedNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object DistributionOrderedCacheBehaviorForwardedValuesCookies {
  
  @scala.inline
  def apply(forward: Input[String]): DistributionOrderedCacheBehaviorForwardedValuesCookies = {
    val __obj = js.Dynamic.literal(forward = forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOrderedCacheBehaviorForwardedValuesCookies]
  }
  
  @scala.inline
  implicit class DistributionOrderedCacheBehaviorForwardedValuesCookiesOps[Self <: DistributionOrderedCacheBehaviorForwardedValuesCookies] (val x: Self) extends AnyVal {
    
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
    def setForward(value: Input[String]): Self = this.set("forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistedNamesVarargs(value: Input[String]*): Self = this.set("whitelistedNames", js.Array(value :_*))
    
    @scala.inline
    def setWhitelistedNames(value: Input[js.Array[Input[String]]]): Self = this.set("whitelistedNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelistedNames: Self = this.set("whitelistedNames", js.undefined)
  }
}
