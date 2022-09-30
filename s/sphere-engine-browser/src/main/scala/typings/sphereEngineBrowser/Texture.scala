package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an image used for texturing `Shape` primitives.
  */
@js.native
trait Texture extends StObject {
  
  /**
    * Get the raw RGBA pixel data from this texture. May be slow!
    */
  def download(): js.typedarray.Uint8ClampedArray = js.native
  
  /**
    * The SphereFS path of the image file used to create the texture, or `null` for non-file-based
    * textures.
    */
  val fileName: String | Null = js.native
  
  /** Height of the texture image, in pixels. */
  val height: Double = js.native
  
  /**
    * Upload new RGBA pixel data to this texture.
    * @param data A buffer with the new RGBA pixel values.
    */
  def upload(data: js.typedarray.ArrayBuffer): Unit = js.native
  def upload(data: js.typedarray.ArrayBufferView): Unit = js.native
  
  /** Width of the texture image, in pixels. */
  val width: Double = js.native
}
