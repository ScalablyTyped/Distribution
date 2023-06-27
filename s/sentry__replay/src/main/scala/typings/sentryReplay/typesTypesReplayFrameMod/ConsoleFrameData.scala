package typings.sentryReplay.typesTypesReplayFrameMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleFrameData extends StObject {
  
  var arguments: js.UndefOr[js.Array[Any]] = js.undefined
  
  var logger: String
}
object ConsoleFrameData {
  
  inline def apply(logger: String): ConsoleFrameData = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleFrameData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsoleFrameData] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: js.Array[Any]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: Any*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setLogger(value: String): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
  }
}
