package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AudioPackingMode extends js.Object {
  var audioPackingMode: js.UndefOr[java.lang.String] = js.undefined
  var bitRate: js.UndefOr[java.lang.String] = js.undefined
  var channels: js.UndefOr[java.lang.String] = js.undefined
  var codec: js.UndefOr[java.lang.String] = js.undefined
  var sampleRate: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AudioPackingMode {
  @scala.inline
  def apply(
    audioPackingMode: java.lang.String = null,
    bitRate: java.lang.String = null,
    channels: java.lang.String = null,
    codec: java.lang.String = null,
    sampleRate: java.lang.String = null
  ): Anon_AudioPackingMode = {
    val __obj = js.Dynamic.literal()
    if (audioPackingMode != null) __obj.updateDynamic("audioPackingMode")(audioPackingMode)
    if (bitRate != null) __obj.updateDynamic("bitRate")(bitRate)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (codec != null) __obj.updateDynamic("codec")(codec)
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate)
    __obj.asInstanceOf[Anon_AudioPackingMode]
  }
}

