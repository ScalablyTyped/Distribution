package typings
package s3DashUploaderLib.s3DashUploaderMod.UploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait image extends js.Object {
  var etag: java.lang.String
  var format: java.lang.String
  var height: scala.Double
  var original: scala.Boolean
  var path: java.lang.String
  var size: java.lang.String
  var src: java.lang.String
  var url: java.lang.String
  var width: scala.Double
}

object image {
  @scala.inline
  def apply(
    etag: java.lang.String,
    format: java.lang.String,
    height: scala.Double,
    original: scala.Boolean,
    path: java.lang.String,
    size: java.lang.String,
    src: java.lang.String,
    url: java.lang.String,
    width: scala.Double
  ): image = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("original")(original)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("src")(src)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[image]
  }
}

