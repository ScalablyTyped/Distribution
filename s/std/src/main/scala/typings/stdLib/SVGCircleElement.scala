package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for the <circle> element. The circle element is defined by the cx and cy attributes that denote the coordinates of the centre of the circle. */
@js.native
trait SVGCircleElement extends SVGGeometryElement {
  val cx: SVGAnimatedLength = js.native
  val cy: SVGAnimatedLength = js.native
  val r: SVGAnimatedLength = js.native
}

@JSGlobal("SVGCircleElement")
@js.native
class SVGCircleElementCls () extends SVGCircleElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
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
  override val requiredExtensions: SVGStringList = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /* CompleteClass */
  override val systemLanguage: SVGStringList = js.native
}

@JSGlobal("SVGCircleElement")
@js.native
object SVGCircleElement
  extends org.scalablytyped.runtime.Instantiable0[SVGCircleElement]

