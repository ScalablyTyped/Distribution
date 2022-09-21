package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerContext extends StObject {
  
  var tsHost: js.UndefOr[Any] = js.undefined
  
  var tsProgram: js.UndefOr[Any] = js.undefined
}
object WorkerContext {
  
  inline def apply(): WorkerContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerContext]
  }
  
  extension [Self <: WorkerContext](x: Self) {
    
    inline def setTsHost(value: Any): Self = StObject.set(x, "tsHost", value.asInstanceOf[js.Any])
    
    inline def setTsHostUndefined: Self = StObject.set(x, "tsHost", js.undefined)
    
    inline def setTsProgram(value: Any): Self = StObject.set(x, "tsProgram", value.asInstanceOf[js.Any])
    
    inline def setTsProgramUndefined: Self = StObject.set(x, "tsProgram", js.undefined)
  }
}
