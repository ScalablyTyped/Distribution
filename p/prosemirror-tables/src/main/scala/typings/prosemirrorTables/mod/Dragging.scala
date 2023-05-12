package typings.prosemirrorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait Dragging extends StObject {
  
  var startWidth: Double
  
  var startX: Double
}
object Dragging {
  
  inline def apply(startWidth: Double, startX: Double): Dragging = {
    val __obj = js.Dynamic.literal(startWidth = startWidth.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dragging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dragging] (val x: Self) extends AnyVal {
    
    inline def setStartWidth(value: Double): Self = StObject.set(x, "startWidth", value.asInstanceOf[js.Any])
    
    inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
  }
}
