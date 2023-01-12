package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingBottom extends StObject {
  
  var paddingBottom: Double
  
  var paddingTop: Double
}
object PaddingBottom {
  
  inline def apply(paddingBottom: Double, paddingTop: Double): PaddingBottom = {
    val __obj = js.Dynamic.literal(paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingBottom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaddingBottom] (val x: Self) extends AnyVal {
    
    inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
  }
}
