package typings.spectrogram.mod

import typings.spectrogram.anon.Enable
import typings.spectrogram.anon.Height
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpectrogramOptions extends js.Object {
  
  var audio: js.UndefOr[Enable] = js.native
  
  var canvas: js.UndefOr[Height] = js.native
  
  var colors: js.UndefOr[
    js.Function1[/* steps */ Double, js.Array[String | CanvasGradient | CanvasPattern]]
  ] = js.native
}
object SpectrogramOptions {
  
  @scala.inline
  def apply(): SpectrogramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpectrogramOptions]
  }
  
  @scala.inline
  implicit class SpectrogramOptionsOps[Self <: SpectrogramOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAudio(value: Enable): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setCanvas(value: Height): Self = this.set("canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    
    @scala.inline
    def setColors(value: /* steps */ Double => js.Array[String | CanvasGradient | CanvasPattern]): Self = this.set("colors", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
  }
}
