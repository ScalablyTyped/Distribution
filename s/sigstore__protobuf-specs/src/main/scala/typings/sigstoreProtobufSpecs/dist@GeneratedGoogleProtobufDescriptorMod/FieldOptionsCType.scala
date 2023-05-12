package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldOptionsCType extends StObject
@JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "FieldOptions_CType")
@js.native
object FieldOptionsCType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldOptionsCType & Double] = js.native
  
  @js.native
  sealed trait CORD
    extends StObject
       with FieldOptionsCType
  /* 1 */ val CORD: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldOptionsCType.CORD & Double = js.native
  
  /** STRING - Default mode. */
  @js.native
  sealed trait STRING
    extends StObject
       with FieldOptionsCType
  /* 0 */ val STRING: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldOptionsCType.STRING & Double = js.native
  
  @js.native
  sealed trait STRING_PIECE
    extends StObject
       with FieldOptionsCType
  /* 2 */ val STRING_PIECE: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldOptionsCType.STRING_PIECE & Double = js.native
}
