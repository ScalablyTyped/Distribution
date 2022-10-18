package typings.reactSpringCore.anon

import typings.reactSpringCore.reactSpringCoreInts.`120`
import typings.reactSpringCore.reactSpringCoreInts.`280`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  val friction: `120`
  
  val tension: `280`
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(friction = 120, tension = 280)
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setFriction(value: `120`): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setTension(value: `280`): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
  }
}
