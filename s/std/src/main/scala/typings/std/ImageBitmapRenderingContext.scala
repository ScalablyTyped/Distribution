package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageBitmapRenderingContext extends _RenderingContext {
  /**
    * Returns the canvas element that the context is bound to.
    */
  val canvas: HTMLCanvasElement = js.native
  def transferFromImageBitmap(): Unit = js.native
  /**
    * Replaces contents of the canvas element to which context
    * is bound with a transparent black bitmap whose size corresponds to the width and height
    * content attributes of the canvas element.
    */
  def transferFromImageBitmap(bitmap: ImageBitmap): Unit = js.native
}

@JSGlobal("ImageBitmapRenderingContext")
@js.native
class ImageBitmapRenderingContextCls () extends ImageBitmapRenderingContext

@JSGlobal("ImageBitmapRenderingContext")
@js.native
object ImageBitmapRenderingContext extends Instantiable0[ImageBitmapRenderingContext]

