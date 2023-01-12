package typings.reactSpringCore.anon

import typings.reactSpringCore.reactSpringCoreInts.`120`
import typings.reactSpringCore.reactSpringCoreInts.`14`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tension extends StObject {
  
  val friction: `14`
  
  val tension: `120`
}
object Tension {
  
  inline def apply(): Tension = {
    val __obj = js.Dynamic.literal(friction = 14, tension = 120)
    __obj.asInstanceOf[Tension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tension] (val x: Self) extends AnyVal {
    
    inline def setFriction(value: `14`): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setTension(value: `120`): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
  }
}
