package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletedResult extends js.Object {
  var avinfo: js.UndefOr[AvAudioInfo] = js.undefined
  var bucket: java.lang.String
  var ext: java.lang.String
  var imageInfo: js.UndefOr[AvImageInfo] = js.undefined
  var key: java.lang.String
  var name: java.lang.String
  var persistentid: java.lang.String
  var sec: java.lang.String
  var size: scala.Double
}

object CompletedResult {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    ext: java.lang.String,
    key: java.lang.String,
    name: java.lang.String,
    persistentid: java.lang.String,
    sec: java.lang.String,
    size: scala.Double,
    avinfo: AvAudioInfo = null,
    imageInfo: AvImageInfo = null
  ): CompletedResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucket")(bucket)
    __obj.updateDynamic("ext")(ext)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("persistentid")(persistentid)
    __obj.updateDynamic("sec")(sec)
    __obj.updateDynamic("size")(size)
    if (avinfo != null) __obj.updateDynamic("avinfo")(avinfo)
    if (imageInfo != null) __obj.updateDynamic("imageInfo")(imageInfo)
    __obj.asInstanceOf[CompletedResult]
  }
}

