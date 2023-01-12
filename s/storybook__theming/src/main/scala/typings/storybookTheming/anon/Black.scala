package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Black extends StObject {
  
  var black: Double
  
  var bold: Double
  
  var regular: Double
}
object Black {
  
  inline def apply(black: Double, bold: Double, regular: Double): Black = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Black]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Black] (val x: Self) extends AnyVal {
    
    inline def setBlack(value: Double): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
    
    inline def setBold(value: Double): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setRegular(value: Double): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
  }
}
