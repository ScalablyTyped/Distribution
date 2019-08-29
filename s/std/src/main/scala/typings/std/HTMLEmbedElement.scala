package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <embed> elements. */
@js.native
trait HTMLEmbedElement extends HTMLElement {
  /** @deprecated */
  var align: java.lang.String = js.native
  /**
    * Sets or retrieves the height of the object.
    */
  var height: java.lang.String = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  /** @deprecated */
  var name: java.lang.String = js.native
  /**
    * Sets or retrieves a URL to be loaded by the object.
    */
  var src: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var width: java.lang.String = js.native
  def getSVGDocument(): Document | Null = js.native
}

@JSGlobal("HTMLEmbedElement")
@js.native
class HTMLEmbedElementCls () extends HTMLEmbedElement {
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

@JSGlobal("HTMLEmbedElement")
@js.native
object HTMLEmbedElement extends Instantiable0[HTMLEmbedElement]

