package typings.sharedb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorHandlerContext extends StObject {
  
  var agent: js.UndefOr[typings.sharedb.libAgentMod.^[Any]] = js.undefined
}
object ErrorHandlerContext {
  
  inline def apply(): ErrorHandlerContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorHandlerContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorHandlerContext] (val x: Self) extends AnyVal {
    
    inline def setAgent(value: typings.sharedb.libAgentMod.^[Any]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
  }
}
