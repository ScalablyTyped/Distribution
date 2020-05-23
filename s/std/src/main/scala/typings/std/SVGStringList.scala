package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGStringList defines a list of DOMString objects. */
@js.native
trait SVGStringList
  extends /* index */ NumberDictionary[java.lang.String] {
  @JSName(js.Symbol.iterator)
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

