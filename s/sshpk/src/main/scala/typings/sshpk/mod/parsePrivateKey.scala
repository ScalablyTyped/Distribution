package typings.sshpk.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "parsePrivateKey")
@js.native
object parsePrivateKey extends js.Object {
  
  def apply(data: String, format: String): PrivateKey = js.native
  def apply(data: String, format: String, options: js.Any): PrivateKey = js.native
  def apply(data: Buffer, format: String): PrivateKey = js.native
  def apply(data: Buffer, format: String, options: js.Any): PrivateKey = js.native
}
