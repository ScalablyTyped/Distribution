package typings.rascal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object counters {
  
  @JSImport("rascal", "counters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def inMemory(options: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inMemory")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object inMemoryCluster {
    
    @JSImport("rascal", "counters.inMemoryCluster")
    @js.native
    val ^ : js.Any = js.native
    
    inline def master(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("master")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def worker(options: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("worker")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  inline def stub(options: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stub")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
}
