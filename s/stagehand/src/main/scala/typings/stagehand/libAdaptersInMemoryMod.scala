package typings.stagehand

import typings.stagehand.mod.Implementation
import typings.stagehand.mod.MessageEndpoint
import typings.stagehand.mod.Remote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptersInMemoryMod {
  
  @JSImport("stagehand/lib/adapters/in-memory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectLocal[T](handler: Implementation[T]): js.Promise[Remote[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectLocal")(handler.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Remote[T]]]
  
  inline def endpointPair(): js.Tuple2[MessageEndpoint, MessageEndpoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("endpointPair")().asInstanceOf[js.Tuple2[MessageEndpoint, MessageEndpoint]]
}
