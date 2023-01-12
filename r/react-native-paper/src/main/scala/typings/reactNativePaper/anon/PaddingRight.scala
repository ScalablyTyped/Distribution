package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingRight extends StObject {
  
  var paddingLeft: Double
  
  var paddingRight: Double
}
object PaddingRight {
  
  inline def apply(paddingLeft: Double, paddingRight: Double): PaddingRight = {
    val __obj = js.Dynamic.literal(paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingRight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaddingRight] (val x: Self) extends AnyVal {
    
    inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
  }
}
