package typings.reactElemental.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PulsatorState extends StObject {
  
  val color: js.Any
}
object PulsatorState {
  
  inline def apply(color: js.Any): PulsatorState = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[PulsatorState]
  }
  
  extension [Self <: PulsatorState](x: Self) {
    
    inline def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
