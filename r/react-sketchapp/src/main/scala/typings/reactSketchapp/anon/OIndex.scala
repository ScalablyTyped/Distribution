package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OIndex extends StObject {
  
  var oIndex: Double
}
object OIndex {
  
  inline def apply(oIndex: Double): OIndex = {
    val __obj = js.Dynamic.literal(oIndex = oIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OIndex] (val x: Self) extends AnyVal {
    
    inline def setOIndex(value: Double): Self = StObject.set(x, "oIndex", value.asInstanceOf[js.Any])
  }
}
