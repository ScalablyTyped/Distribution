package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FaceInsetRegion extends StObject
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
  
  /** Targets the entire face */
  @js.native
  sealed trait Face
    extends StObject
       with FaceInsetRegion
  
  /** Targets the left eye */
  @js.native
  sealed trait LeftEye
    extends StObject
       with FaceInsetRegion
  
  /** Targets the mouth */
  @js.native
  sealed trait Mouth
    extends StObject
       with FaceInsetRegion
  
  /** Targets the nose */
  @js.native
  sealed trait Nose
    extends StObject
       with FaceInsetRegion
  
  /** Targets the right eye */
  @js.native
  sealed trait RightEye
    extends StObject
       with FaceInsetRegion
}
