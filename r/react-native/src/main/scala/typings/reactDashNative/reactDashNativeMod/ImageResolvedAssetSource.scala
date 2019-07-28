package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageResolvedAssetSource extends js.Object {
  var height: Double
  var scale: Double
  var uri: String
  var width: Double
}

object ImageResolvedAssetSource {
  @scala.inline
  def apply(height: Double, scale: Double, uri: String, width: Double): ImageResolvedAssetSource = {
    val __obj = js.Dynamic.literal(height = height, scale = scale, uri = uri, width = width)
  
    __obj.asInstanceOf[ImageResolvedAssetSource]
  }
}

