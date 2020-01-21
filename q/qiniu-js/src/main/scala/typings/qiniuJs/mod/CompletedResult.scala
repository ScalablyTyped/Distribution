package typings.qiniuJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletedResult extends js.Object {
  var avinfo: js.UndefOr[AvAudioInfo] = js.undefined
  var bucket: String
  var ext: String
  var imageInfo: js.UndefOr[AvImageInfo] = js.undefined
  var key: String
  var name: String
  var persistentid: String
  var sec: String
  var size: Double
}

object CompletedResult {
  @scala.inline
  def apply(
    bucket: String,
    ext: String,
    key: String,
    name: String,
    persistentid: String,
    sec: String,
    size: Double,
    avinfo: AvAudioInfo = null,
    imageInfo: AvImageInfo = null
  ): CompletedResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], persistentid = persistentid.asInstanceOf[js.Any], sec = sec.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (avinfo != null) __obj.updateDynamic("avinfo")(avinfo.asInstanceOf[js.Any])
    if (imageInfo != null) __obj.updateDynamic("imageInfo")(imageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedResult]
  }
}

