package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MethodOptionsIdempotencyLevel extends StObject
@JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "MethodOptions_IdempotencyLevel")
@js.native
object MethodOptionsIdempotencyLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MethodOptionsIdempotencyLevel & Double] = js.native
  
  @js.native
  sealed trait IDEMPOTENCY_UNKNOWN
    extends StObject
       with MethodOptionsIdempotencyLevel
  /* 0 */ val IDEMPOTENCY_UNKNOWN: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.MethodOptionsIdempotencyLevel.IDEMPOTENCY_UNKNOWN & Double = js.native
  
  /** IDEMPOTENT - idempotent, but may have side effects */
  @js.native
  sealed trait IDEMPOTENT
    extends StObject
       with MethodOptionsIdempotencyLevel
  /* 2 */ val IDEMPOTENT: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.MethodOptionsIdempotencyLevel.IDEMPOTENT & Double = js.native
  
  /** NO_SIDE_EFFECTS - implies idempotent */
  @js.native
  sealed trait NO_SIDE_EFFECTS
    extends StObject
       with MethodOptionsIdempotencyLevel
  /* 1 */ val NO_SIDE_EFFECTS: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.MethodOptionsIdempotencyLevel.NO_SIDE_EFFECTS & Double = js.native
}
