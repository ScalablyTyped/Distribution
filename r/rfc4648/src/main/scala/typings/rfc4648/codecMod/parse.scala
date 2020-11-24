package typings.rfc4648.codecMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rfc4648/lib/src/codec", "parse")
@js.native
object parse extends js.Object {
  
  def apply(string: String, encoding: Encoding): Uint8Array = js.native
  def apply(string: String, encoding: Encoding, opts: ParseOptions): Uint8Array = js.native
}
