package typings.s3DashUploader.s3DashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var colorSpace: String
  var compression: String
  var fileSize: String
  var format: String
  var imageSize: typings.s3DashUploader.s3DashUploaderMod.imageSize
  var orientation: String
  var quallity: String
}

object Meta {
  @scala.inline
  def apply(
    colorSpace: String,
    compression: String,
    fileSize: String,
    format: String,
    imageSize: imageSize,
    orientation: String,
    quallity: String
  ): Meta = {
    val __obj = js.Dynamic.literal(colorSpace = colorSpace, compression = compression, fileSize = fileSize, format = format, imageSize = imageSize, orientation = orientation, quallity = quallity)
  
    __obj.asInstanceOf[Meta]
  }
}

