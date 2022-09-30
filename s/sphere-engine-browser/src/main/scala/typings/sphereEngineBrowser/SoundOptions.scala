package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies options for playing back an audio sample. */
trait SoundOptions extends StObject {
  
  /**
    * L/R stereo balance. 0.0 is centered, +/- 1.0 is full right/left respectively.
    * @default 0.0
    */
  var pan: js.UndefOr[Double] = js.undefined
  
  /**
    * Playback speed. 1.0 is normal speed.
    * @default 1.0
    */
  var speed: js.UndefOr[Double] = js.undefined
  
  /**
    * Volume, as a percentage of the mixer's master volume. Sometimes called "gain".
    * @default 1.0
    */
  var volume: js.UndefOr[Double] = js.undefined
}
object SoundOptions {
  
  inline def apply(): SoundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoundOptions]
  }
  
  extension [Self <: SoundOptions](x: Self) {
    
    inline def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
