package typings.relayRuntime

import typings.relayRuntime.anon.PendingOperations
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPendingOperationsForFragmentMod {
  
  @JSImport("relay-runtime/lib/util/getPendingOperationsForFragment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(environment: Environment, fragmentNode: ReaderFragment, fragmentOwner: RequestDescriptor): PendingOperations | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(environment.asInstanceOf[js.Any], fragmentNode.asInstanceOf[js.Any], fragmentOwner.asInstanceOf[js.Any])).asInstanceOf[PendingOperations | Null]
}
