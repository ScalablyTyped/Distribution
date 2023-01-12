package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferPlaybackOptions extends StObject {
  
  var play: js.UndefOr[Boolean] = js.undefined
}
object TransferPlaybackOptions {
  
  inline def apply(): TransferPlaybackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferPlaybackOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferPlaybackOptions] (val x: Self) extends AnyVal {
    
    inline def setPlay(value: Boolean): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
  }
}
