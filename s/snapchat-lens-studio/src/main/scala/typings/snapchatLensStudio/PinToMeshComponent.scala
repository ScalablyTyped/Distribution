package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PinToMeshComponent {
  
  @js.native
  sealed trait Orientation extends StObject
  @JSGlobal("PinToMeshComponent.Orientation")
  @js.native
  object Orientation extends StObject {
    
    /** Pins only the position. Rotation is independent from the target mesh. */
    @js.native
    sealed trait OnlyPosition
      extends StObject
         with Orientation
    
    /** Pins both the position and direction. The normal of the target mesh is the Y axis. The U texture coordinate of the target mesh’s UV is the X axis. */
    @js.native
    sealed trait PositionAndDirection
      extends StObject
         with Orientation
  }
}
