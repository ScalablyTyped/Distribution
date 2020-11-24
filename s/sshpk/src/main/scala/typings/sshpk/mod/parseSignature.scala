package typings.sshpk.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "parseSignature")
@js.native
object parseSignature extends js.Object {
  
  def apply(data: String, `type`: String, format: String): Signature = js.native
  def apply(data: Buffer, `type`: String, format: String): Signature = js.native
}
