package typings.screeps.anon

import typings.screeps.screepsNumbers.`0.7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Damage extends StObject {
  
  var damage: `0.7`
}
object Damage {
  
  inline def apply(): Damage = {
    val __obj = js.Dynamic.literal(damage = 0.7)
    __obj.asInstanceOf[Damage]
  }
  
  extension [Self <: Damage](x: Self) {
    
    inline def setDamage(value: `0.7`): Self = StObject.set(x, "damage", value.asInstanceOf[js.Any])
  }
}
