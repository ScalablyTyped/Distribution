package typings.qiniuJs.mod

import typings.qiniuJs.anon.Dist
import typings.qiniuJs.anon.PartialCompressOptions
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu-js", "compressImage")
@js.native
object compressImage extends js.Object {
  def apply(file: Blob, options: PartialCompressOptions): js.Promise[Dist] = js.native
}

