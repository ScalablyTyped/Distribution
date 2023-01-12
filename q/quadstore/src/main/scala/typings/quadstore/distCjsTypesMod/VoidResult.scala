package typings.quadstore.distCjsTypesMod

import typings.quadstore.distCjsTypesMod.ResultType.VOID
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoidResult] (val x: Self) extends AnyVal {
    
    inline def setType(value: VOID): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
