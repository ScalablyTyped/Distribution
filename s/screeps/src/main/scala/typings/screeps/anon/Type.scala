package typings.screeps.anon

import typings.screeps.LookConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type[K /* <: LookConstant */] extends StObject {
  
  var `type`: K
}
object Type {
  
  inline def apply[K /* <: LookConstant */](`type`: K): Type[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[K]]
  }
  
  extension [Self <: Type[?], K /* <: LookConstant */](x: Self & Type[K]) {
    
    inline def setType(value: K): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
