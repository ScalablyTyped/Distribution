package typings.reactFloater.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZIndex extends StObject {
  
  var zIndex: Double
}
object ZIndex {
  
  inline def apply(zIndex: Double): ZIndex = {
    val __obj = js.Dynamic.literal(zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZIndex] (val x: Self) extends AnyVal {
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
