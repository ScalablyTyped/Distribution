package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamConstraints extends StObject {
  
  /* standard dom */
  var audio: js.UndefOr[scala.Boolean | MediaTrackConstraints] = js.undefined
  
  /* standard dom */
  var peerIdentity: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var preferCurrentTab: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var video: js.UndefOr[scala.Boolean | MediaTrackConstraints] = js.undefined
}
object MediaStreamConstraints {
  
  inline def apply(): MediaStreamConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStreamConstraints]
  }
  
  extension [Self <: MediaStreamConstraints](x: Self) {
    
    inline def setAudio(value: scala.Boolean | MediaTrackConstraints): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setPeerIdentity(value: java.lang.String): Self = StObject.set(x, "peerIdentity", value.asInstanceOf[js.Any])
    
    inline def setPeerIdentityUndefined: Self = StObject.set(x, "peerIdentity", js.undefined)
    
    inline def setPreferCurrentTab(value: scala.Boolean): Self = StObject.set(x, "preferCurrentTab", value.asInstanceOf[js.Any])
    
    inline def setPreferCurrentTabUndefined: Self = StObject.set(x, "preferCurrentTab", js.undefined)
    
    inline def setVideo(value: scala.Boolean | MediaTrackConstraints): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
