package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an image used for texturing `Shape` primitives.
  */
@JSGlobal("Texture")
@js.native
open class Texture protected ()
  extends StObject
     with typings.sphereEngineBrowser.Texture {
  /**
    * Construct a new texture from an image file or from the contents of a `Surface`
    * @param source SphereFS path of the image file to load, or a Surface object whose
    *               contents will be used for the new texture
    */
  def this(source: String) = this()
  def this(source: typings.sphereEngineBrowser.Surface) = this()
  /**
    * Construct a new texture of a given size and initial contents.
    * @param width   The width of the new texture, in pixels.
    * @param height  The height of the new texture, in pixels.
    * @param content Either a `Color` to fill the texture with or a buffer of RGBA pixels.
    */
  def this(width: Double, height: Double) = this()
  def this(width: Double, height: Double, content: js.typedarray.ArrayBuffer) = this()
  def this(width: Double, height: Double, content: js.typedarray.ArrayBufferView) = this()
  def this(width: Double, height: Double, content: typings.sphereEngineBrowser.Color) = this()
}
object Texture {
  
  @JSGlobal("Texture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a texture from an image file in the background. The promise resolves with a new
    * `Texture` once it's ready to use.
    * @param fileName SphereFS path of the image file to load.
    */
  /* static member */
  inline def fromFile(fileName: String): js.Promise[typings.sphereEngineBrowser.Texture] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(fileName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.sphereEngineBrowser.Texture]]
}
