package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An opaque object describing a pattern, based on an image, a canvas, or a video, created by the CanvasRenderingContext2D.createPattern() method.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasPattern)
  */
@js.native
trait CanvasPattern extends StObject {
  
  /**
    * Sets the transformation matrix that will be used when rendering the pattern during a fill or stroke painting operation.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasPattern/setTransform)
    */
  /* standard dom */
  def setTransform(): Unit = js.native
  def setTransform(transform: DOMMatrix2DInit): Unit = js.native
}
