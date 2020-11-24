package typings.spotifyWebPlaybackSdk.anon

import org.scalablytyped.runtime.Instantiable1
import typings.spotifyWebPlaybackSdk.Spotify.PlayerInit
import typings.spotifyWebPlaybackSdk.Spotify.SpotifyPlayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSpotify extends js.Object {
  
  var SpotifyPlayer: Instantiable1[/* options */ PlayerInit, typings.spotifyWebPlaybackSdk.Spotify.SpotifyPlayer] = js.native
}
object TypeofSpotify {
  
  @scala.inline
  def apply(SpotifyPlayer: Instantiable1[/* options */ PlayerInit, SpotifyPlayer]): TypeofSpotify = {
    val __obj = js.Dynamic.literal(SpotifyPlayer = SpotifyPlayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSpotify]
  }
  
  @scala.inline
  implicit class TypeofSpotifyOps[Self <: TypeofSpotify] (val x: Self) extends AnyVal {
    
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
    def setSpotifyPlayer(value: Instantiable1[/* options */ PlayerInit, SpotifyPlayer]): Self = this.set("SpotifyPlayer", value.asInstanceOf[js.Any])
  }
}
