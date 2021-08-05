package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasId extends StObject {
  
  var id: Id[this.type]
}
object HasId {
  
  inline def apply(id: Id[HasId]): HasId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasId]
  }
  
  extension [Self <: HasId](x: Self) {
    
    inline def setId(value: Id[HasId]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
