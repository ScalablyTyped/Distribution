package typings.sphereEngineBrowser

import typings.sphereEngineBrowser.focusTargetMod.FocusTargetOptions
import typings.sphereEngineBrowser.mod.ConsoleOptions
import typings.sphereEngineBrowser.mod.default
import typings.sphereEngineBrowser.tweenMod.Easing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Collects all the built-in classes and objects provided as part of the Sphere Runtime into one
  * convenient package.
  */
object sphereRuntimeMod {
  
  @JSImport("sphere-runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Represents a text console. The player can use the console to view internal log messages as
    * well as enter commands to control the game's low-level workings.
    */
  @JSImport("sphere-runtime", "Console")
  @js.native
  /**
    * Construct a new console. There is rarely a need to make more than one.
    * @param options Options for the new console.
    */
  open class Console () extends default {
    def this(options: ConsoleOptions) = this()
  }
  
  /**
    * Allows you to read from structured binary files like those used for Sphere game
    * assets (maps, tilesets, etc.) based on a simple JSON read individual binary values
    * from the file.
    * @see FileStream
    */
  @JSImport("sphere-runtime", "DataStream")
  @js.native
  open class DataStream protected ()
    extends typings.sphereEngineBrowser.dataStreamMod.default {
    def this(filename: String, fileOp: FileOp) = this()
  }
  object DataStream {
    
    @JSImport("sphere-runtime", "DataStream")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Opens a file asynchronously and returns a promise for a `DataStream` that
      * provides access to the contents of the file.
      * @param filename refers to the SphereFS path to the file
      * @param fileOp specifies the file operation requested.
      */
    /* static member */
    inline def fromFile(filename: String, fileOp: FileOp): js.Promise[typings.sphereEngineBrowser.dataStreamMod.DataStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(filename.asInstanceOf[js.Any], fileOp.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.sphereEngineBrowser.dataStreamMod.DataStream]]
  }
  
  /**
    * Specifies the interpolation method for a tween.
    */
  @JSImport("sphere-runtime", "Easing")
  @js.native
  object Easing extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sphereEngineBrowser.tweenMod.Easing & Double] = js.native
    
    /* 0 */ val Back: typings.sphereEngineBrowser.tweenMod.Easing.Back & Double = js.native
    
    /* 1 */ val Bounce: typings.sphereEngineBrowser.tweenMod.Easing.Bounce & Double = js.native
    
    /* 2 */ val Circular: typings.sphereEngineBrowser.tweenMod.Easing.Circular & Double = js.native
    
    /* 3 */ val Cubic: typings.sphereEngineBrowser.tweenMod.Easing.Cubic & Double = js.native
    
    /* 4 */ val Elastic: typings.sphereEngineBrowser.tweenMod.Easing.Elastic & Double = js.native
    
    /* 5 */ val Exponential: typings.sphereEngineBrowser.tweenMod.Easing.Exponential & Double = js.native
    
    /* 6 */ val Linear: typings.sphereEngineBrowser.tweenMod.Easing.Linear & Double = js.native
    
    /* 7 */ val Quadratic: typings.sphereEngineBrowser.tweenMod.Easing.Quadratic & Double = js.native
    
    /* 8 */ val Quartic: typings.sphereEngineBrowser.tweenMod.Easing.Quartic & Double = js.native
    
    /* 9 */ val Quintic: typings.sphereEngineBrowser.tweenMod.Easing.Quintic & Double = js.native
    
