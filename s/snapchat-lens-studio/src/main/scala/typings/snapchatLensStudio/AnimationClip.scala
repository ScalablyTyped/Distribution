package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnimationClip {
  
  @js.native
  sealed trait PostInfinity extends StObject
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
    
    /** The animation will restart from the beginning each time it loops. */
    @js.native
    sealed trait Cycle
      extends StObject
         with PostInfinity
    
    /** The animation will switch between normal and reverse playback each time it loops. */
    @js.native
    sealed trait Oscillate
      extends StObject
         with PostInfinity
  }
  
  @js.native
  sealed trait RangeType extends StObject
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
    
    /** Range is specified by start and end frame numbers */
    @js.native
    sealed trait Frames
      extends StObject
         with RangeType
    
    /** Range is specified by start and end time, in seconds */
    @js.native
    sealed trait Time
      extends StObject
         with RangeType
  }
}
