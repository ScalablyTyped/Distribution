package typings.roads

import typings.node.httpMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockServerMod {
  
  @JSImport("roads/types/tests/resources/mockServer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Server] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Server]]
  
  @JSImport("roads/types/tests/resources/mockServer", "port")
  @js.native
  val port: Double = js.native
}
