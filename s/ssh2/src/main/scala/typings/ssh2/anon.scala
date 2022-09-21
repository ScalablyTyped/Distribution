package typings.ssh2

import typings.node.bufferMod.global.Buffer
import typings.ssh2.mod.CipherAlgorithm
import typings.ssh2.mod.CompressionAlgorithm
import typings.ssh2.mod.MacAlgorithm
import typings.ssh2.mod.ParsedKey
import typings.ssh2.ssh2Strings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cipher extends StObject {
    
    var cipher: CipherAlgorithm
    
    var compress: CompressionAlgorithm
    
    var lang: String
    
    var mac: MacAlgorithm | _empty
  }
  object Cipher {
    
    inline def apply(cipher: CipherAlgorithm, compress: CompressionAlgorithm, lang: String, mac: MacAlgorithm | _empty): Cipher = {
      val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cipher]
    }
    
    extension [Self <: Cipher](x: Self) {
      
      inline def setCipher(value: CipherAlgorithm): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      inline def setCompress(value: CompressionAlgorithm): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setMac(value: MacAlgorithm | _empty): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    }
  }
  
  trait Comment extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var pubKey: ParsedKey | Buffer | String
  }
  object Comment {
    
    inline def apply(pubKey: ParsedKey | Buffer | String): Comment = {
      val __obj = js.Dynamic.literal(pubKey = pubKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setPubKey(value: ParsedKey | Buffer | String): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
    }
  }
}
