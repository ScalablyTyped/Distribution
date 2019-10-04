package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingularReaderSelector extends ReaderSelector {
  var dataID: String
  var kind: String
  var node: ReaderFragment
  var owner: RequestDescriptor
  var variables: Variables
}

object SingularReaderSelector {
  @scala.inline
  def apply(dataID: String, kind: String, node: ReaderFragment, owner: RequestDescriptor, variables: Variables): SingularReaderSelector = {
    val __obj = js.Dynamic.literal(dataID = dataID, kind = kind, node = node, owner = owner, variables = variables)
  
    __obj.asInstanceOf[SingularReaderSelector]
  }
}

