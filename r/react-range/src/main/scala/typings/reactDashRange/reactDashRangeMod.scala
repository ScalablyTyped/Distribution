package typings.reactDashRange

import typings.react.reactMod.CSSProperties
import typings.reactDashRange.libRangeMod.default
import typings.reactDashRange.libTypesMod.IProps
import typings.reactDashRange.libTypesMod.ITrackBackground
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-range", JSImport.Namespace)
@js.native
object reactDashRangeMod extends js.Object {
  @js.native
  class Range protected () extends default {
    def this(props: IProps) = this()
  }
  
  def getTrackBackground(hasValuesColorsMinMaxDirectionRtl: ITrackBackground): String = js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, separator: String): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, separator: String): js.Array[String | CSSProperties] = js.native
  @js.native
  object Direction extends js.Object {
    /* "to bottom" */ val Down: typings.reactDashRange.libTypesMod.Direction.Down with String = js.native
    /* "to left" */ val Left: typings.reactDashRange.libTypesMod.Direction.Left with String = js.native
    /* "to right" */ val Right: typings.reactDashRange.libTypesMod.Direction.Right with String = js.native
    /* "to top" */ val Up: typings.reactDashRange.libTypesMod.Direction.Up with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactDashRange.libTypesMod.Direction with String] = js.native
  }
  
  /* static members */
  @js.native
  object Range extends js.Object {
    var defaultProps: Anon_AllowOverlap = js.native
  }
  
}

