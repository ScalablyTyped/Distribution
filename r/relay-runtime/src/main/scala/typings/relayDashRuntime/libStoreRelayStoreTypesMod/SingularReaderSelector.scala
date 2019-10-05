package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingularReaderSelector extends ReaderSelector {
  val dataID: DataID
  val kind: String
  val node: ReaderFragment
  val owner: RequestDescriptor
  val variables: Variables
}

object SingularReaderSelector {
  @scala.inline
  def apply(dataID: DataID, kind: String, node: ReaderFragment, owner: RequestDescriptor, variables: Variables): SingularReaderSelector = {
    val __obj = js.Dynamic.literal(dataID = dataID, kind = kind, node = node, owner = owner, variables = variables)
  
    __obj.asInstanceOf[SingularReaderSelector]
  }
}

