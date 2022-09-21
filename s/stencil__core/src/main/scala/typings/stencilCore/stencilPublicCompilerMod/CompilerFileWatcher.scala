package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerFileWatcher extends StObject {
  
  def close(): Unit | js.Promise[Unit]
}
object CompilerFileWatcher {
  
  inline def apply(close: () => Unit | js.Promise[Unit]): CompilerFileWatcher = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[CompilerFileWatcher]
  }
  
  extension [Self <: CompilerFileWatcher](x: Self) {
    
    inline def setClose(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}
