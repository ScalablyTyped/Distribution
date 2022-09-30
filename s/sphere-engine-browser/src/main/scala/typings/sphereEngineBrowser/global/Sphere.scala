package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides facilities for controlling the Sphere engine. */
object Sphere {
  
  @JSGlobal("Sphere")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The Sphere v2 API level supported by the engine. When new APIs are standardized, this value
    * is increased.
    */
  @JSGlobal("Sphere.APILevel")
  @js.native
  val APILevel: Double = js.native
  
  /** Name and version number of the build tool used to package the game. */
  @JSGlobal("Sphere.Compiler")
  @js.native
  val Compiler: String = js.native
  
  /** Name and version number of the Sphere engine in use. */
  @JSGlobal("Sphere.Engine")
  @js.native
  val Engine: String = js.native
  
  /**
    * Information about the current game.  All values are taken from the game's JSON manifest
    * (`game.json`).
    */
  object Game {
    
    @JSGlobal("Sphere.Game")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Sphere.Game.author")
    @js.native
    def author: String = js.native
    inline def author_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("author")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Sphere.Game.main")
    @js.native
    def main: String = js.native
    inline def main_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("main")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Sphere.Game.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Sphere.Game.resolution")
    @js.native
    def resolution: String = js.native
    inline def resolution_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolution")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Sphere.Game.saveId")
    @js.native
    def saveId: String = js.native
    inline def saveId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("saveId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Sphere.Game.summary")
    @js.native
    def summary: String = js.native
    inline def summary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summary")(x.asInstanceOf[js.Any])
  }
  
  /** Sphere API version supported by the engine. */
  @JSGlobal("Sphere.Version")
  @js.native
  val Version: Double = js.native
  
  /** Abort execution immediately with an error message. This error will not be catchable. */
  inline def abort(message: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** The current frame rate. The engine will try to maintain the FPS according to this value. */
  @JSGlobal("Sphere.frameRate")
  @js.native
  def frameRate: Double = js.native
  inline def frameRate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(x.asInstanceOf[js.Any])
  
  /** The maximum numer of consecutive frames the engine is allowed to skip. */
  @JSGlobal("Sphere.frameSkip")
  @js.native
  def frameSkip: Double = js.native
  inline def frameSkip_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameSkip")(x.asInstanceOf[js.Any])
  
  /**
    * `true` if the engine is currently in fullscreen mode, otherwise `false`. You can freely
    * change this value at any time.
    */
  @JSGlobal("Sphere.fullScreen")
  @js.native
  def fullScreen: Boolean = js.native
  inline def fullScreen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(x.asInstanceOf[js.Any])
  
  /**
    * If the main module exports a class, the engine automatically creates an instance of it on
    * startup. Use this to access that object from anywhere.
    */
  @JSGlobal("Sphere.main")
  @js.native
  def main: Any = js.native
  inline def main_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("main")(x.asInstanceOf[js.Any])
  
  /** Get the number of frames elapsed since the engine started. */
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  /** Restart the engine at the end of the current frame. */
  inline def restart(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restart")().asInstanceOf[Unit]
  
  /** Set the current backbuffer resolution. The contents of the backbuffer may be lost. */
  inline def setResolution(width: Double, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setResolution")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Shut down the engine at the end of the current frame. */
  inline def shutDown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shutDown")().asInstanceOf[Unit]
  
  /**
    * Get a promise that resolves after a given number of frames.  Use with `await`.
    * @param numFrames The number of frames to wait before resolving the promise.
    */
  inline def sleep(numFrames: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(numFrames.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
