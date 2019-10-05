package typings.reactDashNativeDashGoby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashGobyMod {
  import typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.SyncStatus

  type DownloadProgressCallback = js.Function1[/* progress */ DownloadProgress, Unit]
  type SyncStatusChangedCallback = js.Function1[/* status */ SyncStatus, Unit]
}
