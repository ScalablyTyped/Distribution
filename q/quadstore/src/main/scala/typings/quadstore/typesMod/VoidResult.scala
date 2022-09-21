package typings.quadstore.typesMod

import typings.quadstore.typesMod.ResultType.VOID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoidResult extends StObject {
  
  var `type`: VOID
}
object VoidResult {
  
  inline def apply(`type`: VOID): VoidResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoidResult]
  }
  
  extension [Self <: VoidResult](x: Self) {
    
    inline def setType(value: VOID): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
