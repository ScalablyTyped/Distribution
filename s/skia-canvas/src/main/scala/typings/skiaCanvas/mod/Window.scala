package typings.skiaCanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter * / any */ @JSImport("skia-canvas/lib", "Window")
@js.native
open class Window () extends StObject {
  def this(options: WindowOptions) = this()
  def this(width: Double, height: Double) = this()
  def this(width: Double, height: Double, options: WindowOptions) = this()
  
  var background: String = js.native
  
  var canvas: Canvas = js.native
  
  def close(): Unit = js.native
  
  val ctx: CanvasRenderingContext2D = js.native
  
  var cursor: CursorStyle = js.native
  
  var fit: FitStyle = js.native
  
  var fullscreen: Boolean = js.native
  
  var height: Double = js.native
  
  var left: Double = js.native
  
  var page: Double = js.native
  
  var title: String = js.native
  
  var top: Double = js.native
  
  var visible: Boolean = js.native
  
  var width: Double = js.native
}
