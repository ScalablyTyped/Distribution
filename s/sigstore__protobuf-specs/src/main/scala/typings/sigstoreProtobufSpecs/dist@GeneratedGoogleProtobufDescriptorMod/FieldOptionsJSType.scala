package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldOptionsJSType extends StObject
@JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "FieldOptions_JSType")
@js.native
object FieldOptionsJSType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldOptionsJSType & Double] = js.native
  
  /** JS_NORMAL - Use the default type. */
  @js.native
  sealed trait JS_NORMAL
    extends StObject
       with FieldOptionsJSType
  /* 0 */ val JS_NORMAL: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldOptionsJSType.JS_NORMAL & Double = js.native
  
  /** JS_NUMBER - Use JavaScript numbers. */
  @js.native
  sealed trait JS_NUMBER
    extends StObject
       with FieldOptionsJSType
  /* 2 */ val JS_NUMBER: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldOptionsJSType.JS_NUMBER & Double = js.native
  
  /** JS_STRING - Use JavaScript strings. */
  @js.native
  sealed trait JS_STRING
    extends StObject
       with FieldOptionsJSType
  /* 1 */ val JS_STRING: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FieldOptionsJSType.JS_STRING & Double = js.native
}
