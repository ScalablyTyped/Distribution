package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimationElement extends SVGElement {
  val targetElement: SVGElement = js.native
  def getCurrentTime(): Double = js.native
  def getSimpleDuration(): Double = js.native
  def getStartTime(): Double = js.native
}

@JSGlobal("SVGAnimationElement")
@js.native
class SVGAnimationElementCls () extends SVGAnimationElement {
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
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("SVGAnimationElement")
@js.native
object SVGAnimationElement extends Instantiable0[SVGAnimationElement]

