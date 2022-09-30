package typings.snapchatLensStudio.LookAtComponent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LookAtMode extends StObject
/**
  * Modes used in LookAtComponent.lookAtMode to determine the rotation method being used.
  * ```
  * // @input Component.LookAtComponent lookAt
  *
  * script.lookAt.lookAtMode = LookAtComponent.LookAtMode.LookAtPoint;
  * script.lookAt.target = script.getSceneObject();
  * ```
  */
@JSGlobal("LookAtComponent.LookAtMode")
@js.native
object LookAtMode extends StObject {
  
  /** Rotation is based on the target object’s rotation */
  @js.native
  sealed trait LookAtDirection
    extends StObject
       with LookAtMode
  
  /** Rotation is based on the target object’s position */
  @js.native
  sealed trait LookAtPoint
    extends StObject
       with LookAtMode
}
