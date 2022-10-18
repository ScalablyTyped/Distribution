package typings.relayRuntime

import typings.relayRuntime.libMultiActorEnvironmentActorIdentifierMod.ActorIdentifier
import typings.relayRuntime.libMultiActorEnvironmentMultiActorEnvironmentMod.MultiActorEnvironmentConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiActorEnvironmentMod {
  
  @JSImport("relay-runtime/multi-actor-environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("relay-runtime/multi-actor-environment", "MultiActorEnvironment")
  @js.native
  open class MultiActorEnvironment protected ()
    extends typings.relayRuntime.libMultiActorEnvironmentMod.MultiActorEnvironment {
    def this(config: MultiActorEnvironmentConfig) = this()
  }
  
  inline def getActorIdentifier(actorID: String): ActorIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("getActorIdentifier")(actorID.asInstanceOf[js.Any]).asInstanceOf[ActorIdentifier]
}
