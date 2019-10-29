package typings.reactDashRelay.libRelayDashExperimentalUseRefetchableFragmentNodeMod

import typings.reactDashRelay.libRelayDashExperimentalQueryResourceMod.FetchPolicy
import typings.reactDashRelay.libRelayDashExperimentalQueryResourceMod.RenderPolicy
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var environment: js.UndefOr[Environment] = js.undefined
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var fragmentIdentifier: js.UndefOr[String] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* args */ Error | Null, Unit]] = js.undefined
  var refetchVariables: js.UndefOr[Variables] = js.undefined
  var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Action {
  @scala.inline
  def apply(
    environment: Environment = null,
    fetchPolicy: FetchPolicy = null,
    fragmentIdentifier: String = null,
    onComplete: /* args */ Error | Null => Unit = null,
    refetchVariables: Variables = null,
    renderPolicy: RenderPolicy = null,
    `type`: String = null
  ): Action = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (fragmentIdentifier != null) __obj.updateDynamic("fragmentIdentifier")(fragmentIdentifier)
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (refetchVariables != null) __obj.updateDynamic("refetchVariables")(refetchVariables)
    if (renderPolicy != null) __obj.updateDynamic("renderPolicy")(renderPolicy)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Action]
  }
}

