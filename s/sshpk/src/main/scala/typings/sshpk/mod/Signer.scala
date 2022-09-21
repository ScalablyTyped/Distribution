package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.BinaryToTextEncoding
import typings.node.cryptoMod.Encoding
import typings.node.cryptoMod.KeyLike
import typings.node.cryptoMod.SignKeyObjectInput
import typings.node.cryptoMod.SignPrivateKeyInput
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "Signer")
@js.native
/* private */ open class Signer () extends Writable {
  
  def sign(): Signature = js.native
  def sign(private_key: KeyLike): Buffer = js.native
  def sign(private_key: KeyLike, output_format: BinaryToTextEncoding): String = js.native
  def sign(private_key: SignKeyObjectInput): Buffer = js.native
  def sign(private_key: SignKeyObjectInput, output_format: BinaryToTextEncoding): String = js.native
  def sign(private_key: SignPrivateKeyInput): Buffer = js.native
  def sign(private_key: SignPrivateKeyInput, output_format: BinaryToTextEncoding): String = js.native
  
  def update(data: String, input_encoding: Encoding): this.type = js.native
  def update(data: BinaryLike): this.type = js.native
}
