package typings.snapchatLensStudio.LookAtComponent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AimVectors extends StObject
/**
  * The “aim” and “up” vectors used with LookAtComponent when determining rotation. LookAtComponent will try to point the Aim axis of the SceneObject towards the target, while keeping the Up axis
  * of the SceneObject pointing towards worldUpVector.
  */
@JSGlobal("LookAtComponent.AimVectors")
@js.native
object AimVectors extends StObject {
  
  /** -X Aim, -Y Up */
  @js.native
  sealed trait NegativeXAimNegativeYUp
    extends StObject
       with AimVectors
  
  /** -X Aim, -Z Up */
  @js.native
  sealed trait NegativeXAimNegativeZUp
    extends StObject
       with AimVectors
  
  /** -X Aim, Y Up */
  @js.native
  sealed trait NegativeXAimYUp
    extends StObject
       with AimVectors
  
  /** -X Aim, Z Up */
  @js.native
  sealed trait NegativeXAimZUp
    extends StObject
       with AimVectors
  
  /** -Y Aim, -X Up */
  @js.native
  sealed trait NegativeYAimNegativeXUp
    extends StObject
       with AimVectors
  
  /** -Y Aim, -Z Up */
  @js.native
  sealed trait NegativeYAimNegativeZUp
    extends StObject
       with AimVectors
  
  /** -Y Aim, X Up */
  @js.native
  sealed trait NegativeYAimXUp
    extends StObject
       with AimVectors
  
  /** -Y Aim, Z Up */
  @js.native
  sealed trait NegativeYAimZUp
    extends StObject
       with AimVectors
  
  /** -Z Aim, -X Up */
  @js.native
  sealed trait NegativeZAimNegativeXUp
    extends StObject
       with AimVectors
  
  /** -Z Aim, -Y Up */
  @js.native
  sealed trait NegativeZAimNegativeYUp
    extends StObject
       with AimVectors
  
  /** -Z Aim, X Up */
  @js.native
  sealed trait NegativeZAimXUp
    extends StObject
       with AimVectors
  
  /** -Z Aim, Y Up */
  @js.native
  sealed trait NegativeZAimYUp
    extends StObject
       with AimVectors
  
  /** X Aim, -Y Up */
  @js.native
  sealed trait XAimNegativeYUp
    extends StObject
       with AimVectors
  
  /** X Aim, -Z Up */
  @js.native
  sealed trait XAimNegativeZUp
    extends StObject
       with AimVectors
  
  /** X Aim, Y Up */
  @js.native
  sealed trait XAimYUp
    extends StObject
       with AimVectors
  
  /** X Aim, Z Up */
  @js.native
  sealed trait XAimZUp
    extends StObject
       with AimVectors
  
  /** Y Aim, -X Up */
  @js.native
  sealed trait YAimNegativeXUp
    extends StObject
       with AimVectors
  
  /** Y Aim, -Z Up */
  @js.native
  sealed trait YAimNegativeZUp
    extends StObject
       with AimVectors
  
  /** Y Aim, X Up */
  @js.native
  sealed trait YAimXUp
    extends StObject
       with AimVectors
  
  /** Y Aim, Z Up */
  @js.native
  sealed trait YAimZUp
    extends StObject
       with AimVectors
  
  /** Z Aim, -X Up */
  @js.native
  sealed trait ZAimNegativeXUp
    extends StObject
       with AimVectors
  
  /** Z Aim, -Y Up */
  @js.native
  sealed trait ZAimNegativeYUp
    extends StObject
       with AimVectors
  
  /** Z Aim, X Up */
  @js.native
  sealed trait ZAimXUp
    extends StObject
       with AimVectors
  
  /** Z Aim, Y Up */
  @js.native
  sealed trait ZAimYUp
    extends StObject
       with AimVectors
}