    /* 10 */ val Sine: typings.sphereEngineBrowser.tweenMod.Easing.Sine & Double = js.native
  }
  
  /**
    * Represents an entity which can receive input focus. It is strictly enforced that only one
    * `FocusTarget` can have the focus at a time and Z-order is automatically managed.
    */
  @JSImport("sphere-runtime", "FocusTarget")
  @js.native
  /**
    * Construct a new `FocusTarget`.
    * @param options Options for creating the new focus target.
    */
  open class FocusTarget ()
    extends typings.sphereEngineBrowser.focusTargetMod.default {
    def this(options: FocusTargetOptions) = this()
  }
  
  /**
    * Provides a means to log individual lines of text to a file, with associated timestamps for
    * each entry.
    */
  @JSImport("sphere-runtime", "Logger")
  @js.native
  open class Logger protected ()
    extends typings.sphereEngineBrowser.loggerMod.default {
    /**
      * Construct a `Logger` which writes to a specified file. If the file doesn't exist, it will
      * be created; otherwise, new entries will be appended to the existing file.
      * @param fileName SphereFS path of the log file.
      */
    def this(fileName: String) = this()
  }
  
  /**
    * Provides utility functions for controlling background music.
    */
  object Music {
    
    @JSImport("sphere-runtime", "Music")
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
  
  /**
    * Provides utility functions for rendering primitive shapes such as circles and rectangles.
    */
  object Prim {
    
    @JSImport("sphere-runtime", "Prim")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Render an entire texture as an 2D image to a surface.
      * @param surface Surface on which to render the image.
      * @param x       X coordinate of the upper-left corner on the surface.
      * @param y       Y coordinate of the upper-left corner on the surface.
      * @param texture Texture to be rendered.
      * @param mask    Optional color whose RGBA values will be multiplied with those of the
      *                texture. Use to tint the rendered image.
      */
    inline def blit(surface: Surface, x: Double, y: Double, texture: Texture): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blit")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], texture.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def blit(surface: Surface, x: Double, y: Double, texture: Texture, mask: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blit")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Render a portion of a texture as an 2D image to a surface.
      * @param surface Surface on which to render the image.
      * @param x       X coordinate of the upper-left corner on the surface.
      * @param y       Y coordinate of the upper-left corner on the surface.
      * @param texture Texture to be rendered.
      * @param sx      X coordinate, in pixels, of the top-left corner of the texture portion to draw.
      * @param sy      Y coordinate, in pixels, of the top-left corner of the texture portion to draw.
      * @param width   Width, in pixels, of the texture portion to draw.
      * @param height  Height, in pixels, of the texture portion to draw.
      * @param mask    Optional color whose RGBA values will be multiplied with those of the
      *                texture. Use to tint the rendered image.
      */
    inline def blitSection(
      surface: Surface,
      x: Double,
      y: Double,
      texture: Texture,
      sx: Double,
      sy: Double,
      width: Double,
      height: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blitSection")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def blitSection(
      surface: Surface,
      x: Double,
      y: Double,
      texture: Texture,
      sx: Double,
      sy: Double,
      width: Double,
      height: Double,
      mask: Color
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blitSection")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawCircle(surface: Surface, x: Double, y: Double, radius: Double, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawCircle")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawEllipse(surface: Surface, x: Double, y: Double, rx: Double, ry: Double, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawEllipse")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawLine(surface: Surface, x1: Double, y1: Double, x2: Double, y2: Double, thickness: Double, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawLine")(surface.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def drawLine(
      surface: Surface,
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      thickness: Double,
      color: Color,
      color2: Color
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawLine")(surface.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], color.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawPoint(surface: Surface, x: Double, y: Double, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPoint")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawRectangle(
      surface: Surface,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      thickness: Double,
      color: Color
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawRectangle")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawSolidCircle(surface: Surface, x: Double, y: Double, radius: Double, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidCircle")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def drawSolidCircle(surface: Surface, x: Double, y: Double, radius: Double, color: Color, color2: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidCircle")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], color.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawSolidEllipse(surface: Surface, x: Double, y: Double, rx: Double, ry: Double, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidEllipse")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def drawSolidEllipse(surface: Surface, x: Double, y: Double, rx: Double, ry: Double, color: Color, color2: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidEllipse")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], color.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawSolidRectangle(
      surface: Surface,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      colorUL: Color,
      colorUR: Color,
      colorLR: Color,
      colorLL: Color
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidRectangle")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], colorUL.asInstanceOf[js.Any], colorUR.asInstanceOf[js.Any], colorLR.asInstanceOf[js.Any], colorLL.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def drawSolidRectangle(surface: Surface, x: Double, y: Double, width: Double, height: Double, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidRectangle")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawSolidTriangle(
      surface: Surface,
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      color1: Color,
      color2: Color,
      color3: Color
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidTriangle")(surface.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], color3.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def drawSolidTriangle(
      surface: Surface,
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      color: Color
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidTriangle")(surface.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Fill an entire surface with a specified color.
      * @param surface The surface to fill.
      * @param color   Color to fill the surface with. Can be translucent, in which case the fill will be too.
      */
    inline def fill(surface: Surface, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(surface.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /**
    * Represents a sequence of values with optional query transformations applied. Queries can be
    * enumerated using `for..of` or additional query operations can be chained to produce a new
    * query.
    */
  @JSImport("sphere-runtime", "Query")
  @js.native
  open class Query[T] ()
    extends typings.sphereEngineBrowser.fromMod.Query[T]
  
  /**
    * Provides utility functions for generating different kinds of random values.
    */
  object Random {
    
    @JSImport("sphere-runtime", "Random")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Take a random sample which is either `true` or `false` depending on given odds.
      * @param odds A number between `0.0` and `1.0` specifying the percentage chance of
      *             returning `true`.
      */
    inline def chance(odds: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("chance")(odds.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Compute a random integer within a specified range.
      * @param min Highest value to return.
      * @param max Highest value to return.
      */
    inline def discrete(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("discrete")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Compute a random value according to the specified average. Over many samples, this
      * function will tend to a normal (Gaussian) distribution, or "bell curve".
      * @param mean Mean value. The sample distribution is centered around this value.
      * @param sigma Standard deviation. 68% of results are within 1x standard deviation, 95% are
      *              within 2x, etc.
      */
    inline def normal(mean: Double, sigma: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normal")(mean.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Sample a single random value from an array.
      * @param array Array whose values are being sampled.
      */
    inline def sample[T](array: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sample")(array.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Compute a randomized alphanumeric string.
      * @param length Number of characters to generate. If not specified, defaults to `10`.
      */
    inline def string(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[String]
    inline def string(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(length.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Compute a random value according to the specified average value and variance.
      * @param mean     Mean value. The sample distribution is centered around this value.
      * @param variance Maximum amount by which the value is allowed to deviate from the mean, in
      *                 either direction ("give or take").
      */
    inline def uniform(mean: Double, variance: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  /**
    * Represents a set of Dispatch jobs with associated state which can be controlled as a unit.
    */
  @JSImport("sphere-runtime", "Thread")
  @js.native
  /**
    * Construct a new `Thread`, optionally specifying options for its Dispatch jobs.
    * @param options Options for the thread's recurring Dispatch jobs.
    */
  abstract class Thread ()
    extends typings.sphereEngineBrowser.threadMod.default {
    def this(options: JobOptions) = this()
  }
  object Thread {
    
    @JSImport("sphere-runtime", "Thread")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Resolve a promise when one or more threads terminate. Use with `await`.
      * @param threads One or more threads to wait for. The promise resolves only once all
      *                specified threads have finished.
      */
    /* static member */
    inline def join(threads: typings.sphereEngineBrowser.threadMod.Thread*): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(threads.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * Provides a means to adjust the numeric values of an object over time via interpolation.
    */
  @JSImport("sphere-runtime", "Tween")
  @js.native
  open class Tween[T /* <: js.Object */] protected ()
    extends typings.sphereEngineBrowser.tweenMod.default[T] {
    /**
      * Construct a new `Tween` that can be used to adjust a specified object.
      * @param object     Object to animate with this tween.
      * @param easingType Easing function to use; `Easing.Sine` if not specified.
      */
    def this(`object`: T) = this()
    def this(`object`: T, easingType: Easing) = this()
  }
  
  /**
    * Get a new query for the elements of one or more arrays or other iterable objects.
    * @param sources One or more arrays or iterable objects to query.
    */
  inline def from[T](sources: js.Iterable[T]*): typings.sphereEngineBrowser.fromMod.Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(sources.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.sphereEngineBrowser.fromMod.Query[T]]
}
