package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compiler extends StObject {
  
  def build(): js.Promise[CompilerBuildResults]
  
  def createWatcher(): js.Promise[CompilerWatcher]
  
  def destroy(): js.Promise[Unit]
  
  var sys: CompilerSystem
}
object Compiler {
  
  inline def apply(
    build: () => js.Promise[CompilerBuildResults],
    createWatcher: () => js.Promise[CompilerWatcher],
    destroy: () => js.Promise[Unit],
    sys: CompilerSystem
  ): Compiler = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), createWatcher = js.Any.fromFunction0(createWatcher), destroy = js.Any.fromFunction0(destroy), sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compiler]
  }
  
  extension [Self <: Compiler](x: Self) {
    
    inline def setBuild(value: () => js.Promise[CompilerBuildResults]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setCreateWatcher(value: () => js.Promise[CompilerWatcher]): Self = StObject.set(x, "createWatcher", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => js.Promise[Unit]): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setSys(value: CompilerSystem): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
  }
}
