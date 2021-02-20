package typings.reactRange

import typings.react.mod.CSSProperties
import typings.reactRange.rangeMod.default
import typings.reactRange.typesMod.Direction
import typings.reactRange.typesMod.IProps
import typings.reactRange.typesMod.ITrackBackground
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-range", "Direction")
  @js.native
  object Direction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactRange.typesMod.Direction with String] = js.native
    
    /* "to bottom" */ val Down: typings.reactRange.typesMod.Direction.Down with String = js.native
    
    /* "to left" */ val Left: typings.reactRange.typesMod.Direction.Left with String = js.native
    
    /* "to right" */ val Right: typings.reactRange.typesMod.Direction.Right with String = js.native
    
    /* "to top" */ val Up: typings.reactRange.typesMod.Direction.Up with String = js.native
  }
  
  @JSImport("react-range", "Range")
  @js.native
  class Range protected () extends default {
    def this(props: IProps) = this()
  }
  object Range {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-range", "Range.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-range", "Range.defaultProps.allowOverlap")
      @js.native
      def allowOverlap: Boolean = js.native
      @scala.inline
      def allowOverlap_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowOverlap")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range", "Range.defaultProps.direction")
      @js.native
      def direction: Direction = js.native
      @scala.inline
      def direction_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range", "Range.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      @scala.inline
      def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range", "Range.defaultProps.draggableTrack")
      @js.native
      def draggableTrack: Boolean = js.native
      @scala.inline
      def draggableTrack_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("draggableTrack")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range", "Range.defaultProps.max")
      @js.native
      def max: Double = js.native
      @scala.inline
      def max_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range", "Range.defaultProps.min")
      @js.native
      def min: Double = js.native
      @scala.inline
      def min_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range", "Range.defaultProps.rtl")
      @js.native
      def rtl: Boolean = js.native
      @scala.inline
      def rtl_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rtl")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range", "Range.defaultProps.step")
      @js.native
      def step: Double = js.native
      @scala.inline
      def step_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("step")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("react-range", "getTrackBackground")
  @js.native
  def getTrackBackground(hasValuesColorsMinMaxDirectionRtl: ITrackBackground): String = js.native
  
  @JSImport("react-range", "relativeValue")
  @js.native
  def relativeValue(value: Double, min: Double, max: Double): Double = js.native
  
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: js.UndefOr[scala.Nothing],
    separator: js.UndefOr[scala.Nothing],
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: js.UndefOr[scala.Nothing],
    separator: String
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: js.UndefOr[scala.Nothing],
    separator: String,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, step: Double): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: Double,
    separator: js.UndefOr[scala.Nothing],
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, step: Double, separator: String): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: Null,
    values: js.Array[Double],
    index: Double,
    step: Double,
    separator: String,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: js.UndefOr[scala.Nothing],
    separator: js.UndefOr[scala.Nothing],
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: js.UndefOr[scala.Nothing],
    separator: String
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: js.UndefOr[scala.Nothing],
    separator: String,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, step: Double): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: Double,
    separator: js.UndefOr[scala.Nothing],
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, step: Double, separator: String): js.Array[String | CSSProperties] = js.native
  @JSImport("react-range", "useThumbOverlap")
  @js.native
  def useThumbOverlap(
    rangeRef: default,
    values: js.Array[Double],
    index: Double,
    step: Double,
    separator: String,
    valueToLabel: js.Function1[/* value */ String, String]
  ): js.Array[String | CSSProperties] = js.native
}
