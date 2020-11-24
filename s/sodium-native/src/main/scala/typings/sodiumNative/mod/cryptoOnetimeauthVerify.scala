package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_onetimeauth_verify")
@js.native
object cryptoOnetimeauthVerify extends js.Object {
  
  def apply(output: Buffer, input: Buffer, key: Buffer): Boolean = js.native
}
