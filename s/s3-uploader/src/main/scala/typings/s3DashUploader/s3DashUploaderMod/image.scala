package typings.s3DashUploader.s3DashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait image extends js.Object {
  var etag: String
  var format: String
  var height: Double
  var original: Boolean
  var path: String
  var size: String
  var src: String
  var url: String
  var width: Double
}

object image {
  @scala.inline
  def apply(
    etag: String,
    format: String,
    height: Double,
    original: Boolean,
    path: String,
    size: String,
    src: String,
    url: String,
    width: Double
  ): image = {
    val __obj = js.Dynamic.literal(etag = etag, format = format, height = height, original = original, path = path, size = size, src = src, url = url, width = width)
  
    __obj.asInstanceOf[image]
  }
}

