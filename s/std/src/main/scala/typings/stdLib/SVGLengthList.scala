package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGLengthList defines a list of SVGLength objects. */
trait SVGLengthList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[SVGLength] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SVGLength]]
  val length: scala.Double
  val numberOfItems: scala.Double
  def appendItem(newItem: SVGLength): SVGLength
  def clear(): scala.Unit
  def getItem(index: scala.Double): SVGLength
  def initialize(newItem: SVGLength): SVGLength
  def insertItemBefore(newItem: SVGLength, index: scala.Double): SVGLength
  def removeItem(index: scala.Double): SVGLength
  def replaceItem(newItem: SVGLength, index: scala.Double): SVGLength
}

@JSGlobal("SVGLengthList")
@js.native
class SVGLengthListCls () extends SVGLengthList {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[SVGLength]] = js.native
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override val numberOfItems: scala.Double = js.native
  /* CompleteClass */
  override def appendItem(newItem: SVGLength): SVGLength = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def getItem(index: scala.Double): SVGLength = js.native
  /* CompleteClass */
  override def initialize(newItem: SVGLength): SVGLength = js.native
  /* CompleteClass */
  override def insertItemBefore(newItem: SVGLength, index: scala.Double): SVGLength = js.native
  /* CompleteClass */
  override def removeItem(index: scala.Double): SVGLength = js.native
  /* CompleteClass */
  override def replaceItem(newItem: SVGLength, index: scala.Double): SVGLength = js.native
}

@JSGlobal("SVGLengthList")
@js.native
object SVGLengthList
  extends org.scalablytyped.runtime.Instantiable0[SVGLengthList]

