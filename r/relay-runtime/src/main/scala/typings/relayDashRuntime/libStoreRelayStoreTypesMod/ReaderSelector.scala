package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashRuntime.libStoreRelayStoreTypesMod.SingularReaderSelector
  - typings.relayDashRuntime.libStoreRelayStoreTypesMod.PluralReaderSelector
*/
trait ReaderSelector extends js.Object

object ReaderSelector {
  @scala.inline
  def SingularReaderSelector(dataID: DataID, kind: String, node: ReaderFragment, owner: RequestDescriptor, variables: Variables): ReaderSelector = {
    val __obj = js.Dynamic.literal(dataID = dataID.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReaderSelector]
  }
  @scala.inline
  def PluralReaderSelector(kind: String, selectors: js.Array[SingularReaderSelector]): ReaderSelector = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReaderSelector]
  }
}

