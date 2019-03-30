package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGEllipseElement interface provides access to the properties of <ellipse> elements. */
@js.native
trait SVGEllipseElement extends SVGGraphicsElement {
  val cx: SVGAnimatedLength = js.native
  val cy: SVGAnimatedLength = js.native
  val rx: SVGAnimatedLength = js.native
  val ry: SVGAnimatedLength = js.native
}

@JSGlobal("SVGEllipseElement")
@js.native
class SVGEllipseElementCls () extends SVGEllipseElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
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

@JSGlobal("SVGEllipseElement")
@js.native
object SVGEllipseElement
  extends org.scalablytyped.runtime.Instantiable0[SVGEllipseElement]

