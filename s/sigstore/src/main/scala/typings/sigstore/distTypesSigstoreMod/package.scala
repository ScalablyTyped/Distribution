package typings.sigstore.distTypesSigstoreMod

import typings.sigstore.distTypesSigstoreMod.^
import typings.sigstore.distTypesSigstoreValidateMod.ValidBundle
import typings.sigstore.distX509CertMod.x509Certificate
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreBundleMod`.Bundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def assertValidBundle(b: Bundle): /* asserts b is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(sigstore), TsIdentModule(None,List(sigstore, dist, types, sigstore, validate)), TsIdentSimple(ValidBundle))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertValidBundle")(b.asInstanceOf[js.Any]).asInstanceOf[/* asserts b is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(sigstore), TsIdentModule(None,List(sigstore, dist, types, sigstore, validate)), TsIdentSimple(ValidBundle))),IArray())*/ Boolean]

inline def bundleFromJSON(obj: Any): ValidBundle = ^.asInstanceOf[js.Dynamic].applyDynamic("bundleFromJSON")(obj.asInstanceOf[js.Any]).asInstanceOf[ValidBundle]

inline def hashAlgorithmFromJSON(`object`: Any): typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.HashAlgorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("hashAlgorithmFromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.HashAlgorithm]

inline def hashAlgorithmToJSON(`object`: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.HashAlgorithm): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashAlgorithmToJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]

inline def isBundleWithCertificateChain(bundle: Bundle): /* is sigstore.sigstore/dist/types/sigstore.BundleWithCertificateChain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBundleWithCertificateChain")(bundle.asInstanceOf[js.Any]).asInstanceOf[/* is sigstore.sigstore/dist/types/sigstore.BundleWithCertificateChain */ Boolean]

inline def isBundleWithVerificationMaterial(bundle: Bundle): /* is sigstore.sigstore/dist/types/sigstore.BundleWithVerificationMaterial */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBundleWithVerificationMaterial")(bundle.asInstanceOf[js.Any]).asInstanceOf[/* is sigstore.sigstore/dist/types/sigstore.BundleWithVerificationMaterial */ Boolean]

inline def isCAVerificationOptions(
  options: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.ArtifactVerificationOptions
): /* is sigstore.sigstore/dist/types/sigstore.CAArtifactVerificationOptions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCAVerificationOptions")(options.asInstanceOf[js.Any]).asInstanceOf[/* is sigstore.sigstore/dist/types/sigstore.CAArtifactVerificationOptions */ Boolean]

inline def isVerifiableTransparencyLogEntry(entry: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreRekorMod`.TransparencyLogEntry): /* is sigstore.sigstore/dist/types/sigstore.VerifiableTransparencyLogEntry */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVerifiableTransparencyLogEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[/* is sigstore.sigstore/dist/types/sigstore.VerifiableTransparencyLogEntry */ Boolean]

inline def publicKeyDetailsFromJSON(`object`: Any): typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.PublicKeyDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyDetailsFromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.PublicKeyDetails]

inline def publicKeyDetailsToJSON(`object`: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.PublicKeyDetails): String = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyDetailsToJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]

inline def signingCertificate(bundle: Bundle): js.UndefOr[x509Certificate] = ^.asInstanceOf[js.Dynamic].applyDynamic("signingCertificate")(bundle.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[x509Certificate]]

inline def subjectAlternativeNameTypeFromJSON(`object`: Any): typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.SubjectAlternativeNameType = ^.asInstanceOf[js.Dynamic].applyDynamic("subjectAlternativeNameTypeFromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.SubjectAlternativeNameType]

inline def subjectAlternativeNameTypeToJSON(
  `object`: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.SubjectAlternativeNameType
): String = ^.asInstanceOf[js.Dynamic].applyDynamic("subjectAlternativeNameTypeToJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
