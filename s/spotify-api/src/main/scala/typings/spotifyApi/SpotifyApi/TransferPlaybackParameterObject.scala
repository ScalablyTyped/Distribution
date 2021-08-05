package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferPlaybackParameterObject extends StObject {
  
  var play: js.UndefOr[Boolean] = js.undefined
}
object TransferPlaybackParameterObject {
  
  inline def apply(): TransferPlaybackParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferPlaybackParameterObject]
  }
  
  extension [Self <: TransferPlaybackParameterObject](x: Self) {
    
    inline def setPlay(value: Boolean): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
  }
}
