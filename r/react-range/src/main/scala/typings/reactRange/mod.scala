package typings.reactRange

import typings.react.mod.CSSProperties
import typings.reactRange.libRangeMod.default
import typings.reactRange.libTypesMod.Direction
import typings.reactRange.libTypesMod.IProps
import typings.reactRange.libTypesMod.ITrackBackground
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-range", "Direction")
  @js.native
  object Direction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactRange.libTypesMod.Direction & String] = js.native
    
    /* "to bottom" */ val Down: typings.reactRange.libTypesMod.Direction.Down & String = js.native
    
    /* "to left" */ val Left: typings.reactRange.libTypesMod.Direction.Left & String = js.native
    
    /* "to right" */ val Right: typings.reactRange.libTypesMod.Direction.Right & String = js.native
    
    /* "to top" */ val Up: typings.reactRange.libTypesMod.Direction.Up & String = js.native
  }
  
  @JSImport("react-range", "Range")
  @js.native
  open class Range protected () extends default {
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
      inline def allowOverlap_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowOverlap")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range", "Range.defaultProps.direction")
      @js.native
      def direction: Direction = js.native
      inline def direction_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range", "Range.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range", "Range.defaultProps.draggableTrack")
      @js.native
      def draggableTrack: Boolean = js.native
      inline def draggableTrack_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("draggableTrack")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range", "Range.defaultProps.max")
      @js.native
      def max: Double = js.native
      inline def max_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range", "Range.defaultProps.min")
      @js.native
      def min: Double = js.native
      inline def min_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range", "Range.defaultProps.rtl")
      @js.native
      def rtl: Boolean = js.native
      inline def rtl_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rtl")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range", "Range.defaultProps.step")
      @js.native
      def step: Double = js.native
      inline def step_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("step")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def checkValuesAgainstBoundaries(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checkValuesAgainstBoundaries")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTrackBackground(hasValuesColorsMinMaxDirectionRtl: ITrackBackground): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTrackBackground")(hasValuesColorsMinMaxDirectionRtl.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def relativeValue(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeValue")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
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
}
