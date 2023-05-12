package typings.sigstore

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMerkleDigestMod {
  
  @JSImport("sigstore/dist/merkle/digest", "Hasher")
  @js.native
  open class Hasher () extends StObject {
    def this(algorithm: String) = this()
    
    /* private */ var algorithm: Any = js.native
    
    def hashChildren(l: Buffer, r: Buffer): Buffer = js.native
    
    def hashLeaf(leaf: Buffer): Buffer = js.native
    
    def size(): Double = js.native
  }
}
