package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `28` extends StObject {
  
  var attack: typings.screeps.screepsInts.`4`
}
object `28` {
  
  inline def apply(): `28` = {
    val __obj = js.Dynamic.literal(attack = 4)
    __obj.asInstanceOf[`28`]
  }
  
  extension [Self <: `28`](x: Self) {
    
    inline def setAttack(value: typings.screeps.screepsInts.`4`): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
  }
}
