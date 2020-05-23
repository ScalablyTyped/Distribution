package typings.qiniuJs.mod

import typings.qiniuJs.anon.PartialConfig
import typings.qiniuJs.anon.PartialExtra
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu-js", "upload")
@js.native
object upload extends js.Object {
  def apply(
    file: Blob,
    key: js.UndefOr[Null | String],
    token: String,
    putExtra: PartialExtra,
    config: PartialConfig
  ): Observable = js.native
}

