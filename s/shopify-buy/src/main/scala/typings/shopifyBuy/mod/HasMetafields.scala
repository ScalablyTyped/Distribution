package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasMetafields extends StObject {
  
  var metafield: js.UndefOr[Metafield] = js.undefined
  
  var metafields: js.Array[Metafield]
}
object HasMetafields {
  
  inline def apply(metafields: js.Array[Metafield]): HasMetafields = {
    val __obj = js.Dynamic.literal(metafields = metafields.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasMetafields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasMetafields] (val x: Self) extends AnyVal {
    
    inline def setMetafield(value: Metafield): Self = StObject.set(x, "metafield", value.asInstanceOf[js.Any])
    
    inline def setMetafieldUndefined: Self = StObject.set(x, "metafield", js.undefined)
    
    inline def setMetafields(value: js.Array[Metafield]): Self = StObject.set(x, "metafields", value.asInstanceOf[js.Any])
    
    inline def setMetafieldsVarargs(value: Metafield*): Self = StObject.set(x, "metafields", js.Array(value*))
  }
}
