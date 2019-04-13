package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGLengthList defines a list of SVGLength objects. */
@js.native
trait SVGLengthList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[SVGLength] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SVGLength]] = js.native
  val length: scala.Double = js.native
  val numberOfItems: scala.Double = js.native
  def appendItem(newItem: SVGLength): SVGLength = js.native
  def clear(): scala.Unit = js.native
  def getItem(index: scala.Double): SVGLength = js.native
  def initialize(newItem: SVGLength): SVGLength = js.native
  def insertItemBefore(newItem: SVGLength, index: scala.Double): SVGLength = js.native
  def removeItem(index: scala.Double): SVGLength = js.native
  def replaceItem(newItem: SVGLength, index: scala.Double): SVGLength = js.native
}

@JSGlobal("SVGLengthList")
@js.native
class SVGLengthListCls () extends SVGLengthList

@JSGlobal("SVGLengthList")
@js.native
object SVGLengthList
  extends org.scalablytyped.runtime.Instantiable0[SVGLengthList]

