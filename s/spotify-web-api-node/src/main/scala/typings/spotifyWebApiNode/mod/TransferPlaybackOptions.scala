package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferPlaybackOptions extends StObject {
  
  var device_ids: js.Array[String]
  
  var play: js.UndefOr[Boolean] = js.undefined
}
object TransferPlaybackOptions {
  
  @scala.inline
  def apply(device_ids: js.Array[String]): TransferPlaybackOptions = {
    val __obj = js.Dynamic.literal(device_ids = device_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferPlaybackOptions]
  }
  
  @scala.inline
  implicit class TransferPlaybackOptionsMutableBuilder[Self <: TransferPlaybackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice_ids(value: js.Array[String]): Self = StObject.set(x, "device_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_idsVarargs(value: String*): Self = StObject.set(x, "device_ids", js.Array(value :_*))
    
    @scala.inline
    def setPlay(value: Boolean): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
  }
}
