package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var attack: typings.screeps.screepsNumbers.`4`
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal(attack = 4)
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setAttack(value: typings.screeps.screepsNumbers.`4`): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
  }
}
