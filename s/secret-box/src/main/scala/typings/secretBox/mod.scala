package typings.secretBox

import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.BinaryLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("secret-box", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrypt(secret: Buffer, passphrase: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(secret.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def decrypt(secret: Buffer, passphrase: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(secret.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encrypt(message: Buffer, passphrase: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(message.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encrypt(message: Buffer, passphrase: String, opts: EncryptOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(message.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encrypt(message: Buffer, passphrase: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(message.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encrypt(message: Buffer, passphrase: Buffer, opts: EncryptOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(message.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("secret-box", "struct")
  @js.native
  val struct: Any = js.native
  
  trait EncryptOptions extends StObject {
    
    var iv: js.UndefOr[BinaryLike] = js.undefined
    
    var n: js.UndefOr[Double] = js.undefined
    
    var p: js.UndefOr[Double] = js.undefined
    
    var r: js.UndefOr[Double] = js.undefined
    
    var salt: js.UndefOr[Buffer] = js.undefined
  }
  object EncryptOptions {
    
    inline def apply(): EncryptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncryptOptions]
    }
    
    extension [Self <: EncryptOptions](x: Self) {
      
      inline def setIv(value: BinaryLike): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setSalt(value: Buffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    }
  }
}
