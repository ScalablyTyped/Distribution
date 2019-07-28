package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGStringList defines a list of DOMString objects. */
@js.native
trait SVGStringList
  extends /* index */ NumberDictionary[java.lang.String] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  val length: Double = js.native
  val numberOfItems: Double = js.native
  def appendItem(newItem: java.lang.String): java.lang.String = js.native
  def clear(): Unit = js.native
  def getItem(index: Double): java.lang.String = js.native
  def initialize(newItem: java.lang.String): java.lang.String = js.native
  def insertItemBefore(newItem: java.lang.String, index: Double): java.lang.String = js.native
  def removeItem(index: Double): java.lang.String = js.native
  def replaceItem(newItem: java.lang.String, index: Double): java.lang.String = js.native
}

@JSGlobal("SVGStringList")
@js.native
class SVGStringListCls () extends SVGStringList

@JSGlobal("SVGStringList")
@js.native
object SVGStringList extends Instantiable0[SVGStringList]

