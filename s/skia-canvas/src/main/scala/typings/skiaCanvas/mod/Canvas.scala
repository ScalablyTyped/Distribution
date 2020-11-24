package typings.skiaCanvas.mod

import typings.node.Buffer
import typings.skiaCanvas.anon.Format
import typings.skiaCanvas.anon.Page
import typings.skiaCanvas.skiaCanvasStrings.`2d`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("skia-canvas", "Canvas")
@js.native
class Canvas protected () extends js.Object {
  def this(width: Double, height: Double) = this()
  
  @JSName("getContext")
  def getContext_2d(`type`: `2d`): CanvasRenderingContext2D = js.native
  
  def height: Double = js.native
  
  def jpg: Buffer = js.native
  
  def newPage(width: Double, height: Double): CanvasRenderingContext2D = js.native
  
  def pages: js.Array[CanvasRenderingContext2D] = js.native
  
  def pdf: Buffer = js.native
  
  def png: Buffer = js.native
  
  def saveAs(filename: String): Unit = js.native
  def saveAs(filename: String, options: Format): Unit = js.native
  
  def svg: Buffer = js.native
  
  def toBuffer(format: String): Buffer = js.native
  def toBuffer(format: String, options: Page): Buffer = js.native
  
  def toDataURL(format: String): String = js.native
  def toDataURL(format: String, options: Page): String = js.native
  
  def width: Double = js.native
}
