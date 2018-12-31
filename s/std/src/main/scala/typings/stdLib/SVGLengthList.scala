package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
object SVGLengthList
  extends org.scalablytyped.runtime.Instantiable0[SVGLengthList]

