package typings.reactRange

import typings.react.mod.CSSProperties
import typings.reactRange.anon.Bottom
import typings.reactRange.rangeMod.default
import typings.reactRange.typesMod.Direction
import typings.reactRange.typesMod.ITrackBackground
import typings.reactRange.typesMod.TThumbOffsets
import typings.std.Element
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-range/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def assertUnreachable(x: scala.Nothing): scala.Nothing = js.native
  def checkBoundaries(value: Double, min: Double, max: Double): Unit = js.native
  def checkInitialOverlap(values: js.Array[Double]): Unit = js.native
  def getMargin(element: Element): Bottom = js.native
  def getPaddingAndBorder(element: Element): Bottom = js.native
  def getStepDecimals(step: Double): Double = js.native
  def getTrackBackground(hasValuesColorsMinMaxDirectionRtl: ITrackBackground): String = js.native
  def isStepDivisible(min: Double, max: Double, step: Double): Boolean = js.native
  def isTouchEvent(event: TouchEvent with MouseEvent): Double = js.native
  def isVertical(direction: Direction): Boolean = js.native
  def normalizeValue(
    value: Double,
    index: Double,
    min: Double,
    max: Double,
    step: Double,
    allowOverlap: Boolean,
    values: js.Array[Double]
  ): Double = js.native
  def relativeValue(value: Double, min: Double, max: Double): Double = js.native
  def replaceAt(values: js.Array[Double], index: Double, value: Double): js.Array[Double] = js.native
  def schd(fn: js.Function): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def translate(element: Element, x: Double, y: Double): Unit = js.native
  def translateThumbs(elements: js.Array[Element], offsets: TThumbOffsets, rtl: Boolean): Unit = js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, step: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, step: Double, separator: String): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: Double,
    separator: String,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, step: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, step: Double, separator: String): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: Double,
    separator: String,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  def voidFn(): Unit = js.native
}

