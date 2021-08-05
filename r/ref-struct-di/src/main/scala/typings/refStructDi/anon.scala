package typings.refStructDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Type extends StObject {
    
    var `type`: typings.refNapi.mod.Type
  }
  object Type {
    
    inline def apply(`type`: typings.refNapi.mod.Type): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: typings.refNapi.mod.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
