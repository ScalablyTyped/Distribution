package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionTrustedSigner extends StObject {
  
  /**
    * Whether the distribution is enabled to accept end
    * user requests for content.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * List of nested attributes for each trusted signer
    */
  var items: js.UndefOr[Input[js.Array[Input[DistributionTrustedSignerItem]]]] = js.undefined
}
object DistributionTrustedSigner {
  
  inline def apply(): DistributionTrustedSigner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionTrustedSigner]
  }
  
  extension [Self <: DistributionTrustedSigner](x: Self) {
    
    inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setItems(value: Input[js.Array[Input[DistributionTrustedSignerItem]]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Input[DistributionTrustedSignerItem]*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
