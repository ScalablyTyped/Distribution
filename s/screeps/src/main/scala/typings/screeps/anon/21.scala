package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var harvest: typings.screeps.screepsInts.`5`
}
object `21` {
  
  inline def apply(): `21` = {
    val __obj = js.Dynamic.literal(harvest = 5)
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `21`] (val x: Self) extends AnyVal {
    
    inline def setHarvest(value: typings.screeps.screepsInts.`5`): Self = StObject.set(x, "harvest", value.asInstanceOf[js.Any])
  }
}
