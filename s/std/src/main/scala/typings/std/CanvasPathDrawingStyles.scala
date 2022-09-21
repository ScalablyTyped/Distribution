package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasPathDrawingStyles extends StObject {
  
  /* standard dom */
  def getLineDash(): js.Array[Double] = js.native
  
  /* standard dom */
  var lineCap: CanvasLineCap = js.native
  
  /* standard dom */
  var lineDashOffset: Double = js.native
  
  /* standard dom */
  var lineJoin: CanvasLineJoin = js.native
  
  /* standard dom */
  var lineWidth: Double = js.native
  
  /* standard dom */
  var miterLimit: Double = js.native
  
  /* standard dom */
  def setLineDash(segments: js.Array[Double]): Unit = js.native
  /* standard dom.iterable */
  def setLineDash(segments: js.Iterable[Double]): Unit = js.native
}
