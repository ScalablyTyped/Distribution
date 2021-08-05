package typings.snabbdom

import typings.snabbdom.moduleMod.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heroMod {
  
  @JSImport("snabbdom/build/package/modules/hero", "heroModule")
  @js.native
  val heroModule: Module = js.native
  
  trait Hero extends StObject {
    
    var id: String
  }
  object Hero {
    
    inline def apply(id: String): Hero = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hero]
    }
    
    extension [Self <: Hero](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
