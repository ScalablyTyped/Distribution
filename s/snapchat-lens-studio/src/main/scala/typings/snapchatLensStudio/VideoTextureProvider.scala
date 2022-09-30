package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls a video texture resource. Can be accessed through Texture.control. Lens Studio v1.5.0+ */
trait VideoTextureProvider
  extends StObject
     with TextureProvider {
  
  /** Returns the number of times the video has played consecutively. */
  def getCurrentPlayCount(): Double
  
  /** Returns the status of the video resource. */
  def getStatus(): VideoStatus
  
  /** Pauses the video playback. */
  def pause(): Unit
  
  /** Plays the video playCount times. If playCount is less than 0, it loops infinitely. */
  def play(playCount: Double): Unit
  
  /** Resumes the video playback. */
  def resume(): Unit
  
  /** Sets callback as the function invoked when the video resource stops playing. */
  def setOnFinish(callback: js.Function0[Unit]): Unit
  
  /** Sets callback as the function invoked when the video resource is ready to be played. */
  def setOnReady(onReadyCallback: js.Function0[Unit]): Unit
  
  /** Stops the video playback. */
  def stop(): Unit
  
  /** The audio volume of the video resource, normalized from 0 to 1. */
  var volume: Double
}
object VideoTextureProvider {
  
  inline def apply(
    getAspect: () => Double,
    getCurrentPlayCount: () => Double,
    getHeight: () => Double,
    getStatus: () => VideoStatus,
    getTypeName: () => String,
    getWidth: () => Double,
    isOfType: String => Boolean,
    pause: () => Unit,
    play: Double => Unit,
    resume: () => Unit,
    setOnFinish: js.Function0[Unit] => Unit,
    setOnReady: js.Function0[Unit] => Unit,
    stop: () => Unit,
    volume: Double
  ): VideoTextureProvider = {
    val __obj = js.Dynamic.literal(getAspect = js.Any.fromFunction0(getAspect), getCurrentPlayCount = js.Any.fromFunction0(getCurrentPlayCount), getHeight = js.Any.fromFunction0(getHeight), getStatus = js.Any.fromFunction0(getStatus), getTypeName = js.Any.fromFunction0(getTypeName), getWidth = js.Any.fromFunction0(getWidth), isOfType = js.Any.fromFunction1(isOfType), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction1(play), resume = js.Any.fromFunction0(resume), setOnFinish = js.Any.fromFunction1(setOnFinish), setOnReady = js.Any.fromFunction1(setOnReady), stop = js.Any.fromFunction0(stop), volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoTextureProvider]
  }
  
  extension [Self <: VideoTextureProvider](x: Self) {
    
    inline def setGetCurrentPlayCount(value: () => Double): Self = StObject.set(x, "getCurrentPlayCount", js.Any.fromFunction0(value))
    
    inline def setGetStatus(value: () => VideoStatus): Self = StObject.set(x, "getStatus", js.Any.fromFunction0(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPlay(value: Double => Unit): Self = StObject.set(x, "play", js.Any.fromFunction1(value))
    
    inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    
    inline def setSetOnFinish(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "setOnFinish", js.Any.fromFunction1(value))
    
    inline def setSetOnReady(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "setOnReady", js.Any.fromFunction1(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
