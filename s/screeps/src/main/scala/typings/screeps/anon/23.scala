package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var dismantle: typings.screeps.screepsInts.`3`
}
object `23` {
  
  inline def apply(): `23` = {
    val __obj = js.Dynamic.literal(dismantle = 3)
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `23`] (val x: Self) extends AnyVal {
    
    inline def setDismantle(value: typings.screeps.screepsInts.`3`): Self = StObject.set(x, "dismantle", value.asInstanceOf[js.Any])
  }
}
