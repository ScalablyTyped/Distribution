package typings.sigstore

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMerkleMod {
  
  @JSImport("sigstore/dist/merkle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sigstore/dist/merkle", "Hasher")
  @js.native
  open class Hasher ()
    extends typings.sigstore.distMerkleDigestMod.Hasher {
    def this(algorithm: String) = this()
  }
  
  inline def verifyInclusion(
    hasher: typings.sigstore.distMerkleDigestMod.Hasher,
    index: js.BigInt,
    size: js.BigInt,
    leafHash: Buffer,
    proof: js.Array[Buffer],
    root: Buffer
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyInclusion")(hasher.asInstanceOf[js.Any], index.asInstanceOf[js.Any], size.asInstanceOf[js.Any], leafHash.asInstanceOf[js.Any], proof.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
