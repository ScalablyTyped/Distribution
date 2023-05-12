package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldDescriptorProtoType extends StObject
@JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "FieldDescriptorProto_Type")
@js.native
object FieldDescriptorProtoType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldDescriptorProtoType & Double] = js.native
  
  @js.native
  sealed trait TYPE_BOOL
    extends StObject
       with FieldDescriptorProtoType
  /* 8 */ val TYPE_BOOL: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_BOOL & Double = js.native
  
  /** TYPE_BYTES - New in version 2. */
  @js.native
  sealed trait TYPE_BYTES
    extends StObject
       with FieldDescriptorProtoType
  /* 12 */ val TYPE_BYTES: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_BYTES & Double = js.native
  
  /**
    * TYPE_DOUBLE - 0 is reserved for errors.
    * Order is weird for historical reasons.
    */
  @js.native
  sealed trait TYPE_DOUBLE
    extends StObject
       with FieldDescriptorProtoType
  /* 1 */ val TYPE_DOUBLE: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_DOUBLE & Double = js.native
  
  @js.native
  sealed trait TYPE_ENUM
    extends StObject
       with FieldDescriptorProtoType
  /* 14 */ val TYPE_ENUM: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_ENUM & Double = js.native
  
  @js.native
  sealed trait TYPE_FIXED32
    extends StObject
       with FieldDescriptorProtoType
  /* 7 */ val TYPE_FIXED32: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_FIXED32 & Double = js.native
  
  @js.native
  sealed trait TYPE_FIXED64
    extends StObject
       with FieldDescriptorProtoType
  /* 6 */ val TYPE_FIXED64: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_FIXED64 & Double = js.native
  
  @js.native
  sealed trait TYPE_FLOAT
    extends StObject
       with FieldDescriptorProtoType
  /* 2 */ val TYPE_FLOAT: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_FLOAT & Double = js.native
  
  /**
    * TYPE_GROUP - Tag-delimited aggregate.
    * Group type is deprecated and not supported in proto3. However, Proto3
    * implementations should still be able to parse the group wire format and
    * treat group fields as unknown fields.
    */
  @js.native
  sealed trait TYPE_GROUP
    extends StObject
       with FieldDescriptorProtoType
  /* 10 */ val TYPE_GROUP: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_GROUP & Double = js.native
  
  /**
    * TYPE_INT32 - Not ZigZag encoded.  Negative numbers take 10 bytes.  Use TYPE_SINT32 if
    * negative values are likely.
    */
  @js.native
  sealed trait TYPE_INT32
    extends StObject
       with FieldDescriptorProtoType
  /* 5 */ val TYPE_INT32: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_INT32 & Double = js.native
  
  /**
    * TYPE_INT64 - Not ZigZag encoded.  Negative numbers take 10 bytes.  Use TYPE_SINT64 if
    * negative values are likely.
    */
  @js.native
  sealed trait TYPE_INT64
    extends StObject
       with FieldDescriptorProtoType
  /* 3 */ val TYPE_INT64: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_INT64 & Double = js.native
  
  /** TYPE_MESSAGE - Length-delimited aggregate. */
  @js.native
  sealed trait TYPE_MESSAGE
    extends StObject
       with FieldDescriptorProtoType
  /* 11 */ val TYPE_MESSAGE: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_MESSAGE & Double = js.native
  
  @js.native
  sealed trait TYPE_SFIXED32
    extends StObject
       with FieldDescriptorProtoType
  /* 15 */ val TYPE_SFIXED32: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_SFIXED32 & Double = js.native
  
  @js.native
  sealed trait TYPE_SFIXED64
    extends StObject
       with FieldDescriptorProtoType
  /* 16 */ val TYPE_SFIXED64: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_SFIXED64 & Double = js.native
  
  /** TYPE_SINT32 - Uses ZigZag encoding. */
  @js.native
  sealed trait TYPE_SINT32
    extends StObject
       with FieldDescriptorProtoType
  /* 17 */ val TYPE_SINT32: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_SINT32 & Double = js.native
  
  /** TYPE_SINT64 - Uses ZigZag encoding. */
  @js.native
  sealed trait TYPE_SINT64
    extends StObject
       with FieldDescriptorProtoType
  /* 18 */ val TYPE_SINT64: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_SINT64 & Double = js.native
  
  @js.native
  sealed trait TYPE_STRING
    extends StObject
       with FieldDescriptorProtoType
  /* 9 */ val TYPE_STRING: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_STRING & Double = js.native
  
  @js.native
  sealed trait TYPE_UINT32
    extends StObject
       with FieldDescriptorProtoType
  /* 13 */ val TYPE_UINT32: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_UINT32 & Double = js.native
  
  @js.native
  sealed trait TYPE_UINT64
    extends StObject
       with FieldDescriptorProtoType
  /* 4 */ val TYPE_UINT64: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldDescriptorProtoType.TYPE_UINT64 & Double = js.native
}
