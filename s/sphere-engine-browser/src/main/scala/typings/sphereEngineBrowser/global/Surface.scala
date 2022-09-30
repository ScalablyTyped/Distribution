package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a surface that can be used as a target for rendering operations. Surfaces can also be
  * used as textures.
  */
@JSGlobal("Surface")
@js.native
open class Surface protected ()
  extends StObject
     with typings.sphereEngineBrowser.Surface {
  /**
    * Construct a new surface from the contents of an image file. Not supported in Oozaru; prefer
    * `Surface.fromFile` in new code.
    * @deprecated
    * @param fileName SphereFS path to an image file.
    */
  def this(fileName: String) = this()
  /**
    * Construct a new surface of a given size and initial contents.
    * @param width   Width of the new texture, in pixels.
    * @param height  Height of the new texture, in pixels.
    * @param content Either a `Color` to fill the texture with or a buffer of RGBA pixels.
    */
  def this(width: Double, height: Double) = this()
  def this(width: Double, height: Double, content: js.typedarray.ArrayBuffer) = this()
  def this(width: Double, height: Double, content: typings.sphereEngineBrowser.Color) = this()
}
object Surface {
  
  @JSGlobal("Surface")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A surface representing the backbuffer. The contents of `Surface.Screen` are presented to the
    * screen at the end of every frame's Render phase.
    */
  /* static member */
  @JSGlobal("Surface.Screen")
  @js.native
  val Screen: typings.sphereEngineBrowser.Surface = js.native
  
  /**
    * Create a new surface initialized from the contents of an image file. The image is loaded in
    * the background; the promise resolves once the surface is ready for use.
    * @returns A promise for the new surface.
    */
  /* static member */
  inline def fromFile(fileName: String): js.Promise[typings.sphereEngineBrowser.Surface] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(fileName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.sphereEngineBrowser.Surface]]
}
