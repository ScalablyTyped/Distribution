package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegList extends js.Object {
  val numberOfItems: Double
  def appendItem(newItem: SVGPathSeg): SVGPathSeg
  def clear(): Unit
  def getItem(index: Double): SVGPathSeg
  def initialize(newItem: SVGPathSeg): SVGPathSeg
  def insertItemBefore(newItem: SVGPathSeg, index: Double): SVGPathSeg
  def removeItem(index: Double): SVGPathSeg
  def replaceItem(newItem: SVGPathSeg, index: Double): SVGPathSeg
}

@JSGlobal("SVGPathSegList")
@js.native
object SVGPathSegList extends Instantiable0[SVGPathSegList]

