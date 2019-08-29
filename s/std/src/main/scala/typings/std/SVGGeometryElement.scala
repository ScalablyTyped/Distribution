package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGGeometryElement extends SVGGraphicsElement {
  val pathLength: SVGAnimatedNumber = js.native
  def getPointAtLength(distance: Double): DOMPoint = js.native
  def getTotalLength(): Double = js.native
  def isPointInFill(): scala.Boolean = js.native
  def isPointInFill(point: DOMPointInit): scala.Boolean = js.native
  def isPointInStroke(): scala.Boolean = js.native
  def isPointInStroke(point: DOMPointInit): scala.Boolean = js.native
}

@JSGlobal("SVGGeometryElement")
@js.native
class SVGGeometryElementCls () extends SVGGeometryElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  /* CompleteClass */
  override val requiredExtensions: SVGStringList = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /* CompleteClass */
  override val systemLanguage: SVGStringList = js.native
}

@JSGlobal("SVGGeometryElement")
@js.native
object SVGGeometryElement extends Instantiable0[SVGGeometryElement]

