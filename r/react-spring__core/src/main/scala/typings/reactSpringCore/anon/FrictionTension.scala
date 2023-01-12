package typings.reactSpringCore.anon

import typings.reactSpringCore.reactSpringCoreInts.`12`
import typings.reactSpringCore.reactSpringCoreInts.`180`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrictionTension extends StObject {
  
  val friction: `12`
  
  val tension: `180`
}
object FrictionTension {
  
  inline def apply(): FrictionTension = {
    val __obj = js.Dynamic.literal(friction = 12, tension = 180)
    __obj.asInstanceOf[FrictionTension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrictionTension] (val x: Self) extends AnyVal {
    
    inline def setFriction(value: `12`): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setTension(value: `180`): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
  }
}
