package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMStringList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[java.lang.String] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]]
  /**
    * Returns the number of strings in strings.
    */
  val length: scala.Double
  /**
    * Returns true if strings contains string, and false
    * otherwise.
    */
  def contains(string: java.lang.String): scala.Boolean
  /**
    * Returns the string with index index from strings.
    */
  def item(index: scala.Double): java.lang.String | scala.Null
}

@JSGlobal("DOMStringList")
@js.native
class DOMStringListCls () extends DOMStringList {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  /**
    * Returns the number of strings in strings.
    */
  /* CompleteClass */
  override val length: scala.Double = js.native
  /**
    * Returns true if strings contains string, and false
    * otherwise.
    */
  /* CompleteClass */
  override def contains(string: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the string with index index from strings.
    */
  /* CompleteClass */
  override def item(index: scala.Double): java.lang.String | scala.Null = js.native
}

@JSGlobal("DOMStringList")
@js.native
object DOMStringList
  extends org.scalablytyped.runtime.Instantiable0[DOMStringList]

