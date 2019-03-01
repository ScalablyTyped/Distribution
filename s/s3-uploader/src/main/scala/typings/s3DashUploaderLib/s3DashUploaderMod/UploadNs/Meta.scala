package typings
package s3DashUploaderLib.s3DashUploaderMod.UploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var colorSpace: java.lang.String
  var compression: java.lang.String
  var fileSize: java.lang.String
  var format: java.lang.String
  var imageSize: imageSize
  var orientation: java.lang.String
  var quallity: java.lang.String
}

object Meta {
  @scala.inline
  def apply(
    colorSpace: java.lang.String,
    compression: java.lang.String,
    fileSize: java.lang.String,
    format: java.lang.String,
    imageSize: imageSize,
    orientation: java.lang.String,
    quallity: java.lang.String
  ): Meta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colorSpace")(colorSpace)
    __obj.updateDynamic("compression")(compression)
    __obj.updateDynamic("fileSize")(fileSize)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("imageSize")(imageSize)
    __obj.updateDynamic("orientation")(orientation)
    __obj.updateDynamic("quallity")(quallity)
    __obj.asInstanceOf[Meta]
  }
}

