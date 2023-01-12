package typings.screeps.anon

import typings.screeps.screepsDoubles.`0.5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33` extends StObject {
  
  var damage: `0.5`
}
object `33` {
  
  inline def apply(): `33` = {
    val __obj = js.Dynamic.literal(damage = 0.5d)
    __obj.asInstanceOf[`33`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `33`] (val x: Self) extends AnyVal {
    
    inline def setDamage(value: `0.5`): Self = StObject.set(x, "damage", value.asInstanceOf[js.Any])
  }
}
