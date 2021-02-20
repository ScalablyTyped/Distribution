package typings.roads

import typings.node.httpMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockServerMod {
  
  @JSImport("roads/types/tests/resources/mockServer", JSImport.Default)
  @js.native
  def default(): js.Promise[Server] = js.native
  
  @JSImport("roads/types/tests/resources/mockServer", "port")
  @js.native
  val port: Double = js.native
}
