package typings
package stickyDashClusterLib.stickyDashClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stickyClusterNs {
  type Callback = js.Function1[/* server */ nodeLib.httpMod.Server, scala.Unit]
  type InitializeFn = js.Function1[/* callback */ Callback, scala.Unit]
}
