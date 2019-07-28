package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of HTML form control elements.  */
@js.native
trait HTMLFormControlsCollection extends HTMLCollectionBase {
  /**
    * element = collection[name]
    */
  def namedItem(name: java.lang.String): RadioNodeList | Element | Null = js.native
}

@JSGlobal("HTMLFormControlsCollection")
@js.native
class HTMLFormControlsCollectionCls () extends HTMLFormControlsCollection

@JSGlobal("HTMLFormControlsCollection")
@js.native
object HTMLFormControlsCollection extends Instantiable0[HTMLFormControlsCollection]

