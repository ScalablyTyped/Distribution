package typings.stickyDashCluster

import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stickyDashClusterMod {
  type Callback = js.Function1[/* server */ Server, Unit]
  type InitializeFn = js.Function1[/* callback */ Callback, Unit]
}
