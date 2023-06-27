package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for the <circle> element. The circle element is defined by the cx and cy attributes that denote the coordinates of the centre of the circle.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGCircleElement)
  */
@js.native
trait SVGCircleElement
  extends StObject
     with SVGGeometryElement {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGCircleElement/cx) */
  /* standard dom */
  val cx: SVGAnimatedLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGCircleElement/cy) */
  /* standard dom */
  val cy: SVGAnimatedLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGCircleElement/r) */
  /* standard dom */
  val r: SVGAnimatedLength = js.native
}
