package typings.sentryTypes

import typings.sentryTypes.mechanismMod.Mechanism
import typings.sentryTypes.stacktraceMod.Stacktrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionMod {
  
  trait Exception extends StObject {
    
    var mechanism: js.UndefOr[Mechanism] = js.undefined
    
    var module: js.UndefOr[String] = js.undefined
    
    var stacktrace: js.UndefOr[Stacktrace] = js.undefined
    
    var thread_id: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Exception {
    
    inline def apply(): Exception = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exception]
    }
    
    extension [Self <: Exception](x: Self) {
      
      inline def setMechanism(value: Mechanism): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      inline def setMechanismUndefined: Self = StObject.set(x, "mechanism", js.undefined)
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setStacktrace(value: Stacktrace): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
      
      inline def setStacktraceUndefined: Self = StObject.set(x, "stacktrace", js.undefined)
      
      inline def setThread_id(value: Double): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
      
      inline def setThread_idUndefined: Self = StObject.set(x, "thread_id", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
