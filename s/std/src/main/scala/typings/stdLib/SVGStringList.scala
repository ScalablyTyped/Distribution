package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGStringList defines a list of DOMString objects. */
trait SVGStringList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[java.lang.String] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]]
  val length: scala.Double
  val numberOfItems: scala.Double
  def appendItem(newItem: java.lang.String): java.lang.String
  def clear(): scala.Unit
  def getItem(index: scala.Double): java.lang.String
  def initialize(newItem: java.lang.String): java.lang.String
  def insertItemBefore(newItem: java.lang.String, index: scala.Double): java.lang.String
  def removeItem(index: scala.Double): java.lang.String
  def replaceItem(newItem: java.lang.String, index: scala.Double): java.lang.String
}

@JSGlobal("SVGStringList")
@js.native
class SVGStringListCls () extends SVGStringList {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override val numberOfItems: scala.Double = js.native
  /* CompleteClass */
  override def appendItem(newItem: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def getItem(index: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def initialize(newItem: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def insertItemBefore(newItem: java.lang.String, index: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def removeItem(index: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def replaceItem(newItem: java.lang.String, index: scala.Double): java.lang.String = js.native
}

@JSGlobal("SVGStringList")
@js.native
object SVGStringList
  extends org.scalablytyped.runtime.Instantiable0[SVGStringList]

