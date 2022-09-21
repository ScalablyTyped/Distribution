package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetBase extends StObject {
  
  /**
    * A unique string to differentiate one output target from another
    */
  var `type`: String
}
object OutputTargetBase {
  
  inline def apply(`type`: String): OutputTargetBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputTargetBase]
  }
  
  extension [Self <: OutputTargetBase](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
