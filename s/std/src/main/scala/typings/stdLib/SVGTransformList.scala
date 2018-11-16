package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SVGTransformList extends js.Object {
  val numberOfItems: scala.Double
  def appendItem(newItem: SVGTransform): SVGTransform
  def clear(): scala.Unit
  def consolidate(): SVGTransform
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform
  def getItem(index: scala.Double): SVGTransform
  def initialize(newItem: SVGTransform): SVGTransform
  def insertItemBefore(newItem: SVGTransform, index: scala.Double): SVGTransform
  def removeItem(index: scala.Double): SVGTransform
  def replaceItem(newItem: SVGTransform, index: scala.Double): SVGTransform
}

@JSGlobal("SVGTransformList")
@js.native
object SVGTransformList
  extends ScalablyTyped.runtime.Instantiable0[SVGTransformList]

