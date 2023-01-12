package typings.reactElemental.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PulsatorState extends StObject {
  
  val color: Any
}
object PulsatorState {
  
  inline def apply(color: Any): PulsatorState = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[PulsatorState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PulsatorState] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
