package typings.snapchatLensStudio.LookAtComponent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorldUpVector extends StObject
/**
  * Used with LookAtComponent to set the “up” vector when determining rotation.
  * ```
  * // Set the LookAtComponent's WorldUpVector to SceneY
  * // @input Component.LookAtComponent lookAtComponent
  * script.lookAtComponent.worldUpVector = LookAtComponent.WorldUpVector.SceneY;
  * ```
  */
@JSGlobal("LookAtComponent.WorldUpVector")
@js.native
object WorldUpVector extends StObject {
  
  /** Current object’s X vector */
  @js.native
  sealed trait ObjectX
    extends StObject
       with WorldUpVector
  
  /** Current object’s Y vector */
  @js.native
  sealed trait ObjectY
    extends StObject
       with WorldUpVector
  
  /** Current object’s Z vector */
  @js.native
  sealed trait ObjectZ
    extends StObject
       with WorldUpVector
  
  /** Scene’s X vector */
  @js.native
  sealed trait SceneX
    extends StObject
       with WorldUpVector
  
  /** Scene’s Y vector */
  @js.native
  sealed trait SceneY
    extends StObject
       with WorldUpVector
  
  /** Scene’s Z vector */
  @js.native
  sealed trait SceneZ
    extends StObject
       with WorldUpVector
  
  /** Target object’s X vector */
  @js.native
  sealed trait TargetX
    extends StObject
       with WorldUpVector
  
  /** Target object’s Y vector */
  @js.native
  sealed trait TargetY
    extends StObject
       with WorldUpVector
  
  /** Target object’s Z vector */
  @js.native
  sealed trait TargetZ
    extends StObject
       with WorldUpVector
}
