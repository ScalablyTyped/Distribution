package typings.prosemirrorView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inside extends StObject {
  
  var inside: Double
  
  var pos: Double
}
object Inside {
  
  inline def apply(inside: Double, pos: Double): Inside = {
    val __obj = js.Dynamic.literal(inside = inside.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inside]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inside] (val x: Self) extends AnyVal {
    
    inline def setInside(value: Double): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
    
    inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
