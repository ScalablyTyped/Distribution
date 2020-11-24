package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "sodium_unpad")
@js.native
object sodiumUnpad extends js.Object {
  
  def apply(buf: Buffer, paddedLength: Double, blocksize: Double): Double = js.native
}
