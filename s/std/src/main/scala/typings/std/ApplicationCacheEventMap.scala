package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationCacheEventMap extends js.Object {
  var cached: Event
  var checking: Event
  var downloading: Event
  var error: Event
  var noupdate: Event
  var obsolete: Event
  var progress: ProgressEvent[ApplicationCache]
  var updateready: Event
}

object ApplicationCacheEventMap {
  @scala.inline
  def apply(
    cached: Event,
    checking: Event,
    downloading: Event,
    error: Event,
    noupdate: Event,
    obsolete: Event,
    progress: ProgressEvent[ApplicationCache],
    updateready: Event
  ): ApplicationCacheEventMap = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], checking = checking.asInstanceOf[js.Any], downloading = downloading.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], noupdate = noupdate.asInstanceOf[js.Any], obsolete = obsolete.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], updateready = updateready.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCacheEventMap]
  }
}

