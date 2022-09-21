package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Testing extends StObject {
  
  def destroy(): js.Promise[Unit]
  
  def run(opts: TestingRunOptions): js.Promise[Boolean]
}
object Testing {
  
  inline def apply(destroy: () => js.Promise[Unit], run: TestingRunOptions => js.Promise[Boolean]): Testing = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[Testing]
  }
  
  extension [Self <: Testing](x: Self) {
    
    inline def setDestroy(value: () => js.Promise[Unit]): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setRun(value: TestingRunOptions => js.Promise[Boolean]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
