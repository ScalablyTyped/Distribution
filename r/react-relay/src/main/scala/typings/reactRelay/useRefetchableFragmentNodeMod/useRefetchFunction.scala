package typings.reactRelay.useRefetchableFragmentNodeMod

import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/useRefetchableFragmentNode", "useRefetchFunction")
@js.native
object useRefetchFunction extends js.Object {
  def apply[TQuery /* <: OperationType */](
    fragmentNode: js.Any,
    parentFragmentRef: js.Any,
    fragmentIdentifier: js.Any,
    fragmentRefPathInResponse: js.Any,
    fragmentData: js.Any,
    refetchGenerationRef: js.Any,
    dispatch: js.Any,
    disposeFetch: js.Any,
    componentDisplayName: js.Any
  ): // tslint:disable-next-line:no-unnecessary-generics
  RefetchFn[TQuery, InternalOptions] = js.native
}

