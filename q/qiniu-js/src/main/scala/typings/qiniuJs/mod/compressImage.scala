package typings.qiniuJs.mod

import typings.qiniuJs.AnonDist
import typings.std.Blob
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu-js", "compressImage")
@js.native
object compressImage extends js.Object {
  def apply(file: Blob, options: Partial[CompressOptions]): js.Promise[AnonDist] = js.native
}

