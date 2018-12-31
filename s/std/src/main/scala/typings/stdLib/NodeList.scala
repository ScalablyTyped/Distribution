package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Node] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Node]] = js.native
  /**
    * Returns the number of nodes in the collection.
    */
  val length: scala.Double = js.native
  /**
    * Returns an array of key, value pairs for every entry in the list.
    */
  def entries(): IterableIterator[js.Tuple2[scala.Double, Node]] = js.native
  /**
    * Performs the specified action for each node in an list.
    * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the list.
    * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def forEach(
    callbackfn: js.Function3[/* value */ Node, /* key */ scala.Double, /* parent */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ Node, /* key */ scala.Double, /* parent */ this.type, scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  /**
    * element = collection[index]
    */
  def item(index: scala.Double): Node | scala.Null = js.native
  /**
    * Returns an list of keys in the list.
    */
  def keys(): IterableIterator[scala.Double] = js.native
  /**
    * Returns an list of values in the list.
    */
  def values(): IterableIterator[Node] = js.native
}

@JSGlobal("NodeList")
@js.native
object NodeList
  extends org.scalablytyped.runtime.Instantiable0[NodeList]

