package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageResolvedAssetSource extends js.Object {
  var height: scala.Double
  var scale: scala.Double
  var uri: java.lang.String
  var width: scala.Double
}

object ImageResolvedAssetSource {
  @scala.inline
  def apply(height: scala.Double, scale: scala.Double, uri: java.lang.String, width: scala.Double): ImageResolvedAssetSource = {
    val __obj = js.Dynamic.literal(height = height, scale = scale, uri = uri, width = width)
  
    __obj.asInstanceOf[ImageResolvedAssetSource]
  }
}

