package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PublicKeyDetails extends StObject
@JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "PublicKeyDetails")
@js.native
object PublicKeyDetails extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PublicKeyDetails & Double] = js.native
  
  /** PKCS1_RSA_PKCS1V5 - RSA */
  @js.native
  sealed trait PKCS1_RSA_PKCS1V5
    extends StObject
       with PublicKeyDetails
  /* 1 */ val PKCS1_RSA_PKCS1V5: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.PublicKeyDetails.PKCS1_RSA_PKCS1V5 & Double = js.native
  
  /** PKCS1_RSA_PSS - See RFC8017 */
  @js.native
  sealed trait PKCS1_RSA_PSS
    extends StObject
       with PublicKeyDetails
  /* 2 */ val PKCS1_RSA_PSS: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.PublicKeyDetails.PKCS1_RSA_PSS & Double = js.native
  
  /** PKIX_ECDSA_P256_HMAC_SHA_256 - See RFC6979 */
  @js.native
  sealed trait PKIX_ECDSA_P256_HMAC_SHA_256
    extends StObject
       with PublicKeyDetails
  /* 6 */ val PKIX_ECDSA_P256_HMAC_SHA_256: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.PublicKeyDetails.PKIX_ECDSA_P256_HMAC_SHA_256 & Double = js.native
  
  /** PKIX_ECDSA_P256_SHA_256 - ECDSA */
  @js.native
  sealed trait PKIX_ECDSA_P256_SHA_256
    extends StObject
       with PublicKeyDetails
  /* 5 */ val PKIX_ECDSA_P256_SHA_256: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.PublicKeyDetails.PKIX_ECDSA_P256_SHA_256 & Double = js.native
  
  /** PKIX_ED25519 - Ed 25519 */
  @js.native
  sealed trait PKIX_ED25519
    extends StObject
       with PublicKeyDetails
  /* 7 */ val PKIX_ED25519: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.PublicKeyDetails.PKIX_ED25519 & Double = js.native
  
  @js.native
  sealed trait PKIX_RSA_PKCS1V5
    extends StObject
       with PublicKeyDetails
  /* 3 */ val PKIX_RSA_PKCS1V5: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.PublicKeyDetails.PKIX_RSA_PKCS1V5 & Double = js.native
  
  @js.native
  sealed trait PKIX_RSA_PSS
    extends StObject
       with PublicKeyDetails
  /* 4 */ val PKIX_RSA_PSS: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.PublicKeyDetails.PKIX_RSA_PSS & Double = js.native
  
  @js.native
  sealed trait PUBLIC_KEY_DETAILS_UNSPECIFIED
    extends StObject
       with PublicKeyDetails
  /* 0 */ val PUBLIC_KEY_DETAILS_UNSPECIFIED: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.PublicKeyDetails.PUBLIC_KEY_DETAILS_UNSPECIFIED & Double = js.native
}
