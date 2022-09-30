package typings.snapchatLensStudio

import typings.snapchatLensStudio.AnimationClip.PostInfinity
import typings.snapchatLensStudio.AnimationClip.RangeType
import typings.snapchatLensStudio.Component.AnimationMixer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Controls animation playback for a single animation layer. See also: AnimationMixer.
  */
trait AnimationMixerLayer
  extends StObject
     with ScriptObject {
  
  /** The name of the animation layer being used for this animation. */
  var animationLayerName: String
  
  /** Returns a copy of this AnimationMixerLayer, with the name changed to newName. */
  def clone(newName: String): AnimationMixerLayer
  
  /** The number of times this animation will play. If -1, the animation will loop forever. */
  var cycles: Double
  
  /** If true, the animation will stop having an effect. */
  var disabled: Boolean
  
  /** The framerate (frames per second) of the animation. */
  var fps: Double
  
  /** The starting point for this animation clip. If rangeType is set to Time, this is the point to start at in seconds. If rangeType is set to Frames, this is the frame number to start at. */
  var from: Double
  
  /** Returns the length of the animation in seconds. */
  def getDuration(): Double
  
  /** Returns the current playback position of the animation in seconds. */
  def getTime(): Double
  
  /** Returns whether the animation is currently playing. */
  def isPlaying(): Boolean
  
  /** The name of the AnimationMixerLayer. */
  var name: String
  
  /** Pauses the animation. */
  def pause(): Unit
  
  /**
    * Defines the animation’s looping behavior. If set to AnimationClip.PostInfinity.Cycle, the animation will restart from the beginning each time it loops. If set to AnimationClip.PostInfinity.
    * Oscillate, the animation will switch between normal and reverse playback each time it loops. This is set to Cycle by default.
    */
  var postInfinity: PostInfinity
  
  /**
    * The range type used for defining the animation clip. If set to AnimationClip.RangeType.Time, to and from represent times in seconds. If set to AnimationClip.RangeType.Frames, to and from
    * represent frame numbers.
    */
  var rangeType: RangeType
  
  /** Resumes the animation if it has been paused. */
  def resume(): Unit
  
  /** If true, the animation will play play in reverse. */
  var reversed: Boolean
  
  /** A multiplying value for the speed of this animation. For example, a value of 2.0 will double animation speed, while a value of 0.5 will cut the speed in half. */
  var speedRatio: Double
  
  /** Starts playing the animation with an offset of offsetArg seconds. The animation will play cycles times, or loop forever if cycles is -1. */
  def start(offset: Double, cycles: Double): Unit
  
  /** Starts the animation with an offset of offsetArg seconds. The animation will play cycles times, or loop forever if cycles is -1. eventCallback will be called after the animation finishes. */
  def startWithCallback(
    offset: Double,
    cycles: Double,
    eventCallback: js.Function2[/* name */ String, /* animationMixer */ AnimationMixer, Unit]
  ): Unit
  
  /** Stops the animation from playing and jumps to the animation’s end. */
  def stop(): Unit
  
  /** The ending point for this animation clip. If rangeType is set to Time, this is the point to end at in seconds. If rangeType is set to Frames, this is the frame number to end at. */
  var to: Double
  
  /** The weight of this animation layer. Range is from [0-1], 0 being no animation strength and 1 being full animation strength. */
  var weight: Double
}
object AnimationMixerLayer {
  
  inline def apply(
    animationLayerName: String,
    clone_ : String => AnimationMixerLayer,
    cycles: Double,
    disabled: Boolean,
    fps: Double,
    from: Double,
    getDuration: () => Double,
    getTime: () => Double,
    getTypeName: () => String,
    isOfType: String => Boolean,
    isPlaying: () => Boolean,
    name: String,
    pause: () => Unit,
    postInfinity: PostInfinity,
    rangeType: RangeType,
    resume: () => Unit,
    reversed: Boolean,
    speedRatio: Double,
    start: (Double, Double) => Unit,
    startWithCallback: (Double, Double, js.Function2[/* name */ String, /* animationMixer */ AnimationMixer, Unit]) => Unit,
    stop: () => Unit,
    to: Double,
    weight: Double
  ): AnimationMixerLayer = {
    val __obj = js.Dynamic.literal(animationLayerName = animationLayerName.asInstanceOf[js.Any], cycles = cycles.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], getDuration = js.Any.fromFunction0(getDuration), getTime = js.Any.fromFunction0(getTime), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isPlaying = js.Any.fromFunction0(isPlaying), name = name.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), postInfinity = postInfinity.asInstanceOf[js.Any], rangeType = rangeType.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), reversed = reversed.asInstanceOf[js.Any], speedRatio = speedRatio.asInstanceOf[js.Any], start = js.Any.fromFunction2(start), startWithCallback = js.Any.fromFunction3(startWithCallback), stop = js.Any.fromFunction0(stop), to = to.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.asInstanceOf[AnimationMixerLayer]
  }
  
  extension [Self <: AnimationMixerLayer](x: Self) {
    
    inline def setAnimationLayerName(value: String): Self = StObject.set(x, "animationLayerName", value.asInstanceOf[js.Any])
    
    inline def setClone_(value: String => AnimationMixerLayer): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
    
    inline def setCycles(value: Double): Self = StObject.set(x, "cycles", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
    
    inline def setGetTime(value: () => Double): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
    
    inline def setIsPlaying(value: () => Boolean): Self = StObject.set(x, "isPlaying", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPostInfinity(value: PostInfinity): Self = StObject.set(x, "postInfinity", value.asInstanceOf[js.Any])
    
    inline def setRangeType(value: RangeType): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
    
    inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setSpeedRatio(value: Double): Self = StObject.set(x, "speedRatio", value.asInstanceOf[js.Any])
    
    inline def setStart(value: (Double, Double) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setStartWithCallback(
      value: (Double, Double, js.Function2[/* name */ String, /* animationMixer */ AnimationMixer, Unit]) => Unit
    ): Self = StObject.set(x, "startWithCallback", js.Any.fromFunction3(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
