package typings
package properDashLockfileLib.properDashLockfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockOptions extends js.Object {
   // default: true
  var fs: js.UndefOr[js.Any] = js.undefined
   // default: graceful-fs
  var onCompromised: js.UndefOr[js.Function1[/* err */ stdLib.Error, _]] = js.undefined
   // default: 0
  var realpath: js.UndefOr[scala.Boolean] = js.undefined
   // default: stale/2
  var retries: js.UndefOr[scala.Double] = js.undefined
  var stale: js.UndefOr[scala.Double] = js.undefined
   // default: 10000
  var update: js.UndefOr[scala.Double] = js.undefined
}

