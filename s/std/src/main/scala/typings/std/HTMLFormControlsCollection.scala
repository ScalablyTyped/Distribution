package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of HTML form control elements.  */
@js.native
trait HTMLFormControlsCollection extends HTMLCollectionBase {
  /**
    * Returns the item with ID or name name from the collection.
    * 
    * If there are multiple matching items, then a RadioNodeList object containing all those elements is returned.
    */
  def namedItem(name: java.lang.String): RadioNodeList | Element | Null = js.native
}

