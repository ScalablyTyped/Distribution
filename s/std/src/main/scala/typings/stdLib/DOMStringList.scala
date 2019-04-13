package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A type returned by some APIs which contains a list of DOMString (strings). */
@js.native
trait DOMStringList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[java.lang.String] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  /**
    * Returns the number of strings in strings.
    */
  val length: scala.Double = js.native
  /**
    * Returns true if strings contains string, and false
    * otherwise.
    */
  def contains(string: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the string with index index from strings.
    */
  def item(index: scala.Double): java.lang.String | scala.Null = js.native
}

@JSGlobal("DOMStringList")
@js.native
class DOMStringListCls () extends DOMStringList

@JSGlobal("DOMStringList")
@js.native
object DOMStringList
  extends org.scalablytyped.runtime.Instantiable0[DOMStringList]

