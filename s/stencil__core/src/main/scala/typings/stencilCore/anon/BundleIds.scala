package typings.stencilCore.anon

import typings.stencilCore.stencilCoreStrings.scoped
import typings.stencilCore.stencilCoreStrings.shadow
import typings.stencilCore.stencilPrivateMod.ModeBundleIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleIds extends StObject {
  
  var bundleIds: ModeBundleIds
  
  var encapsulation: js.UndefOr[shadow | scoped] = js.undefined
}
object BundleIds {
  
  inline def apply(bundleIds: ModeBundleIds): BundleIds = {
    val __obj = js.Dynamic.literal(bundleIds = bundleIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleIds]
  }
  
  extension [Self <: BundleIds](x: Self) {
    
    inline def setBundleIds(value: ModeBundleIds): Self = StObject.set(x, "bundleIds", value.asInstanceOf[js.Any])
    
    inline def setEncapsulation(value: shadow | scoped): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setEncapsulationUndefined: Self = StObject.set(x, "encapsulation", js.undefined)
  }
}
