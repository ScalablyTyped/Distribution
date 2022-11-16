package typings.std

import typings.std.stdStrings.`2d`
import typings.std.stdStrings.bitmaprenderer
import typings.std.stdStrings.webgl
import typings.std.stdStrings.webgl2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods for manipulating the layout and presentation of <canvas> elements. The HTMLCanvasElement interface also inherits the properties and methods of the HTMLElement interface. */
@js.native
trait HTMLCanvasElement
  extends StObject
     with HTMLElement
     with CanvasImageSource
     with TexImageSource {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def captureStream(): MediaStream = js.native
  def captureStream(frameRequestRate: Double): MediaStream = js.native
  
  /* standard dom */
  def getContext(contextId: java.lang.String): RenderingContext | Null = js.native
  def getContext(contextId: java.lang.String, options: Any): RenderingContext | Null = js.native
  /**
    * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
    * @param contextId The identifier (ID) of the type of canvas to create. Internet Explorer 9 and Internet Explorer 10 support only a 2-D context using canvas.getContext("2d"); IE11 Preview also supports 3-D or WebGL context using canvas.getContext("experimental-webgl");
    */
  /* standard dom */
  @JSName("getContext")
  def getContext_2d(contextId: `2d`): CanvasRenderingContext2D | Null = js.native
  @JSName("getContext")
  def getContext_2d(contextId: `2d`, options: CanvasRenderingContext2DSettings): CanvasRenderingContext2D | Null = js.native
  /* standard dom */
  @JSName("getContext")
  def getContext_bitmaprenderer(contextId: bitmaprenderer): ImageBitmapRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_bitmaprenderer(contextId: bitmaprenderer, options: ImageBitmapRenderingContextSettings): ImageBitmapRenderingContext | Null = js.native
  /* standard dom */
  @JSName("getContext")
  def getContext_webgl(contextId: webgl): WebGLRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webgl, options: WebGLContextAttributes): WebGLRenderingContext | Null = js.native
  /* standard dom */
  @JSName("getContext")
  def getContext_webgl2(contextId: webgl2): WebGL2RenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl2(contextId: webgl2, options: WebGLContextAttributes): WebGL2RenderingContext | Null = js.native
  
  /** Gets or sets the height of a canvas element on a document. */
  /* standard dom */
  var height: Double = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def toBlob(callback: BlobCallback): Unit = js.native
  def toBlob(callback: BlobCallback, `type`: java.lang.String): Unit = js.native
  def toBlob(callback: BlobCallback, `type`: java.lang.String, quality: Any): Unit = js.native
  def toBlob(callback: BlobCallback, `type`: Unit, quality: Any): Unit = js.native
  
  /**
    * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
    * @param type The standard MIME type for the image format to return. If you do not specify this parameter, the default value is a PNG format image.
    */
  /* standard dom */
  def toDataURL(): java.lang.String = js.native
  def toDataURL(`type`: java.lang.String): java.lang.String = js.native
  def toDataURL(`type`: java.lang.String, quality: Any): java.lang.String = js.native
  def toDataURL(`type`: Unit, quality: Any): java.lang.String = js.native
  
  /* standard dom */
  def transferControlToOffscreen(): OffscreenCanvas = js.native
  
  /** Gets or sets the width of a canvas element on a document. */
  /* standard dom */
  var width: Double = js.native
}
