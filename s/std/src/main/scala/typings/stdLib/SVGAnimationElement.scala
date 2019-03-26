package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimationElement extends SVGElement {
  val targetElement: SVGElement = js.native
  def getCurrentTime(): scala.Double = js.native
  def getSimpleDuration(): scala.Double = js.native
  def getStartTime(): scala.Double = js.native
}

@JSGlobal("SVGAnimationElement")
@js.native
class SVGAnimationElementCls () extends SVGAnimationElement {
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
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("SVGAnimationElement")
@js.native
object SVGAnimationElement
  extends org.scalablytyped.runtime.Instantiable0[SVGAnimationElement]

