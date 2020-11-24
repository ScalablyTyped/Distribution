package typings.sshpk.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "Signature")
@js.native
class Signature protected () extends js.Object {
  def this(opts: js.Any) = this()
  
  def toBuffer(format: String): Buffer = js.native
  
  def toString(format: String): String = js.native
}
/* static members */
@JSImport("sshpk", "Signature")
@js.native
object Signature extends js.Object {
  
  def isSignature(obj: String, ver: String): Boolean = js.native
  def isSignature(obj: Buffer, ver: String): Boolean = js.native
  
  def parse(data: String, `type`: String, format: String): Signature = js.native
  def parse(data: Buffer, `type`: String, format: String): Signature = js.native
}
