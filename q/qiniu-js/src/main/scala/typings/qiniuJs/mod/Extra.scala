package typings.qiniuJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extra extends js.Object {
  var fname: String
      // 用来放置自定义变量
  var mimeType: js.Array[String] | Null
      // 文件原文件名
  var params: js.Any
}

object Extra {
  @scala.inline
  def apply(fname: String, params: js.Any, mimeType: js.Array[String] = null): Extra = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extra]
  }
}

