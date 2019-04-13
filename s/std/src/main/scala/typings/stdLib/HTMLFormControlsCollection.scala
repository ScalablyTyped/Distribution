package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTMLFormControlsCollection interface represents a collection of HTML form control elements.  */
@js.native
trait HTMLFormControlsCollection extends HTMLCollectionBase {
  /**
    * element = collection[name]
    */
  def namedItem(name: java.lang.String): RadioNodeList | Element | scala.Null = js.native
}

@JSGlobal("HTMLFormControlsCollection")
@js.native
class HTMLFormControlsCollectionCls () extends HTMLFormControlsCollection

@JSGlobal("HTMLFormControlsCollection")
@js.native
object HTMLFormControlsCollection
  extends org.scalablytyped.runtime.Instantiable0[HTMLFormControlsCollection]

