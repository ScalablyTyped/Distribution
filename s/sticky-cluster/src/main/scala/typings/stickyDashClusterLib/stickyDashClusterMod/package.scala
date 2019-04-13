package typings
package stickyDashClusterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stickyDashClusterMod {
  type Callback = js.Function1[/* server */ nodeLib.httpMod.Server, scala.Unit]
  type InitializeFn = js.Function1[/* callback */ Callback, scala.Unit]
}
