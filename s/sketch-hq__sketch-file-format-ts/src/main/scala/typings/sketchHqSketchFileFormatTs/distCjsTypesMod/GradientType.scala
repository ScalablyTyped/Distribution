package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GradientType extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "GradientType")
@js.native
object GradientType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GradientType & Double] = js.native
  
  @js.native
  sealed trait Angular
    extends StObject
       with GradientType
  /* 2 */ val Angular: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.GradientType.Angular & Double = js.native
  
  @js.native
  sealed trait Linear
    extends StObject
       with GradientType
  /* 0 */ val Linear: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.GradientType.Linear & Double = js.native
  
  @js.native
  sealed trait Radial
    extends StObject
       with GradientType
  /* 1 */ val Radial: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.GradientType.Radial & Double = js.native
}
