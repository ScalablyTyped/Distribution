package typings.qiniu.qiniuMod.rs

import typings.qiniu.qiniuMod.auth.digest.Mac
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "rs.PutPolicy")
@js.native
class PutPolicy () extends js.Object {
  def this(options: PutPolicyOptions) = this()
  def getFlags(): js.Any = js.native
  def uploadToken(): String = js.native
  def uploadToken(mac: Mac): String = js.native
}

