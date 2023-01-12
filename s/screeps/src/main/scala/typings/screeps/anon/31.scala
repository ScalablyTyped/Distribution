package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  var fatigue: typings.screeps.screepsInts.`3`
}
object `31` {
  
  inline def apply(): `31` = {
    val __obj = js.Dynamic.literal(fatigue = 3)
    __obj.asInstanceOf[`31`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `31`] (val x: Self) extends AnyVal {
    
    inline def setFatigue(value: typings.screeps.screepsInts.`3`): Self = StObject.set(x, "fatigue", value.asInstanceOf[js.Any])
  }
}
