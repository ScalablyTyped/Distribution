package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffscreenCanvas
  extends CanvasImageSource
     with EventTarget {
  /**
    * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
    * They can be set, to replace the bitmap with a
    * new, transparent black bitmap of the specified dimensions (effectively resizing
    * it).
    */
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  /**
    * Returns a promise that will fulfill with a new Blob object representing a file
    * containing the image in the OffscreenCanvas object.
    * The argument, if provided, is a dictionary that controls the encoding options of the image
    * file to be created. The type
    * field specifies the file format and has a default value of "image/png"; that type
    * is also used if the requested type isn't supported. If the image format supports variable
    * quality (such as "image/jpeg"), then the quality field is a number in the range 0.0
    * to 1.0 inclusive indicating the desired quality level for the resulting image.
    */
  def convertToBlob(): js.Promise[Blob] = js.native
  def convertToBlob(options: ImageEncodeOptions): js.Promise[Blob] = js.native
  /**
    * Returns an object that exposes an API for drawing on the OffscreenCanvas
    * object. contextId specifies the desired API: "2d" or "webgl". options is handled by that
    * API.
    * This specification defines the "2d" context below,
    * which is similar but distinct from the "2d"
    * context that is created from a canvas element. There is also a specification that
    * defines a "webgl" context. [WEBGL]
    * Returns null if the canvas has already been initialized with another context type (e.g.,
    * trying to get a "2d" context after getting a
    * "webgl" context).
    */
  def getContext(contextId: OffscreenRenderingContextId): OffscreenRenderingContext | scala.Null = js.native
  def getContext(contextId: OffscreenRenderingContextId, options: js.Any): OffscreenRenderingContext | scala.Null = js.native
  /**
    * Returns a newly created ImageBitmap object with the image in the
    * OffscreenCanvas object. The image in the OffscreenCanvas object is
    * replaced with a new blank image.
    */
  def transferToImageBitmap(): ImageBitmap = js.native
}

@JSGlobal("OffscreenCanvas")
@js.native
class OffscreenCanvasCls protected () extends OffscreenCanvas {
  def this(width: scala.Double, height: scala.Double) = this()
}

@JSGlobal("OffscreenCanvas")
@js.native
object OffscreenCanvas
  extends org.scalablytyped.runtime.Instantiable2[/* width */ scala.Double, /* height */ scala.Double, OffscreenCanvas]

