package typings.reactDashNativeDashGoby

import typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.GobyNs.SyncStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashGobyMod {
  type DownloadProgressCallback = js.Function1[/* progress */ DownloadProgress, Unit]
  type SyncStatusChangedCallback = js.Function1[/* status */ SyncStatus, Unit]
}
