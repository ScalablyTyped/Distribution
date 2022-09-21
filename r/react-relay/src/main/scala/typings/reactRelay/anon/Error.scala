package typings.reactRelay.anon

import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error[TOperation /* <: OperationType */] extends StObject {
  
  var error: js.Error | Null
  
  var props: (/* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) | Null
  
  var retry: js.Function0[Unit] | Null
}
object Error {
  
  inline def apply[TOperation /* <: OperationType */](): Error[TOperation] = {
    val __obj = js.Dynamic.literal(error = null, props = null, retry = null)
    __obj.asInstanceOf[Error[TOperation]]
  }
  
  extension [Self <: Error[?], TOperation /* <: OperationType */](x: Self & Error[TOperation]) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setProps(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
    ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsNull: Self = StObject.set(x, "props", null)
    
    inline def setRetry(value: () => Unit): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
    
    inline def setRetryNull: Self = StObject.set(x, "retry", null)
  }
}
