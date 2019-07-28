package typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemotePackage extends Package {
  /**
    * The URL at which the package is available for download.
    */
  var downloadUrl: String = js.native
  /**
    * Downloads the available update from the Goby service.
    *
    * @param downloadProgressCallback An optional callback that allows tracking the progress of the update while it is being downloaded.
    */
  def download(): js.Promise[LocalPackage] = js.native
  def download(downloadProgressCallback: DownloadProgressCallback): js.Promise[LocalPackage] = js.native
}

