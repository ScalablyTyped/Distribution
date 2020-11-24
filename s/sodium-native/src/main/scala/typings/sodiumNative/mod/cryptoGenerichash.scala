package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_generichash")
@js.native
object cryptoGenerichash extends js.Object {
  
  def apply(output: Buffer, input: Buffer): Unit = js.native
  def apply(output: Buffer, input: Buffer, key: Buffer): Unit = js.native
}
