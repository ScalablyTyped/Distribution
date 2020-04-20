package typings.reactAdaptiveHooks.mediaCapabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoMediaConfiguration extends js.Object {
  var bitrate: Double
  var contentType: String
  var framerate: Double
  var height: Double
  var width: Double
}

object VideoMediaConfiguration {
  @scala.inline
  def apply(bitrate: Double, contentType: String, framerate: Double, height: Double, width: Double): VideoMediaConfiguration = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], framerate = framerate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoMediaConfiguration]
  }
}

