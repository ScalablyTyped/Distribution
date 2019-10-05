package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGTransformList defines a list of SVGTransform objects. */
trait SVGTransformList extends js.Object {
  val numberOfItems: Double
  def appendItem(newItem: SVGTransform): SVGTransform
  def clear(): Unit
  def consolidate(): SVGTransform
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform
  def getItem(index: Double): SVGTransform
  def initialize(newItem: SVGTransform): SVGTransform
  def insertItemBefore(newItem: SVGTransform, index: Double): SVGTransform
  def removeItem(index: Double): SVGTransform
  def replaceItem(newItem: SVGTransform, index: Double): SVGTransform
}

@JSGlobal("SVGTransformList")
@js.native
object SVGTransformList extends Instantiable0[SVGTransformList]

