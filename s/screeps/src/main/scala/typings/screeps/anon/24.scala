package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var dismantle: typings.screeps.screepsInts.`4`
}
object `24` {
  
  inline def apply(): `24` = {
    val __obj = js.Dynamic.literal(dismantle = 4)
    __obj.asInstanceOf[`24`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `24`] (val x: Self) extends AnyVal {
    
    inline def setDismantle(value: typings.screeps.screepsInts.`4`): Self = StObject.set(x, "dismantle", value.asInstanceOf[js.Any])
  }
}
