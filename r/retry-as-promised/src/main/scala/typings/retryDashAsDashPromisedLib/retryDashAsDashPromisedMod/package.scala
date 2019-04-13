package typings
package retryDashAsDashPromisedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object retryDashAsDashPromisedMod {
  type MatchOption = java.lang.String | stdLib.RegExp | stdLib.Error
  type RetryAsPromisedStatic = js.Function2[
    /* callback */ RetryCallback[js.Any], 
    /* options */ Options | scala.Double, 
    bluebirdLib.bluebirdMod.^[js.Any]
  ]
  type RetryCallback[T] = js.Function1[
    /* hasCurrent */ retryDashAsDashPromisedLib.Anon_Current, 
    bluebirdLib.bluebirdMod.Thenable[T]
  ]
}
