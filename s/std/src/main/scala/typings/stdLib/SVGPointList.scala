package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPointList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[DOMPoint] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[DOMPoint]] = js.native
  val length: scala.Double = js.native
  val numberOfItems: scala.Double = js.native
  def appendItem(newItem: DOMPoint): DOMPoint = js.native
  def clear(): scala.Unit = js.native
  def getItem(index: scala.Double): DOMPoint = js.native
  def initialize(newItem: DOMPoint): DOMPoint = js.native
  def insertItemBefore(newItem: DOMPoint, index: scala.Double): DOMPoint = js.native
  def removeItem(index: scala.Double): DOMPoint = js.native
  def replaceItem(newItem: DOMPoint, index: scala.Double): DOMPoint = js.native
}

@JSGlobal("SVGPointList")
@js.native
class SVGPointListCls () extends SVGPointList

@JSGlobal("SVGPointList")
@js.native
object SVGPointList
  extends org.scalablytyped.runtime.Instantiable0[SVGPointList]

