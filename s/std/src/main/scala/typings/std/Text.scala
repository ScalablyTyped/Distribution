package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The textual content of Element or Attr. If an element has no markup within its content, it has a single child implementing Text that contains the element's text. However, if the element contains markup, it is parsed into information items and Text nodes that form its children. */
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
  def splitText(offset: Double): Text = js.native
}

