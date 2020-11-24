package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_onetimeauth")
@js.native
object cryptoOnetimeauth extends js.Object {
  
  def apply(output: Buffer, input: Buffer, key: Buffer): Unit = js.native
}
