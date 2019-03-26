package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLFormControlsCollection extends HTMLCollectionBase {
  /**
    * element = collection[name]
    */
  def namedItem(name: java.lang.String): RadioNodeList | Element | scala.Null
}

@JSGlobal("HTMLFormControlsCollection")
@js.native
class HTMLFormControlsCollectionCls () extends HTMLFormControlsCollection {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[Element]] = js.native
  /**
    * Sets or retrieves the number of objects in a collection.
    */
  /* CompleteClass */
  override val length: scala.Double = js.native
  /**
    * Retrieves an object from various collections.
    */
  /* CompleteClass */
  override def item(index: scala.Double): Element | scala.Null = js.native
  /**
    * element = collection[name]
    */
  /* CompleteClass */
  override def namedItem(name: java.lang.String): RadioNodeList | Element | scala.Null = js.native
}

@JSGlobal("HTMLFormControlsCollection")
@js.native
object HTMLFormControlsCollection
  extends org.scalablytyped.runtime.Instantiable0[HTMLFormControlsCollection]

