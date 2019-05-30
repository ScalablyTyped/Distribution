package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties and methods for manipulating the layout and presentation of <canvas> elements. The HTMLCanvasElement interface also inherits the properties and methods of the HTMLElement interface. */
@js.native
trait HTMLCanvasElement
  extends HTMLElement
     with CanvasImageSource
     with TexImageSource {
  /**
    * Gets or sets the height of a canvas element on a document.
    */
  var height: scala.Double = js.native
  /**
    * Gets or sets the width of a canvas element on a document.
    */
  var width: scala.Double = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def getContext(contextId: java.lang.String): CanvasRenderingContext2D | WebGLRenderingContext | scala.Null = js.native
  def getContext(contextId: java.lang.String, contextAttributes: js.Object): CanvasRenderingContext2D | WebGLRenderingContext | scala.Null = js.native
  /**
    * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
    * @param contextId The identifier (ID) of the type of canvas to create. Internet Explorer 9 and Internet Explorer 10 support only a 2-D context using canvas.getContext("2d"); IE11 Preview also supports 3-D or WebGL context using canvas.getContext("experimental-webgl");
    */
  @JSName("getContext")
  def getContext_2d(contextId: stdLib.stdLibStrings.`2d`): CanvasRenderingContext2D | scala.Null = js.native
  @JSName("getContext")
  def getContext_2d(contextId: stdLib.stdLibStrings.`2d`, contextAttributes: CanvasRenderingContext2DSettings): CanvasRenderingContext2D | scala.Null = js.native
  @JSName("getContext")
  def `getContext_experimental-webgl`(contextId: stdLib.stdLibStrings.`experimental-webgl`): WebGLRenderingContext | scala.Null = js.native
  @JSName("getContext")
  def `getContext_experimental-webgl`(contextId: stdLib.stdLibStrings.`experimental-webgl`, contextAttributes: WebGLContextAttributes): WebGLRenderingContext | scala.Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: stdLib.stdLibStrings.webgl): WebGLRenderingContext | scala.Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: stdLib.stdLibStrings.webgl, contextAttributes: WebGLContextAttributes): WebGLRenderingContext | scala.Null = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  def toBlob(callback: BlobCallback): scala.Unit = js.native
  def toBlob(callback: BlobCallback, `type`: java.lang.String): scala.Unit = js.native
  def toBlob(callback: BlobCallback, `type`: java.lang.String, quality: js.Any): scala.Unit = js.native
  /**
    * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
    * @param type The standard MIME type for the image format to return. If you do not specify this parameter, the default value is a PNG format image.
    */
  def toDataURL(): java.lang.String = js.native
  def toDataURL(`type`: java.lang.String): java.lang.String = js.native
  def toDataURL(`type`: java.lang.String, quality: js.Any): java.lang.String = js.native
  def transferControlToOffscreen(): OffscreenCanvas = js.native
}

@JSGlobal("HTMLCanvasElement")
@js.native
class HTMLCanvasElementCls () extends HTMLCanvasElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLCanvasElement")
@js.native
object HTMLCanvasElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLCanvasElement]

