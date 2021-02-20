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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-range/lib/utils", "assertUnreachable")
  @js.native
  def assertUnreachable(x: scala.Nothing): scala.Nothing = js.native
  
  @JSImport("react-range/lib/utils", "checkBoundaries")
  @js.native
  def checkBoundaries(value: Double, min: Double, max: Double): Unit = js.native
  
  @JSImport("react-range/lib/utils", "checkInitialOverlap")
  @js.native
  def checkInitialOverlap(values: js.Array[Double]): Unit = js.native
  
  @JSImport("react-range/lib/utils", "getClosestThumbIndex")
  @js.native
  def getClosestThumbIndex(thumbs: js.Array[Element], clientX: Double, clientY: Double, direction: Direction): Double = js.native
  
  @JSImport("react-range/lib/utils", "getMargin")
  @js.native
  def getMargin(element: Element): Bottom = js.native
  
  @JSImport("react-range/lib/utils", "getPaddingAndBorder")
  @js.native
  def getPaddingAndBorder(element: Element): Bottom = js.native
  
  @JSImport("react-range/lib/utils", "getStepDecimals")
  @js.native
  def getStepDecimals(step: Double): Double = js.native
  
  @JSImport("react-range/lib/utils", "getTrackBackground")
  @js.native
  def getTrackBackground(hasValuesColorsMinMaxDirectionRtl: ITrackBackground): String = js.native
  
  @JSImport("react-range/lib/utils", "isStepDivisible")
  @js.native
  def isStepDivisible(min: Double, max: Double, step: Double): Boolean = js.native
  
  @JSImport("react-range/lib/utils", "isTouchEvent")
  @js.native
  def isTouchEvent(event: TouchEvent with MouseEvent): Double = js.native
  
  @JSImport("react-range/lib/utils", "isVertical")
  @js.native
  def isVertical(direction: Direction): Boolean = js.native
  
  @JSImport("react-range/lib/utils", "normalizeValue")
  @js.native
  def normalizeValue(
    value: Double,
    index: Double,
    min: Double,
    max: Double,
    step: Double,
    allowOverlap: Boolean,
    values: js.Array[Double]
  ): Double = js.native
  
  @JSImport("react-range/lib/utils", "relativeValue")
  @js.native
  def relativeValue(value: Double, min: Double, max: Double): Double = js.native
  
  @JSImport("react-range/lib/utils", "replaceAt")
  @js.native
  def replaceAt(values: js.Array[Double], index: Double, value: Double): js.Array[Double] = js.native
  
  @JSImport("react-range/lib/utils", "schd")
  @js.native
  def schd(fn: js.Function): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  @JSImport("react-range/lib/utils", "translate")
  @js.native
  def translate(element: Element, x: Double, y: Double): Unit = js.native
  
  @JSImport("react-range/lib/utils", "translateThumbs")
  @js.native
  def translateThumbs(elements: js.Array[Element], offsets: TThumbOffsets, rtl: Boolean): Unit = js.native
  
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: js.UndefOr[scala.Nothing],
    separator: js.UndefOr[scala.Nothing],
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: js.UndefOr[scala.Nothing],
    separator: String
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: js.UndefOr[scala.Nothing],
    separator: String,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, step: Double): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: Double,
    separator: js.UndefOr[scala.Nothing],
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, step: Double, separator: String): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: Double,
    separator: String,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: js.UndefOr[scala.Nothing],
    separator: js.UndefOr[scala.Nothing],
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: js.UndefOr[scala.Nothing],
    separator: String
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: js.UndefOr[scala.Nothing],
    separator: String,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, step: Double): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: Double,
    separator: js.UndefOr[scala.Nothing],
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, step: Double, separator: String): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range/lib/utils", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: Double,
    separator: String,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  
  @JSImport("react-range/lib/utils", "voidFn")
  @js.native
  def voidFn(): Unit = js.native
}
