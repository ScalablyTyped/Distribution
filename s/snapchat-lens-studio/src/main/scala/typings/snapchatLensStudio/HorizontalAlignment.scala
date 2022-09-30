package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalAlignment extends StObject
/** Used by the horizontalAlignment property in MeshVisual. When a ScreenTransform is attached to the same SceneObject, this determines how the mesh will be positioned horizontally. */
@JSGlobal("HorizontalAlignment")
@js.native
object HorizontalAlignment extends StObject {
  
  /** The mesh will be centered. */
  @js.native
  sealed trait Center
    extends StObject
       with HorizontalAlignment
  
  /** The mesh will be aligned to the left side. */
  @js.native
  sealed trait Left
    extends StObject
       with HorizontalAlignment
  
  /** The mesh will be aligned to the right side. */
  @js.native
  sealed trait Right
    extends StObject
       with HorizontalAlignment
}
