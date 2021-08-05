package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryFilter extends StObject {
  
  /**
    * The prefix that an object must have to be included in the inventory results.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
}
object InventoryFilter {
  
  inline def apply(): InventoryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryFilter]
  }
  
  extension [Self <: InventoryFilter](x: Self) {
    
    inline def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
