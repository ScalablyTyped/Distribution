package typings.reactNativeBackgroundDownloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOption extends js.Object {
  var destination: String
  var headers: js.UndefOr[DownloadHeaders] = js.undefined
  var id: String
  var url: String
}

object DownloadOption {
  @scala.inline
  def apply(destination: String, id: String, url: String, headers: DownloadHeaders = null): DownloadOption = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOption]
  }
}

