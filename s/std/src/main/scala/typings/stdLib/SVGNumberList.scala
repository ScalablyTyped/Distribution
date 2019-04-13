package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGNumberList defines a list of SVGNumber objects. */
@js.native
trait SVGNumberList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[SVGNumber] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SVGNumber]] = js.native
  val length: scala.Double = js.native
  val numberOfItems: scala.Double = js.native
  def appendItem(newItem: SVGNumber): SVGNumber = js.native
  def clear(): scala.Unit = js.native
  def getItem(index: scala.Double): SVGNumber = js.native
  def initialize(newItem: SVGNumber): SVGNumber = js.native
  def insertItemBefore(newItem: SVGNumber, index: scala.Double): SVGNumber = js.native
  def removeItem(index: scala.Double): SVGNumber = js.native
  def replaceItem(newItem: SVGNumber, index: scala.Double): SVGNumber = js.native
}

@JSGlobal("SVGNumberList")
@js.native
class SVGNumberListCls () extends SVGNumberList

@JSGlobal("SVGNumberList")
@js.native
object SVGNumberList
  extends org.scalablytyped.runtime.Instantiable0[SVGNumberList]

