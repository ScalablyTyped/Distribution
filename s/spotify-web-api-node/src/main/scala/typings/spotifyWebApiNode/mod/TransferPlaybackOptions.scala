package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferPlaybackOptions extends js.Object {
  
  var device_ids: js.Array[String] = js.native
  
  var play: js.UndefOr[Boolean] = js.native
}
object TransferPlaybackOptions {
  
  @scala.inline
  def apply(device_ids: js.Array[String]): TransferPlaybackOptions = {
    val __obj = js.Dynamic.literal(device_ids = device_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferPlaybackOptions]
  }
  
  @scala.inline
  implicit class TransferPlaybackOptionsOps[Self <: TransferPlaybackOptions] (val x: Self) extends AnyVal {
    
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
    def setDevice_idsVarargs(value: String*): Self = this.set("device_ids", js.Array(value :_*))
    
    @scala.inline
    def setDevice_ids(value: js.Array[String]): Self = this.set("device_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlay(value: Boolean): Self = this.set("play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
  }
}
