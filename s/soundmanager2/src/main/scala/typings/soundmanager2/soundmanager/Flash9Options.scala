package typings.soundmanager2.soundmanager

import typings.soundmanager2.soundmanager2Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flash9Options extends js.Object {
  
  var isMovieStar: js.UndefOr[`true` | Null] = js.native
  
  var onbufferchange: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  var ondataerror: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  var onfailure: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  var useEQData: js.UndefOr[Boolean] = js.native
  
  var usePeakData: js.UndefOr[Boolean] = js.native
  
  var useWaveformData: js.UndefOr[Boolean] = js.native
}
object Flash9Options {
  
  @scala.inline
  def apply(): Flash9Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flash9Options]
  }
  
  @scala.inline
  implicit class Flash9OptionsOps[Self <: Flash9Options] (val x: Self) extends AnyVal {
    
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
    def setIsMovieStar(value: `true`): Self = this.set("isMovieStar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMovieStar: Self = this.set("isMovieStar", js.undefined)
    
    @scala.inline
    def setIsMovieStarNull: Self = this.set("isMovieStar", null)
    
    @scala.inline
    def setOnbufferchange(value: () => Unit): Self = this.set("onbufferchange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnbufferchange: Self = this.set("onbufferchange", js.undefined)
    
    @scala.inline
    def setOnbufferchangeNull: Self = this.set("onbufferchange", null)
    
    @scala.inline
    def setOndataerror(value: () => Unit): Self = this.set("ondataerror", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOndataerror: Self = this.set("ondataerror", js.undefined)
    
    @scala.inline
    def setOndataerrorNull: Self = this.set("ondataerror", null)
    
    @scala.inline
    def setOnfailure(value: () => Unit): Self = this.set("onfailure", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnfailure: Self = this.set("onfailure", js.undefined)
    
    @scala.inline
    def setOnfailureNull: Self = this.set("onfailure", null)
    
    @scala.inline
    def setUseEQData(value: Boolean): Self = this.set("useEQData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEQData: Self = this.set("useEQData", js.undefined)
    
    @scala.inline
    def setUsePeakData(value: Boolean): Self = this.set("usePeakData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePeakData: Self = this.set("usePeakData", js.undefined)
    
    @scala.inline
    def setUseWaveformData(value: Boolean): Self = this.set("useWaveformData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseWaveformData: Self = this.set("useWaveformData", js.undefined)
  }
}
