package typings.retryDashAsDashPromised

import typings.bluebird.bluebirdMod.Thenable
import typings.retryDashAsDashPromised.Anon_Current
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object retryDashAsDashPromisedMod {
  type MatchOption = String | RegExp | Error
  type RetryAsPromisedStatic = js.Function2[
    /* callback */ RetryCallback[js.Any], 
    /* options */ Options | Double, 
    typings.bluebird.bluebirdMod.^[js.Any]
  ]
  type RetryCallback[T] = js.Function1[/* hasCurrent */ Anon_Current, Thenable[T]]
}
