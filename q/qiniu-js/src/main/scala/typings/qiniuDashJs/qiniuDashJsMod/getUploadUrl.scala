package typings.qiniuDashJs.qiniuDashJsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu-js", "getUploadUrl")
@js.native
object getUploadUrl extends js.Object {
  def apply(config: Partial[Config], token: String): js.Promise[String] = js.native
}

