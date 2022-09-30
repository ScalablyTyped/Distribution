package typings.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnimationClip {
  
  /**
    * Used by AnimationMixerLayer for setting animation looping behavior.
    * ```
    * // Set an AnimationMixerLayer to oscillate when looping
    * //@input Component.AnimationMixer mixer
    *
    * var layer = script.mixer.getLayers()[0];
    * layer.postInfinity = AnimationClip.PostInfinity.Oscillate;
    * ```
    */
  @JSGlobal("AnimationClip.PostInfinity")
  @js.native
  object PostInfinity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.AnimationClip.PostInfinity & Double] = js.native
    
    /* 0 */ val Cycle: typings.snapchatLensStudio.AnimationClip.PostInfinity.Cycle & Double = js.native
    
    /* 1 */ val Oscillate: typings.snapchatLensStudio.AnimationClip.PostInfinity.Oscillate & Double = js.native
  }
  
  /**
    * Used by AnimationMixerLayer for setting animation clip range type.
    * ```
    * // Set an AnimationMixerLayer's range using start and end time
    * //@input Component.AnimationMixer mixer
    *
    * var layer = script.mixer.getLayers()[0];
    * layer.rangeType = AnimationClip.RangeType.Time;
    * layer.from = 1.0;
    * layer.to = 2.0;
    * ```
    */
  @JSGlobal("AnimationClip.RangeType")
  @js.native
  object RangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.AnimationClip.RangeType & Double] = js.native
    
    /* 1 */ val Frames: typings.snapchatLensStudio.AnimationClip.RangeType.Frames & Double = js.native
    
    /* 0 */ val Time: typings.snapchatLensStudio.AnimationClip.RangeType.Time & Double = js.native
  }
}
