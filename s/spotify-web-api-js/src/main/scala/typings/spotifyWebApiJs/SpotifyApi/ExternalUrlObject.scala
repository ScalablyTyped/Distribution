package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * External Url Object
  * [](https://developer.spotify.com/web-api/object-model/)
  *
  * Note that there might be other types available, it couldn't be found in the docs.
  */
@js.native
trait ExternalUrlObject extends js.Object {
  
  var spotify: String = js.native
}
object ExternalUrlObject {
  
  @scala.inline
  def apply(spotify: String): ExternalUrlObject = {
    val __obj = js.Dynamic.literal(spotify = spotify.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalUrlObject]
  }
  
  @scala.inline
  implicit class ExternalUrlObjectOps[Self <: ExternalUrlObject] (val x: Self) extends AnyVal {
    
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
    def setSpotify(value: String): Self = this.set("spotify", value.asInstanceOf[js.Any])
  }
}
