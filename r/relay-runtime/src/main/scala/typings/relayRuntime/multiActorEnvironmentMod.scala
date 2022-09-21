package typings.relayRuntime

import typings.relayRuntime.actorIdentifierMod.ActorIdentifier
import typings.relayRuntime.multiActorEnvironmentMultiActorEnvironmentMod.MultiActorEnvironmentConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiActorEnvironmentMod {
  
  @JSImport("relay-runtime/lib/multi-actor-environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("relay-runtime/lib/multi-actor-environment", "MultiActorEnvironment")
  @js.native
  open class MultiActorEnvironment protected ()
    extends typings.relayRuntime.multiActorEnvironmentMultiActorEnvironmentMod.MultiActorEnvironment {
    def this(config: MultiActorEnvironmentConfig) = this()
  }
  
  inline def getActorIdentifier(actorID: String): ActorIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("getActorIdentifier")(actorID.asInstanceOf[js.Any]).asInstanceOf[ActorIdentifier]
}
