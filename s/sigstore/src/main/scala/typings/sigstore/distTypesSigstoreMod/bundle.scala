package typings.sigstore.distTypesSigstoreMod

import typings.node.bufferMod.global.Buffer
import typings.sigstore.distTlogTypesMod.Entry
import typings.sigstore.distTypesSignatureMod.SignatureMaterial
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreBundleMod`.Bundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bundle {
  
  @JSImport("sigstore/dist/types/sigstore", "bundle")
  @js.native
  val ^ : js.Any = js.native
  
  inline def toDSSEBundle(
    envelope: typings.sigstoreProtobufSpecs.`dist@GeneratedEnvelopeMod`.Envelope,
    signature: SignatureMaterial,
    rekorEntry: Entry
  ): Bundle = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSSEBundle")(envelope.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], rekorEntry.asInstanceOf[js.Any])).asInstanceOf[Bundle]
  
  inline def toMessageSignatureBundle(digest: Buffer, signature: SignatureMaterial, rekorEntry: Entry): Bundle = (^.asInstanceOf[js.Dynamic].applyDynamic("toMessageSignatureBundle")(digest.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], rekorEntry.asInstanceOf[js.Any])).asInstanceOf[Bundle]
}
