package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

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
  /* 3 */ val Asymmetric: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.CurveMode.Asymmetric & Double = js.native
  
  @js.native
  sealed trait Disconnected
    extends StObject
       with CurveMode
  /* 4 */ val Disconnected: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.CurveMode.Disconnected & Double = js.native
  
  @js.native
  sealed trait Mirrored
    extends StObject
       with CurveMode
  /* 2 */ val Mirrored: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.CurveMode.Mirrored & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with CurveMode
  /* 0 */ val None: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.CurveMode.None & Double = js.native
  
  @js.native
  sealed trait Straight
    extends StObject
       with CurveMode
  /* 1 */ val Straight: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.CurveMode.Straight & Double = js.native
}
