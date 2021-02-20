package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionTrustedSigner extends StObject {
  
  /**
    * Whether the distribution is enabled to accept end
    * user requests for content.
    */
  var enabled: Boolean = js.native
  
  /**
    * List of nested attributes for each trusted signer
    */
  var items: js.Array[DistributionTrustedSignerItem] = js.native
}
object DistributionTrustedSigner {
  
  @scala.inline
  def apply(enabled: Boolean, items: js.Array[DistributionTrustedSignerItem]): DistributionTrustedSigner = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionTrustedSigner]
  }
  
  @scala.inline
  implicit class DistributionTrustedSignerMutableBuilder[Self <: DistributionTrustedSigner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[DistributionTrustedSignerItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: DistributionTrustedSignerItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
