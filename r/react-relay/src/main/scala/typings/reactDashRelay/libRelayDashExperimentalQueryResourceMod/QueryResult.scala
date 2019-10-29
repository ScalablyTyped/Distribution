package typings.reactDashRelay.libRelayDashExperimentalQueryResourceMod

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.FragmentPointer
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends js.Object {
  var cacheKey: String
  var fragmentNode: ReaderFragment
  var fragmentRef: FragmentPointer
  var operation: OperationDescriptor
}

object QueryResult {
  @scala.inline
  def apply(
    cacheKey: String,
    fragmentNode: ReaderFragment,
    fragmentRef: FragmentPointer,
    operation: OperationDescriptor
  ): QueryResult = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey, fragmentNode = fragmentNode, fragmentRef = fragmentRef, operation = operation)
  
    __obj.asInstanceOf[QueryResult]
  }
}

