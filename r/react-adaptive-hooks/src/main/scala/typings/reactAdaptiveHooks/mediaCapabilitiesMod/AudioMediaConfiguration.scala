package typings.reactAdaptiveHooks.mediaCapabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioMediaConfiguration extends js.Object {
  var bitrate: Double
  var channels: Double
  var contentType: String
  var samplerate: Double
}

object AudioMediaConfiguration {
  @scala.inline
  def apply(bitrate: Double, channels: Double, contentType: String, samplerate: Double): AudioMediaConfiguration = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], samplerate = samplerate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioMediaConfiguration]
  }
}

