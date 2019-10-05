package typings.qiniuDashJs.qiniuDashJsMod

import typings.std.Blob
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu-js", "upload")
@js.native
object upload extends js.Object {
  def apply(
    file: Blob,
    key: js.UndefOr[scala.Nothing],
    token: String,
    putExtra: Partial[Extra],
    config: Partial[Config]
  ): Observable = js.native
  def apply(file: Blob, key: String, token: String, putExtra: Partial[Extra], config: Partial[Config]): Observable = js.native
  def apply(file: Blob, key: Null, token: String, putExtra: Partial[Extra], config: Partial[Config]): Observable = js.native
}

