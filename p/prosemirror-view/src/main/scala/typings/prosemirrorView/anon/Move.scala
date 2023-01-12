package typings.prosemirrorView.anon

import typings.prosemirrorModel.mod.Slice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Move extends StObject {
  
  var move: Boolean
  
  var slice: Slice
}
object Move {
  
  inline def apply(move: Boolean, slice: Slice): Move = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Move] (val x: Self) extends AnyVal {
    
    inline def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setSlice(value: Slice): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
  }
}
