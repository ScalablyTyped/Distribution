package typings.qiniuJs.mod

import typings.qiniuJs.AnonDist
import typings.qiniuJs.PartialCompressOptions
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu-js", "compressImage")
@js.native
object compressImage extends js.Object {
  def apply(file: Blob, options: PartialCompressOptions): js.Promise[AnonDist] = js.native
}

