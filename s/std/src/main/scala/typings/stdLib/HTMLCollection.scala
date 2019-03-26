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
class HTMLCollectionCls () extends HTMLCollection {
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
    * Retrieves a select object or an object from an options collection.
    */
  /* CompleteClass */
  override def namedItem(name: java.lang.String): Element | scala.Null = js.native
}

@JSGlobal("HTMLCollection")
@js.native
object HTMLCollection
  extends org.scalablytyped.runtime.Instantiable0[HTMLCollection]

