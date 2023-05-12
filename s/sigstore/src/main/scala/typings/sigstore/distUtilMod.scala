package typings.sigstore

import typings.node.NodeJS.ArrayBufferView
import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.KeyLike
import typings.node.cryptoMod.KeyPairKeyObjectResult
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilMod {
  
  object appdata {
    
    @JSImport("sigstore/dist/util", "appdata")
    @js.native
    val ^ : js.Any = js.native
    
    inline def appDataPath(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("appDataPath")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object crypto {
    
    @JSImport("sigstore/dist/util", "crypto")
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
  
  object dsse {
    
    @JSImport("sigstore/dist/util", "dsse")
    @js.native
    val ^ : js.Any = js.native
    
    inline def preAuthEncoding(payloadType: String, payload: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("preAuthEncoding")(payloadType.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  }
  
  object encoding {
    
    @JSImport("sigstore/dist/util", "encoding")
    @js.native
    val ^ : js.Any = js.native
    
    inline def base64Decode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Decode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def base64Encode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def base64URLDecode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64URLDecode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def base64URLEncode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64URLEncode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def base64URLEscape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64URLEscape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def base64URLUnescape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64URLUnescape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object json {
    
    @JSImport("sigstore/dist/util", "json")
    @js.native
    val ^ : js.Any = js.native
    
    inline def canonicalize(`object`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalize")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object oidc {
    
    @JSImport("sigstore/dist/util", "oidc")
    @js.native
    val ^ : js.Any = js.native
    
    inline def extractJWTSubject(jwt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractJWTSubject")(jwt.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object pem {
    
    @JSImport("sigstore/dist/util", "pem")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromDER(certificate: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDER")(certificate.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromDER(certificate: Buffer, `type`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDER")(certificate.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toDER(certificate: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toDER")(certificate.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
  
  object promise {
    
    @JSImport("sigstore/dist/util", "promise")
    @js.native
    val ^ : js.Any = js.native
    
    inline def promiseAny[T](values: js.Iterable[PromiseLike[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseAny")(values.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  }
  
  object ua {
    
    @JSImport("sigstore/dist/util", "ua")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getUserAgent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgent")().asInstanceOf[String]
  }
}
