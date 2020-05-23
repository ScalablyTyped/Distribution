package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGNumberList defines a list of SVGNumber objects. */
@js.native
trait SVGNumberList extends /* index */ NumberDictionary[SVGNumber] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SVGNumber]] = js.native
  val length: Double = js.native
  val numberOfItems: Double = js.native
  def appendItem(newItem: SVGNumber): SVGNumber = js.native
  def clear(): Unit = js.native
  def getItem(index: Double): SVGNumber = js.native
  def initialize(newItem: SVGNumber): SVGNumber = js.native
  def insertItemBefore(newItem: SVGNumber, index: Double): SVGNumber = js.native
  def removeItem(index: Double): SVGNumber = js.native
  def replaceItem(newItem: SVGNumber, index: Double): SVGNumber = js.native
}

