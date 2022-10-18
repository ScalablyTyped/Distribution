package typings.reactSpringCore.anon

import typings.reactSpringCore.reactSpringCoreInts.`170`
import typings.reactSpringCore.reactSpringCoreInts.`26`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Friction extends StObject {
  
  val friction: `26`
  
  val tension: `170`
}
object Friction {
  
  inline def apply(): Friction = {
    val __obj = js.Dynamic.literal(friction = 26, tension = 170)
    __obj.asInstanceOf[Friction]
  }
  
  extension [Self <: Friction](x: Self) {
    
    inline def setFriction(value: `26`): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setTension(value: `170`): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
  }
}
