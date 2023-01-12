package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  var harvest: typings.screeps.screepsInts.`7`
}
object `22` {
  
  inline def apply(): `22` = {
    val __obj = js.Dynamic.literal(harvest = 7)
    __obj.asInstanceOf[`22`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `22`] (val x: Self) extends AnyVal {
    
    inline def setHarvest(value: typings.screeps.screepsInts.`7`): Self = StObject.set(x, "harvest", value.asInstanceOf[js.Any])
  }
}
