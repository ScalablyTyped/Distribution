package typings.reactRelay.anon

import typings.reactRelay.queryResourceMod.RenderPolicy
import typings.reactRelay.useRefetchableFragmentNodeMod.Action
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchPolicy extends Action {
  var environment: typings.relayRuntime.relayStoreTypesMod.Environment
  var fetchPolicy: js.UndefOr[typings.reactRelay.queryResourceMod.FetchPolicy] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* args */ typings.std.Error | Null, Unit]] = js.undefined
  var refetchVariables: Variables
  var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
  var `type`: String
}

object FetchPolicy {
  @scala.inline
  def apply(
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    refetchVariables: Variables,
    `type`: String,
    fetchPolicy: typings.reactRelay.queryResourceMod.FetchPolicy = null,
    onComplete: /* args */ typings.std.Error | Null => Unit = null,
    renderPolicy: RenderPolicy = null
  ): FetchPolicy = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (renderPolicy != null) __obj.updateDynamic("renderPolicy")(renderPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchPolicy]
  }
}

