package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.sigstore.distMerkleDigestMod.Hasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMerkleVerifyMod {
  
  @JSImport("sigstore/dist/merkle/verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def verifyInclusion(
    hasher: Hasher,
    index: js.BigInt,
    size: js.BigInt,
    leafHash: Buffer,
    proof: js.Array[Buffer],
    root: Buffer
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyInclusion")(hasher.asInstanceOf[js.Any], index.asInstanceOf[js.Any], size.asInstanceOf[js.Any], leafHash.asInstanceOf[js.Any], proof.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
