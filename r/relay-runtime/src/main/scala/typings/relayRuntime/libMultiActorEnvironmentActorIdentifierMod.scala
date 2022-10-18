package typings.relayRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMultiActorEnvironmentActorIdentifierMod {
  
  @JSImport("relay-runtime/lib/multi-actor-environment/ActorIdentifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertInternalActorIndentifier(actorIdentifier: ActorIdentifier): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInternalActorIndentifier")(actorIdentifier.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getActorIdentifier(actorID: String): ActorIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("getActorIdentifier")(actorID.asInstanceOf[js.Any]).asInstanceOf[ActorIdentifier]
  
  inline def getDefaultActorIdentifier(): ActorIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultActorIdentifier")().asInstanceOf[ActorIdentifier]
  
  type ActorIdentifier = String
}
