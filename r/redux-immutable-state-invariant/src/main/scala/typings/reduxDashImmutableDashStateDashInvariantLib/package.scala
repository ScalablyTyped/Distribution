package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashImmutableDashStateDashInvariantLib {
  type immutableStateInvariantMiddlewareInterface = js.Function1[/* isImmutable */ js.UndefOr[isImmutableDefault], js.Any]
  type isImmutableDefault = js.Function1[/* value */ js.Any, scala.Boolean]
}
