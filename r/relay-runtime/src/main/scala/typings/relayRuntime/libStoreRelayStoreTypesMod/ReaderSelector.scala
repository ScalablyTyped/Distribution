package typings.relayRuntime.libStoreRelayStoreTypesMod

import typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.libStoreRelayStoreTypesMod.SingularReaderSelector
  - typings.relayRuntime.libStoreRelayStoreTypesMod.PluralReaderSelector
*/
trait ReaderSelector extends StObject
object ReaderSelector {
  
  inline def PluralReaderSelector(kind: String, selectors: js.Array[SingularReaderSelector]): typings.relayRuntime.libStoreRelayStoreTypesMod.PluralReaderSelector = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libStoreRelayStoreTypesMod.PluralReaderSelector]
  }
  
  inline def SingularReaderSelector(
    dataID: DataID,
    isWithinUnmatchedTypeRefinement: Boolean,
    kind: String,
    node: ReaderFragment,
    owner: RequestDescriptor,
    variables: Variables
  ): typings.relayRuntime.libStoreRelayStoreTypesMod.SingularReaderSelector = {
    val __obj = js.Dynamic.literal(dataID = dataID.asInstanceOf[js.Any], isWithinUnmatchedTypeRefinement = isWithinUnmatchedTypeRefinement.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libStoreRelayStoreTypesMod.SingularReaderSelector]
  }
}
