package typings.sshKeyDecrypt

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.sshKeyDecrypt.sshKeyDecryptStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssh-key-decrypt", JSImport.Namespace)
  @js.native
  def apply(data: String, passphrase: String): Buffer = js.native
  @JSImport("ssh-key-decrypt", JSImport.Namespace)
  @js.native
  def apply(data: String, passphrase: String, outEnc: BufferEncoding): String = js.native
  @JSImport("ssh-key-decrypt", JSImport.Namespace)
  @js.native
  def apply(data: String, passphrase: String, outEnc: buffer): Buffer = js.native
  @JSImport("ssh-key-decrypt", JSImport.Namespace)
  @js.native
  def apply(data: Buffer, passphrase: String): Buffer = js.native
  @JSImport("ssh-key-decrypt", JSImport.Namespace)
  @js.native
  def apply(data: Buffer, passphrase: String, outEnc: BufferEncoding): String = js.native
  @JSImport("ssh-key-decrypt", JSImport.Namespace)
  @js.native
  def apply(data: Buffer, passphrase: String, outEnc: buffer): Buffer = js.native
}
