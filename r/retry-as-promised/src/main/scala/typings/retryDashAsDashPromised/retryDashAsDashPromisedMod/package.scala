package typings.retryDashAsDashPromised

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object retryDashAsDashPromisedMod {
  import typings.bluebird.bluebirdMod.Thenable
  import typings.bluebird.bluebirdMod.^
  import typings.retryDashAsDashPromised.Anon_Current
  import typings.std.Error
  import typings.std.RegExp

  type MatchOption = String | RegExp | Error
  type RetryAsPromisedStatic = js.Function2[/* callback */ RetryCallback[js.Any], /* options */ Options | Double, ^[js.Any]]
  type RetryCallback[T] = js.Function1[/* hasCurrent */ Anon_Current, Thenable[T]]
}
