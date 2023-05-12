package typings.sigstoreProtobufSpecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `dist@GeneratedGoogleApiFieldBehaviorMod` {
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/api/field_behavior", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait FieldBehavior extends StObject
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/api/field_behavior", "FieldBehavior")
  @js.native
  object FieldBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FieldBehavior & Double] = js.native
    
    /** FIELD_BEHAVIOR_UNSPECIFIED - Conventional default for enums. Do not use this. */
    @js.native
    sealed trait FIELD_BEHAVIOR_UNSPECIFIED
      extends StObject
         with FieldBehavior
    /* 0 */ val FIELD_BEHAVIOR_UNSPECIFIED: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleApiFieldBehaviorMod`.FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED & Double = js.native
    
    /**
      * IMMUTABLE - Denotes a field as immutable.
      * This indicates that the field may be set once in a request to create a
      * resource, but may not be changed thereafter.
      */
    @js.native
    sealed trait IMMUTABLE
      extends StObject
         with FieldBehavior
    /* 5 */ val IMMUTABLE: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleApiFieldBehaviorMod`.FieldBehavior.IMMUTABLE & Double = js.native
    
    /**
      * INPUT_ONLY - Denotes a field as input only.
      * This indicates that the field is provided in requests, and the
      * corresponding field is not included in output.
      */
    @js.native
    sealed trait INPUT_ONLY
      extends StObject
         with FieldBehavior
    /* 4 */ val INPUT_ONLY: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleApiFieldBehaviorMod`.FieldBehavior.INPUT_ONLY & Double = js.native
    
    /**
      * OPTIONAL - Specifically denotes a field as optional.
      * While all fields in protocol buffers are optional, this may be specified
      * for emphasis if appropriate.
      */
    @js.native
    sealed trait OPTIONAL
      extends StObject
         with FieldBehavior
    /* 1 */ val OPTIONAL: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleApiFieldBehaviorMod`.FieldBehavior.OPTIONAL & Double = js.native
    
    /**
      * OUTPUT_ONLY - Denotes a field as output only.
      * This indicates that the field is provided in responses, but including the
      * field in a request does nothing (the server *must* ignore it and
      * *must not* throw an error as a result of the field's presence).
      */
    @js.native
    sealed trait OUTPUT_ONLY
      extends StObject
         with FieldBehavior
    /* 3 */ val OUTPUT_ONLY: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleApiFieldBehaviorMod`.FieldBehavior.OUTPUT_ONLY & Double = js.native
    
    /**
      * REQUIRED - Denotes a field as required.
      * This indicates that the field **must** be provided as part of the request,
      * and failure to do so will cause an error (usually `INVALID_ARGUMENT`).
      */
    @js.native
    sealed trait REQUIRED
      extends StObject
         with FieldBehavior
    /* 2 */ val REQUIRED: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleApiFieldBehaviorMod`.FieldBehavior.REQUIRED & Double = js.native
    
    /**
      * UNORDERED_LIST - Denotes that a (repeated) field is an unordered list.
      * This indicates that the service may provide the elements of the list
      * in any arbitrary order, rather than the order the user originally
      * provided. Additionally, the list's order may or may not be stable.
      */
    @js.native
    sealed trait UNORDERED_LIST
      extends StObject
         with FieldBehavior
    /* 6 */ val UNORDERED_LIST: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleApiFieldBehaviorMod`.FieldBehavior.UNORDERED_LIST & Double = js.native
  }
  
  inline def fieldBehaviorFromJSON(`object`: Any): FieldBehavior = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldBehaviorFromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[FieldBehavior]
  
  inline def fieldBehaviorToJSON(`object`: FieldBehavior): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldBehaviorToJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
}
