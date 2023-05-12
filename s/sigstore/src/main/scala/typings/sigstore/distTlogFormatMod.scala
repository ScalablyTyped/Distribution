package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.sigstore.distTlogTypesMod.HashedRekordKind
import typings.sigstore.distTlogTypesMod.IntotoKind
import typings.sigstore.distTypesSignatureMod.SignatureMaterial
import typings.sigstoreProtobufSpecs.`dist@GeneratedEnvelopeMod`.Envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTlogFormatMod {
  
  @JSImport("sigstore/dist/tlog/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toProposedHashedRekordEntry(digest: Buffer, signature: SignatureMaterial): HashedRekordKind = (^.asInstanceOf[js.Dynamic].applyDynamic("toProposedHashedRekordEntry")(digest.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[HashedRekordKind]
  
  inline def toProposedIntotoEntry(envelope: Envelope, signature: SignatureMaterial): IntotoKind = (^.asInstanceOf[js.Dynamic].applyDynamic("toProposedIntotoEntry")(envelope.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[IntotoKind]
  inline def toProposedIntotoEntry(envelope: Envelope, signature: SignatureMaterial, apiVersion: String): IntotoKind = (^.asInstanceOf[js.Dynamic].applyDynamic("toProposedIntotoEntry")(envelope.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], apiVersion.asInstanceOf[js.Any])).asInstanceOf[IntotoKind]
}
