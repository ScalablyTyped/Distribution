package typings.relayRuntime

import typings.relayRuntime.anon.FragmentRefPathInResponse
import typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilGetRefetchMetadataMod {
  
  @JSImport("relay-runtime/lib/util/getRefetchMetadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fragmentNode: ReaderFragment, componentDisplayName: String): FragmentRefPathInResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fragmentNode.asInstanceOf[js.Any], componentDisplayName.asInstanceOf[js.Any])).asInstanceOf[FragmentRefPathInResponse]
}
