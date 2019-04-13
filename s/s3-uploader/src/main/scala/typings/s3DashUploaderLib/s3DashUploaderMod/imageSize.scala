package typings
package s3DashUploaderLib.s3DashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait imageSize extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object imageSize {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): imageSize = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[imageSize]
  }
}

