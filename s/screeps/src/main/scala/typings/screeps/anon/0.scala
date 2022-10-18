package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var filter: Any | String
}
object `0` {
  
  inline def apply(filter: Any | String): `0` = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setFilter(value: Any | String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
