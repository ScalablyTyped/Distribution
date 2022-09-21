package typings.relayRuntime

import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.MissingRequiredFields
import typings.relayRuntime.relayStoreTypesMod.RelayResolverErrors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlePotentialSnapshotErrorsMod {
  
  @JSImport("relay-runtime/lib/util/handlePotentialSnapshotErrors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(environment: Environment, missingRequiredFields: Null, relayResolverErrors: RelayResolverErrors): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(environment.asInstanceOf[js.Any], missingRequiredFields.asInstanceOf[js.Any], relayResolverErrors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(environment: Environment, missingRequiredFields: Unit, relayResolverErrors: RelayResolverErrors): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(environment.asInstanceOf[js.Any], missingRequiredFields.asInstanceOf[js.Any], relayResolverErrors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    environment: Environment,
    missingRequiredFields: MissingRequiredFields,
    relayResolverErrors: RelayResolverErrors
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(environment.asInstanceOf[js.Any], missingRequiredFields.asInstanceOf[js.Any], relayResolverErrors.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
