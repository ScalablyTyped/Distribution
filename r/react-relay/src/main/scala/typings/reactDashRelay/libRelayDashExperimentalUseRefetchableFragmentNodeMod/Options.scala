package typings.reactDashRelay.libRelayDashExperimentalUseRefetchableFragmentNodeMod

import typings.reactDashRelay.libRelayDashExperimentalQueryResourceMod.FetchPolicy
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* arg */ Error | Null, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(fetchPolicy: FetchPolicy = null, onComplete: /* arg */ Error | Null => Unit = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    __obj.asInstanceOf[Options]
  }
}

