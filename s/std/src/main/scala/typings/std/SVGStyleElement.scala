package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the SVG <style> element. */
@js.native
trait SVGStyleElement extends SVGElement {
  var disabled: scala.Boolean = js.native
  var media: java.lang.String = js.native
  var title: java.lang.String = js.native
  var `type`: java.lang.String = js.native
}

@JSGlobal("SVGStyleElement")
@js.native
class SVGStyleElementCls () extends SVGStyleElement {
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

@JSGlobal("SVGStyleElement")
@js.native
object SVGStyleElement extends Instantiable0[SVGStyleElement]

