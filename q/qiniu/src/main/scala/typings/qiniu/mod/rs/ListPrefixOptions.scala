package typings.qiniu.mod.rs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPrefixOptions extends js.Object {
  /**
    * 指定目录分隔符
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * 每次返回的最大列举文件数量
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * 上一次列举返回的位置标记
    */
  var marker: js.UndefOr[js.Any] = js.native
  /**
    * 列举的文件前缀
    */
  var prefix: js.UndefOr[String] = js.native
}

object ListPrefixOptions {
  @scala.inline
  def apply(): ListPrefixOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPrefixOptions]
  }
  @scala.inline
  implicit class ListPrefixOptionsOps[Self <: ListPrefixOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMarker(value: js.Any): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

