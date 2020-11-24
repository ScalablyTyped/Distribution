package typings.qiniuJs.mod

import typings.qiniuJs.anon.PartialConfig
import typings.qiniuJs.anon.PartialExtra
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("qiniu-js", "upload")
@js.native
object upload extends js.Object {
  
  def apply(
    file: Blob,
    key: js.UndefOr[scala.Nothing],
    token: String,
    putExtra: PartialExtra,
    config: PartialConfig
  ): Observable = js.native
  def apply(file: Blob, key: String, token: String, putExtra: PartialExtra, config: PartialConfig): Observable = js.native
  def apply(file: Blob, key: Null, token: String, putExtra: PartialExtra, config: PartialConfig): Observable = js.native
}
