package typings.sshKeyDecrypt

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.sshKeyDecrypt.sshKeyDecryptStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(data: String, passphrase: String): Buffer = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def apply(data: String, passphrase: String, outEnc: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], outEnc.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(data: String, passphrase: String, outEnc: buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], outEnc.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def apply(data: Buffer, passphrase: String): Buffer = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def apply(data: Buffer, passphrase: String, outEnc: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], outEnc.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(data: Buffer, passphrase: String, outEnc: buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], outEnc.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("ssh-key-decrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
