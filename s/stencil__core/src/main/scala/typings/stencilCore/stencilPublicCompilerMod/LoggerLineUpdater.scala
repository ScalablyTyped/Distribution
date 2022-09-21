package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerLineUpdater extends StObject {
  
  def stop(): js.Promise[Unit]
  
  def update(text: String): js.Promise[Unit]
}
object LoggerLineUpdater {
  
  inline def apply(stop: () => js.Promise[Unit], update: String => js.Promise[Unit]): LoggerLineUpdater = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LoggerLineUpdater]
  }
  
  extension [Self <: LoggerLineUpdater](x: Self) {
    
    inline def setStop(value: () => js.Promise[Unit]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: String => js.Promise[Unit]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
