package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HTMLCollection extends HTMLCollectionBase {
  /**
       * Retrieves a select object or an object from an options collection.
       */
  def namedItem(name: java.lang.String): Element | scala.Null
}

@JSGlobal("HTMLCollection")
@js.native
object HTMLCollection
  extends ScalablyTyped.runtime.Instantiable0[HTMLCollection]

