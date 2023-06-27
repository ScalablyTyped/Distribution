package typings.std

import typings.std.stdStrings.`2d`
import typings.std.stdStrings.bitmaprenderer
import typings.std.stdStrings.contextlost
import typings.std.stdStrings.contextrestored
import typings.std.stdStrings.webgl
import typings.std.stdStrings.webgl2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas) */
@js.native
trait OffscreenCanvas
  extends StObject
     with EventTarget
     with CanvasImageSource
     with TexImageSource
     with _Transferable {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_contextlost(`type`: contextlost, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextlost(
    `type`: contextlost,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextlost(
    `type`: contextlost,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextrestored(`type`: contextrestored, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextrestored(
    `type`: contextrestored,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextrestored(
    `type`: contextrestored,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Returns a promise that will fulfill with a new Blob object representing a file containing the image in the OffscreenCanvas object.
    *
    * The argument, if provided, is a dictionary that controls the encoding options of the image file to be created. The type field specifies the file format and has a default value of "image/png"; that type is also used if the requested type isn't supported. If the image format supports variable quality (such as "image/jpeg"), then the quality field is a number in the range 0.0 to 1.0 inclusive indicating the desired quality level for the resulting image.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/convertToBlob)
    */
  /* standard dom */
  def convertToBlob(): js.Promise[Blob] = js.native
  def convertToBlob(options: ImageEncodeOptions): js.Promise[Blob] = js.native
  
  /* standard dom */
  def getContext(contextId: OffscreenRenderingContextId): OffscreenRenderingContext | Null = js.native
  def getContext(contextId: OffscreenRenderingContextId, options: Any): OffscreenRenderingContext | Null = js.native
  /**
    * Returns an object that exposes an API for drawing on the OffscreenCanvas object. contextId specifies the desired API: "2d", "bitmaprenderer", "webgl", or "webgl2". options is handled by that API.
    *
    * This specification defines the "2d" context below, which is similar but distinct from the "2d" context that is created from a canvas element. The WebGL specifications define the "webgl" and "webgl2" contexts. [WEBGL]
    *
    * Returns null if the canvas has already been initialized with another context type (e.g., trying to get a "2d" context after getting a "webgl" context).
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/getContext)
    */
  /* standard dom */
  @JSName("getContext")
  def getContext_2d(contextId: `2d`): OffscreenCanvasRenderingContext2D | Null = js.native
  @JSName("getContext")
  def getContext_2d(contextId: `2d`, options: Any): OffscreenCanvasRenderingContext2D | Null = js.native
  /* standard dom */
  @JSName("getContext")
  def getContext_bitmaprenderer(contextId: bitmaprenderer): ImageBitmapRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_bitmaprenderer(contextId: bitmaprenderer, options: Any): ImageBitmapRenderingContext | Null = js.native
  /* standard dom */
  @JSName("getContext")
  def getContext_webgl(contextId: webgl): WebGLRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webgl, options: Any): WebGLRenderingContext | Null = js.native
  /* standard dom */
  @JSName("getContext")
  def getContext_webgl2(contextId: webgl2): WebGL2RenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl2(contextId: webgl2, options: Any): WebGL2RenderingContext | Null = js.native
  
  /**
    * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
    *
    * They can be set, to replace the bitmap with a new, transparent black bitmap of the specified dimensions (effectively resizing it).
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/height)
    */
  /* standard dom */
  var height: Double = js.native
  
  /* standard dom */
  var oncontextlost: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var oncontextrestored: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_contextlost(`type`: contextlost, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextlost(
    `type`: contextlost,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextlost(
    `type`: contextlost,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextrestored(`type`: contextrestored, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextrestored(
    `type`: contextrestored,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextrestored(
    `type`: contextrestored,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /**
    * Returns a newly created ImageBitmap object with the image in the OffscreenCanvas object. The image in the OffscreenCanvas object is replaced with a new blank image.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/transferToImageBitmap)
    */
  /* standard dom */
  def transferToImageBitmap(): ImageBitmap = js.native
  
  /**
    * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
    *
    * They can be set, to replace the bitmap with a new, transparent black bitmap of the specified dimensions (effectively resizing it).
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/width)
    */
  /* standard dom */
  var width: Double = js.native
}
