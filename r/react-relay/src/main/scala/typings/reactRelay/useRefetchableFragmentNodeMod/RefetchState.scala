package typings.reactRelay.useRefetchableFragmentNodeMod

import typings.reactRelay.queryResourceMod.FetchPolicy
import typings.reactRelay.queryResourceMod.RenderPolicy
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefetchState extends js.Object {
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var mirroredEnvironment: Environment
  var mirroredFragmentIdentifier: String
  var onComplete: js.UndefOr[js.Function1[/* arg */ Error | Null, Unit]] = js.undefined
  var refetchEnvironment: js.UndefOr[Environment | Null] = js.undefined
  var refetchVariables: js.UndefOr[Variables | Null] = js.undefined
  var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
}

object RefetchState {
  @scala.inline
  def apply(
    mirroredEnvironment: Environment,
    mirroredFragmentIdentifier: String,
    fetchPolicy: FetchPolicy = null,
    onComplete: /* arg */ Error | Null => Unit = null,
    refetchEnvironment: js.UndefOr[Null | Environment] = js.undefined,
    refetchVariables: js.UndefOr[Null | Variables] = js.undefined,
    renderPolicy: RenderPolicy = null
  ): RefetchState = {
    val __obj = js.Dynamic.literal(mirroredEnvironment = mirroredEnvironment.asInstanceOf[js.Any], mirroredFragmentIdentifier = mirroredFragmentIdentifier.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (!js.isUndefined(refetchEnvironment)) __obj.updateDynamic("refetchEnvironment")(refetchEnvironment.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchVariables)) __obj.updateDynamic("refetchVariables")(refetchVariables.asInstanceOf[js.Any])
    if (renderPolicy != null) __obj.updateDynamic("renderPolicy")(renderPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefetchState]
  }
}

