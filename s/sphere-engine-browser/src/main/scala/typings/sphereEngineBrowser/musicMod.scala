package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicMod {
  
  /**
    * Provides utility functions for controlling background music.
    */
  object default {
    
    @JSImport("music", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adjust the BGM volume, optionally over the course of several frames.
      * @param newVolume The target volume level.
      * @param numFrames The number of frames over which to adjust the volume.
      * @returns A promise that resolves when the volume reaches the new level.
      */
    inline def adjustVolume(newVolume: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustVolume")(newVolume.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def adjustVolume(newVolume: Double, numFrames: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("adjustVolume")(newVolume.asInstanceOf[js.Any], numFrames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Temporarily override the normal BGM with a specific track, with optional crossfade.
      * @param fileName   SphereFS path of the music track to play.
      * @param fadeFrames Duration of the optional crossfade transition, in frames.
      */
    inline def `override`(fileName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(fileName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def `override`(fileName: String, fadeFrames: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("override")(fileName.asInstanceOf[js.Any], fadeFrames.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Play a different track, replacing the track currently on top of the music stack.
      * @param fileName   SphereFS path of the music track to play.
      * @param fadeFrames Duration of the optional crossfade transition, in frames.
      */
    inline def play(fileName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("play")(fileName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def play(fileName: String, fadeFrames: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("play")(fileName.asInstanceOf[js.Any], fadeFrames.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Remove the music currently at the top of the music stack and resume the previously
      * playing track.
      * @param fadeFrames Duration of the optional crossfade transition, in frames.
      */
    inline def pop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[Unit]
    inline def pop(fadeFrames: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(fadeFrames.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Push a new track onto the top of the music stack. The previous track can be resumed by
      * calling `pop`.
      * @param fileName   SphereFS path of the music file to play.
      * @param fadeFrames Duration of the optional crossfade transition, in frames.
      */
    inline def push(fileName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(fileName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def push(fileName: String, fadeFrames: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(fileName.asInstanceOf[js.Any], fadeFrames.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Reset the music manager to normal operation after the game has called `override`.
      * @param fadeFrames Duration of the optional crossfade, in frames.
      */
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
    inline def reset(fadeFrames: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(fadeFrames.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
