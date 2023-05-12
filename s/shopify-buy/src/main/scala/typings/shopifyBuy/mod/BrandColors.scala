package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrandColors extends StObject {
  
  var primary: js.Array[BrandColorGroup]
  
  var secondary: js.Array[BrandColorGroup]
}
object BrandColors {
  
  inline def apply(primary: js.Array[BrandColorGroup], secondary: js.Array[BrandColorGroup]): BrandColors = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrandColors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrandColors] (val x: Self) extends AnyVal {
    
    inline def setPrimary(value: js.Array[BrandColorGroup]): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryVarargs(value: BrandColorGroup*): Self = StObject.set(x, "primary", js.Array(value*))
    
    inline def setSecondary(value: js.Array[BrandColorGroup]): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryVarargs(value: BrandColorGroup*): Self = StObject.set(x, "secondary", js.Array(value*))
  }
}
