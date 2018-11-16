package typings
package reactDashNativeDashGobyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashGobyMod {
  type DownloadProgressCallback = js.Function1[/* progress */ DownloadProgress, scala.Unit]
  type SyncStatusChangedCallback = js.Function1[
    /* status */ reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.SyncStatus, 
    scala.Unit
  ]
}
