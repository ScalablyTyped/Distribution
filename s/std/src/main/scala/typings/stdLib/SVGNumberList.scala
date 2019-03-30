package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGNumberList defines a list of SVGNumber objects. */
trait SVGNumberList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[SVGNumber] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SVGNumber]]
  val length: scala.Double
  val numberOfItems: scala.Double
  def appendItem(newItem: SVGNumber): SVGNumber
  def clear(): scala.Unit
  def getItem(index: scala.Double): SVGNumber
  def initialize(newItem: SVGNumber): SVGNumber
  def insertItemBefore(newItem: SVGNumber, index: scala.Double): SVGNumber
  def removeItem(index: scala.Double): SVGNumber
  def replaceItem(newItem: SVGNumber, index: scala.Double): SVGNumber
}

@JSGlobal("SVGNumberList")
@js.native
class SVGNumberListCls () extends SVGNumberList {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[SVGNumber]] = js.native
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override val numberOfItems: scala.Double = js.native
  /* CompleteClass */
  override def appendItem(newItem: SVGNumber): SVGNumber = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def getItem(index: scala.Double): SVGNumber = js.native
  /* CompleteClass */
  override def initialize(newItem: SVGNumber): SVGNumber = js.native
  /* CompleteClass */
  override def insertItemBefore(newItem: SVGNumber, index: scala.Double): SVGNumber = js.native
  /* CompleteClass */
  override def removeItem(index: scala.Double): SVGNumber = js.native
  /* CompleteClass */
  override def replaceItem(newItem: SVGNumber, index: scala.Double): SVGNumber = js.native
}

@JSGlobal("SVGNumberList")
@js.native
object SVGNumberList
  extends org.scalablytyped.runtime.Instantiable0[SVGNumberList]

