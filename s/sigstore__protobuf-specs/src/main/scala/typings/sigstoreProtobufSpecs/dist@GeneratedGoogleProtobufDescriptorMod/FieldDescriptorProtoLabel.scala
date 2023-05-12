package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldDescriptorProtoLabel extends StObject
@JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "FieldDescriptorProto_Label")
@js.native
object FieldDescriptorProtoLabel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldDescriptorProtoLabel & Double] = js.native
  
  /** LABEL_OPTIONAL - 0 is reserved for errors */
  @js.native
  sealed trait LABEL_OPTIONAL
    extends StObject
       with FieldDescriptorProtoLabel
  /* 1 */ val LABEL_OPTIONAL: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoLabel.LABEL_OPTIONAL & Double = js.native
  
  @js.native
  sealed trait LABEL_REPEATED
    extends StObject
       with FieldDescriptorProtoLabel
  /* 3 */ val LABEL_REPEATED: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoLabel.LABEL_REPEATED & Double = js.native
  
  @js.native
  sealed trait LABEL_REQUIRED
    extends StObject
       with FieldDescriptorProtoLabel
  /* 2 */ val LABEL_REQUIRED: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoLabel.LABEL_REQUIRED & Double = js.native
}
