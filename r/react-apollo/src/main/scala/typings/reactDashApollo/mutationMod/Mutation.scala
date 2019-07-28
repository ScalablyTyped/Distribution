package typings.reactDashApollo.mutationMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mutation[TData, TVariables]
  extends Component[MutationProps[TData, TVariables], MutationState[TData], js.Any] {
  var client: js.Any = js.native
  var generateNewMutationId: js.Any = js.native
  var hasMounted: js.Any = js.native
  var isMostRecentMutation: js.Any = js.native
  var mostRecentMutationId: js.Any = js.native
  var mutate: js.Any = js.native
  var onMutationCompleted: js.Any = js.native
  var onMutationError: js.Any = js.native
  var onMutationStart: js.Any = js.native
  var runMutation: js.Any = js.native
  var verifyDocumentIsMutation: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MMutation(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MMutation(nextProps: MutationProps[TData, TVariables], nextContext: MutationContext): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MMutation(): Unit = js.native
}

