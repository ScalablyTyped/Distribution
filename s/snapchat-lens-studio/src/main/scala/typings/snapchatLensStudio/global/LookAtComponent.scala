package typings.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LookAtComponent {
  
  /**
    * The “aim” and “up” vectors used with LookAtComponent when determining rotation. LookAtComponent will try to point the Aim axis of the SceneObject towards the target, while keeping the Up axis
    * of the SceneObject pointing towards worldUpVector.
    */
  @JSGlobal("LookAtComponent.AimVectors")
  @js.native
  object AimVectors extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.LookAtComponent.AimVectors & Double] = js.native
    
    /* 18 */ val NegativeXAimNegativeYUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.NegativeXAimNegativeYUp & Double = js.native
    
    /* 19 */ val NegativeXAimNegativeZUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.NegativeXAimNegativeZUp & Double = js.native
    
    /* 12 */ val NegativeXAimYUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.NegativeXAimYUp & Double = js.native
    
    /* 13 */ val NegativeXAimZUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.NegativeXAimZUp & Double = js.native
    
    /* 20 */ val NegativeYAimNegativeXUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.NegativeYAimNegativeXUp & Double = js.native
    
    /* 21 */ val NegativeYAimNegativeZUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.NegativeYAimNegativeZUp & Double = js.native
    
    /* 14 */ val NegativeYAimXUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.NegativeYAimXUp & Double = js.native
    
    /* 15 */ val NegativeYAimZUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.NegativeYAimZUp & Double = js.native
    
    /* 22 */ val NegativeZAimNegativeXUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.NegativeZAimNegativeXUp & Double = js.native
    
    /* 23 */ val NegativeZAimNegativeYUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.NegativeZAimNegativeYUp & Double = js.native
    
    /* 16 */ val NegativeZAimXUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.NegativeZAimXUp & Double = js.native
    
    /* 17 */ val NegativeZAimYUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.NegativeZAimYUp & Double = js.native
    
    /* 6 */ val XAimNegativeYUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.XAimNegativeYUp & Double = js.native
    
    /* 7 */ val XAimNegativeZUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.XAimNegativeZUp & Double = js.native
    
    /* 0 */ val XAimYUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.XAimYUp & Double = js.native
    
    /* 1 */ val XAimZUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.XAimZUp & Double = js.native
    
    /* 8 */ val YAimNegativeXUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.YAimNegativeXUp & Double = js.native
    
    /* 9 */ val YAimNegativeZUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.YAimNegativeZUp & Double = js.native
    
    /* 2 */ val YAimXUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.YAimXUp & Double = js.native
    
    /* 3 */ val YAimZUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.YAimZUp & Double = js.native
    
    /* 10 */ val ZAimNegativeXUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.ZAimNegativeXUp & Double = js.native
    
    /* 11 */ val ZAimNegativeYUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.ZAimNegativeYUp & Double = js.native
    
    /* 4 */ val ZAimXUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.ZAimXUp & Double = js.native
    
    /* 5 */ val ZAimYUp: typings.snapchatLensStudio.LookAtComponent.AimVectors.ZAimYUp & Double = js.native
  }
  
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.LookAtComponent.LookAtMode & Double] = js.native
    
    /* 1 */ val LookAtDirection: typings.snapchatLensStudio.LookAtComponent.LookAtMode.LookAtDirection & Double = js.native
    
    /* 0 */ val LookAtPoint: typings.snapchatLensStudio.LookAtComponent.LookAtMode.LookAtPoint & Double = js.native
  }
  
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.LookAtComponent.WorldUpVector & Double] = js.native
    
    /* 6 */ val ObjectX: typings.snapchatLensStudio.LookAtComponent.WorldUpVector.ObjectX & Double = js.native
    
    /* 7 */ val ObjectY: typings.snapchatLensStudio.LookAtComponent.WorldUpVector.ObjectY & Double = js.native
    
    /* 8 */ val ObjectZ: typings.snapchatLensStudio.LookAtComponent.WorldUpVector.ObjectZ & Double = js.native
    
    /* 0 */ val SceneX: typings.snapchatLensStudio.LookAtComponent.WorldUpVector.SceneX & Double = js.native
    
    /* 1 */ val SceneY: typings.snapchatLensStudio.LookAtComponent.WorldUpVector.SceneY & Double = js.native
    
    /* 2 */ val SceneZ: typings.snapchatLensStudio.LookAtComponent.WorldUpVector.SceneZ & Double = js.native
    
    /* 3 */ val TargetX: typings.snapchatLensStudio.LookAtComponent.WorldUpVector.TargetX & Double = js.native
    
    /* 4 */ val TargetY: typings.snapchatLensStudio.LookAtComponent.WorldUpVector.TargetY & Double = js.native
    
    /* 5 */ val TargetZ: typings.snapchatLensStudio.LookAtComponent.WorldUpVector.TargetZ & Double = js.native
  }
}
