package typings.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerInit extends js.Object {
  
  def getOAuthToken(cb: js.Function1[/* token */ String, Unit]): Unit = js.native
  
  var name: String = js.native
  
  var volume: js.UndefOr[Double] = js.native
}
object PlayerInit {
  
  @scala.inline
  def apply(getOAuthToken: js.Function1[/* token */ String, Unit] => Unit, name: String): PlayerInit = {
    val __obj = js.Dynamic.literal(getOAuthToken = js.Any.fromFunction1(getOAuthToken), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerInit]
  }
  
  @scala.inline
  implicit class PlayerInitOps[Self <: PlayerInit] (val x: Self) extends AnyVal {
    
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
    def setGetOAuthToken(value: js.Function1[/* token */ String, Unit] => Unit): Self = this.set("getOAuthToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
}
