package typings.s3DashUploader.s3DashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait imageSize extends js.Object {
  var height: Double
  var width: Double
}

object imageSize {
  @scala.inline
  def apply(height: Double, width: Double): imageSize = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[imageSize]
  }
}

