package typings.prosemirrorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait CellSelectionJSON extends StObject {
  
  var anchor: Double
  
  var head: Double
  
  var `type`: String
}
object CellSelectionJSON {
  
  inline def apply(anchor: Double, head: Double, `type`: String): CellSelectionJSON = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellSelectionJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellSelectionJSON] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setHead(value: Double): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
