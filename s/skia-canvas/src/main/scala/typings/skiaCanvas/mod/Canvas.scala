package typings.skiaCanvas.mod

import typings.node.bufferMod.global.Buffer
import typings.skiaCanvas.skiaCanvasStrings.`2d`
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("skia-canvas/lib", "Canvas")
@js.native
/** @internal */
open class Canvas ()
  extends StObject
     with CanvasImageSource {
  def this(width: Double) = this()
  def this(width: Double, height: Double) = this()
  def this(width: Unit, height: Double) = this()
  
  /**
    * @deprecated Use the saveAsSync, toBufferSync, and toDataURLSync methods
    * instead of setting the async property to false
    */
  var async: Boolean = js.native
  
  def getContext(): CanvasRenderingContext2D = js.native
  @JSName("getContext")
  def getContext_2d(`type`: `2d`): CanvasRenderingContext2D = js.native
  
  def gpu: Boolean = js.native
  def gpu_=(enabled: Boolean): Unit = js.native
  
  var height: Double = js.native
  
  def jpg: js.Promise[Buffer] = js.native
  
  def newPage(): CanvasRenderingContext2D = js.native
  def newPage(width: Double): CanvasRenderingContext2D = js.native
  def newPage(width: Double, height: Double): CanvasRenderingContext2D = js.native
  def newPage(width: Unit, height: Double): CanvasRenderingContext2D = js.native
  
  val pages: js.Array[CanvasRenderingContext2D] = js.native
  
  def pdf: js.Promise[Buffer] = js.native
  
  def png: js.Promise[Buffer] = js.native
  
  def saveAs(filename: String): js.Promise[Unit] = js.native
  def saveAs(filename: String, options: SaveOptions): js.Promise[Unit] = js.native
  
  def saveAsSync(filename: String): Unit = js.native
  def saveAsSync(filename: String, options: SaveOptions): Unit = js.native
  
  def svg: js.Promise[Buffer] = js.native
  
  def toBuffer(format: ExportFormat): js.Promise[Buffer] = js.native
  def toBuffer(format: ExportFormat, options: RenderOptions): js.Promise[Buffer] = js.native
  
  def toBufferSync(format: ExportFormat): Buffer = js.native
  def toBufferSync(format: ExportFormat, options: RenderOptions): Buffer = js.native
  
  def toDataURL(format: ExportFormat): js.Promise[String] = js.native
  def toDataURL(format: ExportFormat, options: RenderOptions): js.Promise[String] = js.native
  
  def toDataURLSync(format: ExportFormat): String = js.native
  def toDataURLSync(format: ExportFormat, options: RenderOptions): String = js.native
  
  var width: Double = js.native
}
/* static members */
object Canvas {
  
  @JSImport("skia-canvas/lib", "Canvas")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("skia-canvas/lib", "Canvas.contexts")
  @js.native
  def contexts: WeakMap[Canvas, js.Array[CanvasRenderingContext2D]] = js.native
  inline def contexts_=(x: WeakMap[Canvas, js.Array[CanvasRenderingContext2D]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contexts")(x.asInstanceOf[js.Any])
}
