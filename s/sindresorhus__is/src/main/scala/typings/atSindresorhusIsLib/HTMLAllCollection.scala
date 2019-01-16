package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAllCollection
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Element] {
  /**
    * Returns the number of elements in the collection.
    */
  val length: scala.Double = js.native
  /**
    * element = collection(index)
    */
  def item(): HTMLCollection | Element | scala.Null = js.native
  def item(nameOrIndex: java.lang.String): HTMLCollection | Element | scala.Null = js.native
  /**
    * element = collection(name)
    */
  def namedItem(name: java.lang.String): HTMLCollection | Element | scala.Null = js.native
}

@JSGlobal("HTMLAllCollection")
@js.native
object HTMLAllCollection
  extends org.scalablytyped.runtime.Instantiable0[HTMLAllCollection]

