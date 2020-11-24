package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferPlaybackParameterObject extends js.Object {
  
  var play: js.UndefOr[Boolean] = js.native
}
object TransferPlaybackParameterObject {
  
  @scala.inline
  def apply(): TransferPlaybackParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferPlaybackParameterObject]
  }
  
  @scala.inline
  implicit class TransferPlaybackParameterObjectOps[Self <: TransferPlaybackParameterObject] (val x: Self) extends AnyVal {
    
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
    def setPlay(value: Boolean): Self = this.set("play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
  }
}
