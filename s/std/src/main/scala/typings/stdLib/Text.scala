package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Text interface represents the textual content of Element or Attr.  If an element has no markup within its content, it has a single child implementing Text that contains the element's text.  However, if the element contains markup, it is parsed into information items and Text nodes that form its children. */
@js.native
trait Text
  extends CharacterData
     with Slotable {
  /**
    * Returns the combined data of all direct Text node siblings.
    */
  val wholeText: java.lang.String = js.native
  /**
    * Splits data at the given offset and returns the remainder as Text node.
    */
  def splitText(offset: scala.Double): Text = js.native
}

@JSGlobal("Text")
@js.native
class TextCls () extends Text {
  def this(data: java.lang.String) = this()
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
}

@JSGlobal("Text")
@js.native
object Text
  extends org.scalablytyped.runtime.Instantiable0[Text]
     with org.scalablytyped.runtime.Instantiable1[/* data */ java.lang.String, Text]

