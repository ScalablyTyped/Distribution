package typings
package reactDashRangeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-range/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  def assertUnreachable(x: scala.Nothing): scala.Nothing = js.native
  def checkBoundaries(value: scala.Double, min: scala.Double, max: scala.Double): scala.Unit = js.native
  def checkInitialOverlap(values: js.Array[scala.Double]): scala.Unit = js.native
  def getMargin(element: stdLib.Element): reactDashRangeLib.Anon_Bottom = js.native
  def getPadding(element: stdLib.Element): reactDashRangeLib.Anon_Bottom = js.native
  def getTrackBackground(hasValuesColorsMinMaxDirection: reactDashRangeLib.libTypesMod.ITrackBackground): java.lang.String = js.native
  def isTouchEvent(event: stdLib.TouchEvent with stdLib.MouseEvent): scala.Double = js.native
  def isVertical(direction: reactDashRangeLib.libTypesMod.Direction): scala.Boolean = js.native
  def normalizeValue(
    value: scala.Double,
    index: scala.Double,
    min: scala.Double,
    max: scala.Double,
    step: scala.Double,
    allowOverlap: scala.Boolean,
    values: js.Array[scala.Double]
  ): scala.Double = js.native
  def relativeValue(value: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
  def replaceAt(values: js.Array[scala.Double], index: scala.Double, value: scala.Double): js.Array[scala.Double] = js.native
  def schd(fn: js.Function): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  def translate(element: stdLib.Element, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def translateThumbs(elements: js.Array[stdLib.Element], offsets: reactDashRangeLib.libTypesMod.TThumbOffsets): scala.Unit = js.native
  def voidFn(): scala.Unit = js.native
}

