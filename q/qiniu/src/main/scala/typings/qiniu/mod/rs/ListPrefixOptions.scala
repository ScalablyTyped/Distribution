package typings.qiniu.mod.rs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPrefixOptions extends js.Object {
  /**
    * 指定目录分隔符
    */
  var delimiter: js.UndefOr[String] = js.undefined
  /**
    * 每次返回的最大列举文件数量
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * 上一次列举返回的位置标记
    */
  var marker: js.UndefOr[js.Any] = js.undefined
  /**
    * 列举的文件前缀
    */
  var prefix: js.UndefOr[String] = js.undefined
}

object ListPrefixOptions {
  @scala.inline
  def apply(delimiter: String = null, limit: Int | Double = null, marker: js.Any = null, prefix: String = null): ListPrefixOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPrefixOptions]
  }
}

