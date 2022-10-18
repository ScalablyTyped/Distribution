package typings.reactSpringCore.anon

import typings.reactSpringCore.reactSpringCoreInts.`280`
import typings.reactSpringCore.reactSpringCoreInts.`60`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  val friction: `60`
  
  val tension: `280`
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(friction = 60, tension = 280)
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setFriction(value: `60`): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setTension(value: `280`): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
  }
}
