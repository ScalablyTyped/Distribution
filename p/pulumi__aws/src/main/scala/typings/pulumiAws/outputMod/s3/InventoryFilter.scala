package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryFilter extends StObject {
  
  /**
    * The prefix that an object must have to be included in the inventory results.
    */
  var prefix: js.UndefOr[String] = js.undefined
}
object InventoryFilter {
  
  inline def apply(): InventoryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryFilter]
  }
  
  extension [Self <: InventoryFilter](x: Self) {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
