package typings.reactSpringCore.anon

import typings.reactSpringCore.reactSpringCoreInts.`20`
import typings.reactSpringCore.reactSpringCoreInts.`210`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  val friction: `20`
  
  val tension: `210`
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(friction = 20, tension = 210)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setFriction(value: `20`): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setTension(value: `210`): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
  }
}
