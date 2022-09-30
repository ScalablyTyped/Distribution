package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls an animated texture resource. Can be accessed from Texture.control on an animated texture. See also: 2D Animation Guide. */
trait AnimatedTextureFileProvider
  extends StObject
     with TextureProvider {
  
  /** Returns the index of the frame that is currently playing. */
  def getCurrentPlayingFrame(): Double
  
  /** Returns how long the animation is in seconds. */
  def getDuration(): Double
  
  /** Returns the number of frames in the animation. */
  def getFramesCount(): Double
  
  /** Returns whether the animation was set to automatically play and loop. */
  var isAutoplay: Boolean
  
  /** Returns whether the animation is finished playing. */
  def isFinished(): Boolean
  
  /** Returns whether the animation is currently paused. */
  def isPaused(): Boolean
  
  /** If enabled, the animation will alternate between normal and reverse each time it loops. */
  var isPingPong: Boolean
  
  /** Returns whether the animation is currently playing. */
  def isPlaying(): Boolean
  
  /** Whether the animation plays in reverse. */
  var isReversed: Boolean
  
  /** Pauses the animation. */
  def pause(): Unit
  
  /** Pauses the animation at frame frameIndex. */
  def pauseAtFrame(frameIndex: Double): Unit
  
  /** Plays the animation loops times, starting with an offset of offset seconds. */
  def play(loops: Double, offset: Double): Unit
  
  /** Start playing the animation from frame frameIndex, loops times. */
  def playFromFrame(frameIndex: Double, loops: Double): Unit
  
  /** Resumes a paused animation from the frame that was last played. */
  def resume(): Unit
  
  /** Sets the callback function to be called whenever the animation stops playing. */
  def setOnFinish(eventCallback: js.Function1[/* animatedTexture */ this.type, Unit]): Unit
  
  /** Stops the animation. */
  def stop(): Unit
  
  /** The animation track used to control the frame animation. */
  var track: IntStepAnimationTrackKeyFramed
}
object AnimatedTextureFileProvider {
  
  inline def apply(
    getAspect: () => Double,
    getCurrentPlayingFrame: () => Double,
    getDuration: () => Double,
    getFramesCount: () => Double,
    getHeight: () => Double,
    getTypeName: () => String,
    getWidth: () => Double,
    isAutoplay: Boolean,
    isFinished: () => Boolean,
    isOfType: String => Boolean,
    isPaused: () => Boolean,
    isPingPong: Boolean,
    isPlaying: () => Boolean,
    isReversed: Boolean,
    pause: () => Unit,
    pauseAtFrame: Double => Unit,
    play: (Double, Double) => Unit,
    playFromFrame: (Double, Double) => Unit,
    resume: () => Unit,
    setOnFinish: js.Function1[AnimatedTextureFileProvider, Unit] => Unit,
    stop: () => Unit,
    track: IntStepAnimationTrackKeyFramed
  ): AnimatedTextureFileProvider = {
    val __obj = js.Dynamic.literal(getAspect = js.Any.fromFunction0(getAspect), getCurrentPlayingFrame = js.Any.fromFunction0(getCurrentPlayingFrame), getDuration = js.Any.fromFunction0(getDuration), getFramesCount = js.Any.fromFunction0(getFramesCount), getHeight = js.Any.fromFunction0(getHeight), getTypeName = js.Any.fromFunction0(getTypeName), getWidth = js.Any.fromFunction0(getWidth), isAutoplay = isAutoplay.asInstanceOf[js.Any], isFinished = js.Any.fromFunction0(isFinished), isOfType = js.Any.fromFunction1(isOfType), isPaused = js.Any.fromFunction0(isPaused), isPingPong = isPingPong.asInstanceOf[js.Any], isPlaying = js.Any.fromFunction0(isPlaying), isReversed = isReversed.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), pauseAtFrame = js.Any.fromFunction1(pauseAtFrame), play = js.Any.fromFunction2(play), playFromFrame = js.Any.fromFunction2(playFromFrame), resume = js.Any.fromFunction0(resume), setOnFinish = js.Any.fromFunction1(setOnFinish), stop = js.Any.fromFunction0(stop), track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedTextureFileProvider]
  }
  
  extension [Self <: AnimatedTextureFileProvider](x: Self) {
    
    inline def setGetCurrentPlayingFrame(value: () => Double): Self = StObject.set(x, "getCurrentPlayingFrame", js.Any.fromFunction0(value))
    
    inline def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
    
    inline def setGetFramesCount(value: () => Double): Self = StObject.set(x, "getFramesCount", js.Any.fromFunction0(value))
    
    inline def setIsAutoplay(value: Boolean): Self = StObject.set(x, "isAutoplay", value.asInstanceOf[js.Any])
    
    inline def setIsFinished(value: () => Boolean): Self = StObject.set(x, "isFinished", js.Any.fromFunction0(value))
    
    inline def setIsPaused(value: () => Boolean): Self = StObject.set(x, "isPaused", js.Any.fromFunction0(value))
    
    inline def setIsPingPong(value: Boolean): Self = StObject.set(x, "isPingPong", value.asInstanceOf[js.Any])
    
    inline def setIsPlaying(value: () => Boolean): Self = StObject.set(x, "isPlaying", js.Any.fromFunction0(value))
    
    inline def setIsReversed(value: Boolean): Self = StObject.set(x, "isReversed", value.asInstanceOf[js.Any])
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPauseAtFrame(value: Double => Unit): Self = StObject.set(x, "pauseAtFrame", js.Any.fromFunction1(value))
    
    inline def setPlay(value: (Double, Double) => Unit): Self = StObject.set(x, "play", js.Any.fromFunction2(value))
    
    inline def setPlayFromFrame(value: (Double, Double) => Unit): Self = StObject.set(x, "playFromFrame", js.Any.fromFunction2(value))
    
    inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    
    inline def setSetOnFinish(value: js.Function1[AnimatedTextureFileProvider, Unit] => Unit): Self = StObject.set(x, "setOnFinish", js.Any.fromFunction1(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setTrack(value: IntStepAnimationTrackKeyFramed): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
