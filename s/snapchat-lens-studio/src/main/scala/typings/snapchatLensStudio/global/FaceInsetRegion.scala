package typings.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used with FaceInsetVisual.faceRegion for setting the face region to draw.
  * ```
  * //@input Component.FaceInsetVisual faceInset
  * // Sets the face inset to draw the mouth
  * script.faceInset.faceRegion = FaceInsetRegion.Mouth;
  * ```
  */
@JSGlobal("FaceInsetRegion")
@js.native
object FaceInsetRegion extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.FaceInsetRegion & Double] = js.native
  
  /* 4 */ val Face: typings.snapchatLensStudio.FaceInsetRegion.Face & Double = js.native
  
  /* 0 */ val LeftEye: typings.snapchatLensStudio.FaceInsetRegion.LeftEye & Double = js.native
  
  /* 2 */ val Mouth: typings.snapchatLensStudio.FaceInsetRegion.Mouth & Double = js.native
  
  /* 3 */ val Nose: typings.snapchatLensStudio.FaceInsetRegion.Nose & Double = js.native
  
  /* 1 */ val RightEye: typings.snapchatLensStudio.FaceInsetRegion.RightEye & Double = js.native
}
