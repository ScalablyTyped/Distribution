package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An opaque object describing a pattern, based on an image, a canvas, or a video, created by the CanvasRenderingContext2D.createPattern() method. */
@js.native
trait CanvasPattern extends js.Object {
  /**
    * Sets the transformation matrix that will be used when rendering the pattern during a fill or stroke painting operation.
    */
  def setTransform(): Unit = js.native
  def setTransform(transform: DOMMatrix2DInit): Unit = js.native
}

@JSGlobal("CanvasPattern")
@js.native
object CanvasPattern extends Instantiable0[CanvasPattern]

