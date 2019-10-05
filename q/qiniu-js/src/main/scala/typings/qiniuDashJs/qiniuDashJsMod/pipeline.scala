package typings.qiniuDashJs.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu-js", "pipeline")
@js.native
object pipeline extends js.Object {
  def apply(
    fos: js.Array[
      WaterMarkFopOptions1 | WaterMarkFopOptions2 | ImageView2FopOptions | ImageMogr2FopOptions
    ],
    key: String,
    domain: String
  ): String = js.native
}

