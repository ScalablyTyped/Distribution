package typings.sigstore

import typings.node.NodeJS.ArrayBufferView
import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.KeyLike
import typings.node.cryptoMod.KeyPairKeyObjectResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilCryptoMod {
  
  @JSImport("sigstore/dist/util/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPublicKey(key: String): KeyLike = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[KeyLike]
  inline def createPublicKey(key: Buffer): KeyLike = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[KeyLike]
  
  inline def generateKeyPair(): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")().asInstanceOf[KeyPairKeyObjectResult]
  
  inline def hash(data: BinaryLike): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def randomBytes(count: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(count.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def signBlob(data: ArrayBufferView, privateKey: KeyLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("signBlob")(data.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def verifyBlob(data: Buffer, key: KeyLike, signature: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBlob")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verifyBlob(data: Buffer, key: KeyLike, signature: Buffer, algorithm: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBlob")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
