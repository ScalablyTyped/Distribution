package typings.reactSpringCore.anon

import typings.reactSpringCore.reactSpringCoreInts.`120`
import typings.reactSpringCore.reactSpringCoreInts.`280`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  val friction: `120`
  
  val tension: `280`
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal(friction = 120, tension = 280)
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setFriction(value: `120`): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setTension(value: `280`): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
  }
}
