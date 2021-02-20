package typings.stoppable

import typings.node.httpMod.Server
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stoppable", JSImport.Namespace)
  @js.native
  def apply(server: Server): StoppableServer = js.native
  @JSImport("stoppable", JSImport.Namespace)
  @js.native
  def apply(server: Server, grace: Double): StoppableServer = js.native
  
  @js.native
  trait StoppableServer extends Server {
    
    def stop(): Unit = js.native
    def stop(callback: js.Function2[/* e */ Error, /* gracefully */ Boolean, Unit]): Unit = js.native
  }
}
