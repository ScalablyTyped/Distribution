package typings.reactRelay.anon

import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error[TOperation /* <: OperationType */] extends StObject {
  
  var error: typings.std.Error | Null
  
  var props: (/* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) | Null
  
  var retry: js.Function0[Unit] | Null
}
object Error {
  
  @scala.inline
  def apply[TOperation /* <: OperationType */](): Error[TOperation] = {
    val __obj = js.Dynamic.literal(error = null, props = null, retry = null)
    __obj.asInstanceOf[Error[TOperation]]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error[?], TOperation /* <: OperationType */] (val x: Self & Error[TOperation]) extends AnyVal {
    
    @scala.inline
    def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setProps(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
    ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsNull: Self = StObject.set(x, "props", null)
    
    @scala.inline
    def setRetry(value: () => Unit): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRetryNull: Self = StObject.set(x, "retry", null)
  }
}
