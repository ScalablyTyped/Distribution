package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Image")
@js.native
class Image () extends HTMLImageElement {
  def this(width: scala.Double) = this()
  def this(width: scala.Double, height: scala.Double) = this()
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
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

@JSGlobal("Image")
@js.native
object Image
  extends org.scalablytyped.runtime.Instantiable0[HTMLImageElement]
     with org.scalablytyped.runtime.Instantiable1[/* width */ scala.Double, HTMLImageElement]
     with org.scalablytyped.runtime.Instantiable2[/* width */ scala.Double, /* height */ scala.Double, HTMLImageElement]

