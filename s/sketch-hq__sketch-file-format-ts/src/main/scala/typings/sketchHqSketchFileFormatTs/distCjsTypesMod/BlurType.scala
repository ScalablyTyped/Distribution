package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlurType extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "BlurType")
@js.native
object BlurType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlurType & Double] = js.native
  
  @js.native
  sealed trait Background
    extends StObject
       with BlurType
  /* 3 */ val Background: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.BlurType.Background & Double = js.native
  
  @js.native
  sealed trait Gaussian
    extends StObject
       with BlurType
  /* 0 */ val Gaussian: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.BlurType.Gaussian & Double = js.native
  
  @js.native
  sealed trait Motion
    extends StObject
       with BlurType
  /* 1 */ val Motion: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.BlurType.Motion & Double = js.native
  
  @js.native
  sealed trait Zoom
    extends StObject
       with BlurType
  /* 2 */ val Zoom: typings.sketchHqSketchFileFormatTs.distCjsTypesMod.BlurType.Zoom & Double = js.native
}
