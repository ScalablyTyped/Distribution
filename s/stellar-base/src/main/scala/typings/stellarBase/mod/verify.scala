package typings.stellarBase.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "verify")
@js.native
object verify extends js.Object {
  
  def apply(data: Buffer, signature: Buffer, rawPublicKey: Buffer): Boolean = js.native
}
