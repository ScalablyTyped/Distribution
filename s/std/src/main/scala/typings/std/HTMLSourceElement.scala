package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating <source> elements. */
@js.native
trait HTMLSourceElement extends HTMLElement {
  /**
    * Gets or sets the intended media type of the media source.
    */
  var media: java.lang.String = js.native
  var sizes: java.lang.String = js.native
  /**
    * The address or URL of the a media resource that is to be considered.
    */
  var src: java.lang.String = js.native
  var srcset: java.lang.String = js.native
  /**
    * Gets or sets the MIME type of a media resource.
    */
  var `type`: java.lang.String = js.native
}

@JSGlobal("HTMLSourceElement")
@js.native
class HTMLSourceElementCls () extends HTMLSourceElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
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

@JSGlobal("HTMLSourceElement")
@js.native
object HTMLSourceElement extends Instantiable0[HTMLSourceElement]

