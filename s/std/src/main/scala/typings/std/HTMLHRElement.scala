package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating <hr> elements. */
@js.native
trait HTMLHRElement extends HTMLElement {
  /**
    * Sets or retrieves how the object is aligned with adjacent text.
    */
  /** @deprecated */
  var align: java.lang.String = js.native
  /** @deprecated */
  var color: java.lang.String = js.native
  /**
    * Sets or retrieves whether the horizontal rule is drawn with 3-D shading.
    */
  /** @deprecated */
  var noShade: scala.Boolean = js.native
  /** @deprecated */
  var size: java.lang.String = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  /** @deprecated */
  var width: java.lang.String = js.native
}

@JSGlobal("HTMLHRElement")
@js.native
class HTMLHRElementCls () extends HTMLHRElement {
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

@JSGlobal("HTMLHRElement")
@js.native
object HTMLHRElement extends Instantiable0[HTMLHRElement]

