package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HashAlgorithm extends StObject
@JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "HashAlgorithm")
@js.native
object HashAlgorithm extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HashAlgorithm & Double] = js.native
  
  @js.native
  sealed trait HASH_ALGORITHM_UNSPECIFIED
    extends StObject
       with HashAlgorithm
  /* 0 */ val HASH_ALGORITHM_UNSPECIFIED: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.HashAlgorithm.HASH_ALGORITHM_UNSPECIFIED & Double = js.native
  
  @js.native
  sealed trait SHA2_256
    extends StObject
       with HashAlgorithm
  /* 1 */ val SHA2_256: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.HashAlgorithm.SHA2_256 & Double = js.native
}
