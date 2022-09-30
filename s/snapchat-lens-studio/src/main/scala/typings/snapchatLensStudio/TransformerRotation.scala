package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransformerRotation extends StObject
/** Rotation types used by TransformBuilder. */
@JSGlobal("TransformerRotation")
@js.native
object TransformerRotation extends StObject {
  
  /** No rotation */
  @js.native
  sealed trait None
    extends StObject
       with TransformerRotation
  
  /** Rotates by 180 degrees */
  @js.native
  sealed trait Rotate180
    extends StObject
       with TransformerRotation
  
  /** Rotates by 270 degrees */
  @js.native
  sealed trait Rotate270
    extends StObject
       with TransformerRotation
  
  /** Rotates by 90 degrees */
  @js.native
  sealed trait Rotate90
    extends StObject
       with TransformerRotation
}
