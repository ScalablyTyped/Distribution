package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalAlignment extends StObject
/** Used by the verticalAlignment property in MeshVisual. When a ScreenTransform is attached to the same SceneObject, this determines how the mesh will be positioned vertically. */
@JSGlobal("VerticalAlignment")
@js.native
object VerticalAlignment extends StObject {
  
  /** The mesh will be aligned to the bottom side. */
  @js.native
  sealed trait Bottom
    extends StObject
       with VerticalAlignment
  
  /** The mesh will be centered. */
  @js.native
  sealed trait Center
    extends StObject
       with VerticalAlignment
  
  /** The mesh will be aligned to the top side. */
  @js.native
  sealed trait Top
    extends StObject
       with VerticalAlignment
}
