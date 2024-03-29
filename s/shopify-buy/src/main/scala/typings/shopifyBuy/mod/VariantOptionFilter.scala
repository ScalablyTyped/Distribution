package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariantOptionFilter extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object VariantOptionFilter {
  
  inline def apply(): VariantOptionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariantOptionFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariantOptionFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
