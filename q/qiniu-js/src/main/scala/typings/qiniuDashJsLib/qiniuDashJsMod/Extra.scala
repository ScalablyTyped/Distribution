package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extra extends js.Object {
  var fname: java.lang.String
  	// 用来放置自定义变量
  var mimeType: js.Array[java.lang.String] | scala.Null
  	// 文件原文件名
  var params: js.Any
}

object Extra {
  @scala.inline
  def apply(fname: java.lang.String, params: js.Any, mimeType: js.Array[java.lang.String] = null): Extra = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fname")(fname)
    __obj.updateDynamic("params")(params)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    __obj.asInstanceOf[Extra]
  }
}

