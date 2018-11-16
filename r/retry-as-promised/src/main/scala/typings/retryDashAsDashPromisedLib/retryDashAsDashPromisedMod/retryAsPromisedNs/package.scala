package typings
package retryDashAsDashPromisedLib.retryDashAsDashPromisedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object retryAsPromisedNs {
  type MatchOption = java.lang.String | stdLib.RegExp | stdLib.Error
  type RetryAsPromisedStatic = js.Function2[
    /* callback */ RetryCallback[js.Any], 
    /* options */ Options | scala.Double, 
    bluebirdLib.bluebirdMod.namespaced[js.Any]
  ]
  type RetryCallback[T] = js.Function1[
    /* hasCurrent */ retryDashAsDashPromisedLib.Anon_Current, 
    bluebirdLib.bluebirdMod.BluebirdNs.Thenable[T]
  ]
}
