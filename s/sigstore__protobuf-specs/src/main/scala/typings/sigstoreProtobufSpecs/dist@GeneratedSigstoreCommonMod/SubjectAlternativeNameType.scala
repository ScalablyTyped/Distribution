package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubjectAlternativeNameType extends StObject
@JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "SubjectAlternativeNameType")
@js.native
object SubjectAlternativeNameType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubjectAlternativeNameType & Double] = js.native
  
  @js.native
  sealed trait EMAIL
    extends StObject
       with SubjectAlternativeNameType
  /* 1 */ val EMAIL: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.SubjectAlternativeNameType.EMAIL & Double = js.native
  
  /**
    * OTHER_NAME - OID 1.3.6.1.4.1.57264.1.7
    * See https://github.com/sigstore/fulcio/blob/main/docs/oid-info.md#1361415726417--othername-san
    * for more details.
    */
  @js.native
  sealed trait OTHER_NAME
    extends StObject
       with SubjectAlternativeNameType
  /* 3 */ val OTHER_NAME: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.SubjectAlternativeNameType.OTHER_NAME & Double = js.native
  
  @js.native
  sealed trait SUBJECT_ALTERNATIVE_NAME_TYPE_UNSPECIFIED
    extends StObject
       with SubjectAlternativeNameType
  /* 0 */ val SUBJECT_ALTERNATIVE_NAME_TYPE_UNSPECIFIED: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.SubjectAlternativeNameType.SUBJECT_ALTERNATIVE_NAME_TYPE_UNSPECIFIED & Double = js.native
  
  @js.native
  sealed trait URI
    extends StObject
       with SubjectAlternativeNameType
  /* 2 */ val URI: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.SubjectAlternativeNameType.URI & Double = js.native
}
