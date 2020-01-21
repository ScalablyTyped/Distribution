package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationCacheEventMap extends js.Object {
  var cached: Event_
  var checking: Event_
  var downloading: Event_
  var error: Event_
  var noupdate: Event_
  var obsolete: Event_
  var progress: ProgressEvent[ApplicationCache_]
  var updateready: Event_
}

object ApplicationCacheEventMap {
  @scala.inline
  def apply(
    cached: Event_,
    checking: Event_,
    downloading: Event_,
    error: Event_,
    noupdate: Event_,
    obsolete: Event_,
    progress: ProgressEvent[ApplicationCache_],
    updateready: Event_
  ): ApplicationCacheEventMap = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], checking = checking.asInstanceOf[js.Any], downloading = downloading.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], noupdate = noupdate.asInstanceOf[js.Any], obsolete = obsolete.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], updateready = updateready.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplicationCacheEventMap]
  }
}

