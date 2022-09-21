package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CurveMode extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "CurveMode")
@js.native
object CurveMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CurveMode & Double] = js.native
  
  @js.native
  sealed trait Asymmetric
    extends StObject
       with CurveMode
  /* 3 */ val Asymmetric: typings.sketchHqSketchFileFormatTs.typesMod.CurveMode.Asymmetric & Double = js.native
  
  @js.native
  sealed trait Disconnected
    extends StObject
       with CurveMode
  /* 4 */ val Disconnected: typings.sketchHqSketchFileFormatTs.typesMod.CurveMode.Disconnected & Double = js.native
  
  @js.native
  sealed trait Mirrored
    extends StObject
       with CurveMode
  /* 2 */ val Mirrored: typings.sketchHqSketchFileFormatTs.typesMod.CurveMode.Mirrored & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with CurveMode
  /* 0 */ val None: typings.sketchHqSketchFileFormatTs.typesMod.CurveMode.None & Double = js.native
  
  @js.native
  sealed trait Straight
    extends StObject
       with CurveMode
  /* 1 */ val Straight: typings.sketchHqSketchFileFormatTs.typesMod.CurveMode.Straight & Double = js.native
}
