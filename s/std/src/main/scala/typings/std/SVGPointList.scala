package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPointList extends /* index */ NumberDictionary[DOMPoint] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[DOMPoint]] = js.native
  val length: Double = js.native
  val numberOfItems: Double = js.native
  def appendItem(newItem: DOMPoint): DOMPoint = js.native
  def clear(): Unit = js.native
  def getItem(index: Double): DOMPoint = js.native
  def initialize(newItem: DOMPoint): DOMPoint = js.native
  def insertItemBefore(newItem: DOMPoint, index: Double): DOMPoint = js.native
  def removeItem(index: Double): DOMPoint = js.native
  def replaceItem(newItem: DOMPoint, index: Double): DOMPoint = js.native
}

