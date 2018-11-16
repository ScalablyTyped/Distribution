package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCanvasElement extends HTMLElement {
  /**
       * Gets or sets the height of a canvas element on a document.
       */
  var height: scala.Double = js.native
  /**
       * Gets or sets the width of a canvas element on a document.
       */
  var width: scala.Double = js.native
  def getContext(contextId: java.lang.String): CanvasRenderingContext2D | WebGLRenderingContext | scala.Null = js.native
  def getContext(contextId: java.lang.String, contextAttributes: js.Object): CanvasRenderingContext2D | WebGLRenderingContext | scala.Null = js.native
  /**
       * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
       * @param contextId The identifier (ID) of the type of canvas to create. Internet Explorer 9 and Internet Explorer 10 support only a 2-D context using canvas.getContext("2d"); IE11 Preview also supports 3-D or WebGL context using canvas.getContext("experimental-webgl");
       */
  @JSName("getContext")
  def getContext_2d(contextId: stdLib.stdLibStrings.`2d`): CanvasRenderingContext2D | scala.Null = js.native
  /**
       * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
       * @param contextId The identifier (ID) of the type of canvas to create. Internet Explorer 9 and Internet Explorer 10 support only a 2-D context using canvas.getContext("2d"); IE11 Preview also supports 3-D or WebGL context using canvas.getContext("experimental-webgl");
       */
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
  def toBlob(callback: BlobCallback): scala.Unit = js.native
  def toBlob(callback: BlobCallback, `type`: java.lang.String): scala.Unit = js.native
  def toBlob(callback: BlobCallback, `type`: java.lang.String, quality: js.Any): scala.Unit = js.native
  /**
       * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
       * @param type The standard MIME type for the image format to return. If you do not specify this parameter, the default value is a PNG format image.
       */
  def toDataURL(): java.lang.String = js.native
  /**
       * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
       * @param type The standard MIME type for the image format to return. If you do not specify this parameter, the default value is a PNG format image.
       */
  def toDataURL(`type`: java.lang.String): java.lang.String = js.native
  /**
       * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
       * @param type The standard MIME type for the image format to return. If you do not specify this parameter, the default value is a PNG format image.
       */
  def toDataURL(`type`: java.lang.String, quality: js.Any): java.lang.String = js.native
}

@JSGlobal("HTMLCanvasElement")
@js.native
object HTMLCanvasElement
  extends ScalablyTyped.runtime.Instantiable0[HTMLCanvasElement]

