package typings.rascal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object counters {
  
  @JSImport("rascal", "counters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def inMemory(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inMemory")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  object inMemoryCluster {
    
    @JSImport("rascal", "counters.inMemoryCluster")
    @js.native
    val ^ : js.Any = js.native
    
    inline def master(options: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("master")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def worker(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("worker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  inline def stub(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stub")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
