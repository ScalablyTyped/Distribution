package typings.reactNativeGoby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DownloadProgressCallback = js.Function1[/* progress */ typings.reactNativeGoby.mod.DownloadProgress, scala.Unit]
  type SyncStatusChangedCallback = js.Function1[/* status */ typings.reactNativeGoby.mod.Goby.SyncStatus, scala.Unit]
}
