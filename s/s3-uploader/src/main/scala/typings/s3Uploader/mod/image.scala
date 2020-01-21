package typings.s3Uploader.mod

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
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[image]
  }
}

