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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-range/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertUnreachable(x: scala.Nothing): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("assertUnreachable")(x.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def checkBoundaries(value: Double, min: Double, max: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkBoundaries")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkInitialOverlap(values: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkInitialOverlap")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getClosestThumbIndex(thumbs: js.Array[Element], clientX: Double, clientY: Double, direction: Direction): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getClosestThumbIndex")(thumbs.asInstanceOf[js.Any], clientX.asInstanceOf[js.Any], clientY.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getMargin(element: Element): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("getMargin")(element.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  
  inline def getPaddingAndBorder(element: Element): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaddingAndBorder")(element.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  
  inline def getStepDecimals(step: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepDecimals")(step.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getTrackBackground(hasValuesColorsMinMaxDirectionRtl: ITrackBackground): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTrackBackground")(hasValuesColorsMinMaxDirectionRtl.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isStepDivisible(min: Double, max: Double, step: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStepDivisible")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTouchEvent(event: TouchEvent & MouseEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouchEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isVertical(direction: Direction): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVertical")(direction.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeValue(
    value: Double,
    index: Double,
    min: Double,
    max: Double,
    step: Double,
    allowOverlap: Boolean,
    values: js.Array[Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeValue")(value.asInstanceOf[js.Any], index.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], step.asInstanceOf[js.Any], allowOverlap.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def relativeValue(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeValue")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def replaceAt(values: js.Array[Double], index: Double, value: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceAt")(values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def schd(fn: js.Function): js.Function1[/* repeated */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("schd")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  
  inline def translate(element: Element, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(element.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def translateThumbs(elements: js.Array[Element], offsets: TThumbOffsets, rtl: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translateThumbs")(elements.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, step: Double): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, step: Double, separator: String): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], step.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: Double,
    separator: String,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], step.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], valueToLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: Double,
    separator: Unit,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], step.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], valueToLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, step: Unit, separator: String): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], step.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: Unit,
    separator: String,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], step.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], valueToLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: Unit,
    separator: Unit,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], step.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], valueToLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, step: Double): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, step: Double, separator: String): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], step.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: Double,
    separator: String,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], step.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], valueToLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: Double,
    separator: Unit,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], step.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], valueToLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, step: Unit, separator: String): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], step.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: Unit,
    separator: String,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], step.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], valueToLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  inline def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: Unit,
    separator: Unit,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThumbOverlap")(rangeRef.asInstanceOf[js.Any], values.asInstanceOf[js.Any], index.asInstanceOf[js.Any], step.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], valueToLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | CSSProperties]]
  
  inline def voidFn(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("voidFn")().asInstanceOf[Unit]
}
