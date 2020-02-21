package typings.reactNativeBackgroundDownloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNBackgroundDownloader extends js.Object {
  var Network: typings.reactNativeBackgroundDownloader.mod.Network = js.native
  var Priority: typings.reactNativeBackgroundDownloader.mod.Priority = js.native
  @JSName("checkForExistingDownloads")
  var checkForExistingDownloads_Original: CheckForExistingDownloads_ = js.native
  var directories: Directories_ = js.native
  @JSName("download")
  var download_Original: Download_ = js.native
  @JSName("setHeaders")
  var setHeaders_Original: SetHeaders_ = js.native
  def checkForExistingDownloads(): js.Promise[js.Array[DownloadTask]] = js.native
  def download(options: DownloadOption): DownloadTask = js.native
  def setHeaders(h: DownloadHeaders): Unit = js.native
}

