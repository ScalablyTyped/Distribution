package typings.reactRelay.useRefetchableFragmentNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnTypeNode[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions] extends js.Object {
  var fragmentData: js.Any
  var fragmentRef: js.Any
  var refetch: RefetchFnDynamic[TQuery, TKey, TOptions]
  def disableStoreUpdates(): Unit
  def enableStoreUpdates(): Unit
}

object ReturnTypeNode {
  @scala.inline
  def apply[TQuery, TKey, TOptions](
    disableStoreUpdates: () => Unit,
    enableStoreUpdates: () => Unit,
    fragmentData: js.Any,
    fragmentRef: js.Any,
    refetch: RefetchFnDynamic[TQuery, TKey, TOptions]
  ): ReturnTypeNode[TQuery, TKey, TOptions] = {
    val __obj = js.Dynamic.literal(disableStoreUpdates = js.Any.fromFunction0(disableStoreUpdates), enableStoreUpdates = js.Any.fromFunction0(enableStoreUpdates), fragmentData = fragmentData.asInstanceOf[js.Any], fragmentRef = fragmentRef.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeNode[TQuery, TKey, TOptions]]
  }
}

