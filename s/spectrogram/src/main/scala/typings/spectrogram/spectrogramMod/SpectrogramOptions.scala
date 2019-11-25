package typings.spectrogram.spectrogramMod

import typings.spectrogram.Anon_Enable
import typings.spectrogram.Anon_Height
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpectrogramOptions extends js.Object {
  var audio: js.UndefOr[Anon_Enable] = js.undefined
  var canvas: js.UndefOr[Anon_Height] = js.undefined
  var colors: js.UndefOr[
    js.Function1[/* steps */ Double, js.Array[String | CanvasGradient | CanvasPattern]]
  ] = js.undefined
}

object SpectrogramOptions {
  @scala.inline
  def apply(
    audio: Anon_Enable = null,
    canvas: Anon_Height = null,
    colors: /* steps */ Double => js.Array[String | CanvasGradient | CanvasPattern] = null
  ): SpectrogramOptions = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(js.Any.fromFunction1(colors))
    __obj.asInstanceOf[SpectrogramOptions]
  }
}

