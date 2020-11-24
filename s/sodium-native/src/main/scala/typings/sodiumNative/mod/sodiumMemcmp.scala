package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "sodium_memcmp")
@js.native
object sodiumMemcmp extends js.Object {
  
  def apply(b1: Buffer, b2: Buffer): Boolean = js.native
}
