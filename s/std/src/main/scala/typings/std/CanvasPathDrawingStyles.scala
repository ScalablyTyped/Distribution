package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasPathDrawingStyles extends js.Object {
  
  def getLineDash(): js.Array[Double] = js.native
  
  var lineCap: CanvasLineCap = js.native
  
  var lineDashOffset: Double = js.native
  
  var lineJoin: CanvasLineJoin = js.native
  
  var lineWidth: Double = js.native
  
  var miterLimit: Double = js.native
  
  def setLineDash(segments: js.Array[Double]): Unit = js.native
  def setLineDash(segments: Iterable[Double]): Unit = js.native
}
