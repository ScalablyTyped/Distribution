package typings.rascal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object counters {
  
  @JSImport("rascal", "counters.inMemory")
  @js.native
  def inMemory(options: js.Any): js.Any = js.native
  
  object inMemoryCluster {
    
    @JSImport("rascal", "counters.inMemoryCluster.master")
    @js.native
    def master(options: js.Any): Unit = js.native
    
    @JSImport("rascal", "counters.inMemoryCluster.worker")
    @js.native
    def worker(options: js.Any): js.Any = js.native
  }
  
  @JSImport("rascal", "counters.stub")
  @js.native
  def stub(options: js.Any): js.Any = js.native
}
