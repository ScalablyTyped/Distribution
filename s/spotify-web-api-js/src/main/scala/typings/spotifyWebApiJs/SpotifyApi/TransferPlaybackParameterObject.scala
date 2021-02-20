package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferPlaybackParameterObject extends StObject {
  
  var play: js.UndefOr[Boolean] = js.native
}
object TransferPlaybackParameterObject {
  
  @scala.inline
  def apply(): TransferPlaybackParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferPlaybackParameterObject]
  }
  
  @scala.inline
  implicit class TransferPlaybackParameterObjectMutableBuilder[Self <: TransferPlaybackParameterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlay(value: Boolean): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
  }
}
