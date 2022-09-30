package typings.screeps.anon

import typings.screeps.screepsDoubles.`0.5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var damage: `0.5`
}
object `12` {
  
  inline def apply(): `12` = {
    val __obj = js.Dynamic.literal(damage = 0.5d)
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setDamage(value: `0.5`): Self = StObject.set(x, "damage", value.asInstanceOf[js.Any])
  }
}
