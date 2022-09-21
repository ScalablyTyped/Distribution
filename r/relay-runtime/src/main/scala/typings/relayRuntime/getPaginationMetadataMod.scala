package typings.relayRuntime

import typings.relayRuntime.anon.ConnectionPathInFragmentData
import typings.relayRuntime.readerNodeMod.ReaderFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPaginationMetadataMod {
  
  @JSImport("relay-runtime/lib/util/getPaginationMetadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fragmentNode: ReaderFragment, componentDisplayName: String): ConnectionPathInFragmentData = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fragmentNode.asInstanceOf[js.Any], componentDisplayName.asInstanceOf[js.Any])).asInstanceOf[ConnectionPathInFragmentData]
}
