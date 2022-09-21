package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointsRadiusBehaviour extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "PointsRadiusBehaviour")
@js.native
object PointsRadiusBehaviour extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointsRadiusBehaviour & Double] = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with PointsRadiusBehaviour
  /* -1 */ val Disabled: typings.sketchHqSketchFileFormatTs.typesMod.PointsRadiusBehaviour.Disabled & Double = js.native
  
  @js.native
  sealed trait Legacy
    extends StObject
       with PointsRadiusBehaviour
  /* 0 */ val Legacy: typings.sketchHqSketchFileFormatTs.typesMod.PointsRadiusBehaviour.Legacy & Double = js.native
  
  @js.native
  sealed trait Rounded
    extends StObject
       with PointsRadiusBehaviour
  /* 1 */ val Rounded: typings.sketchHqSketchFileFormatTs.typesMod.PointsRadiusBehaviour.Rounded & Double = js.native
  
  @js.native
  sealed trait Smooth
    extends StObject
       with PointsRadiusBehaviour
  /* 2 */ val Smooth: typings.sketchHqSketchFileFormatTs.typesMod.PointsRadiusBehaviour.Smooth & Double = js.native
}
