package typings.sixRuntime.Six.plugins.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait runtimeConf extends js.Object {
  var codeKey: String = js.native
  var dataKey: String = js.native
  var msgKey: String = js.native
}

object runtimeConf {
  @scala.inline
  def apply(codeKey: String, dataKey: String, msgKey: String): runtimeConf = {
    val __obj = js.Dynamic.literal(codeKey = codeKey.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], msgKey = msgKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[runtimeConf]
  }
  @scala.inline
  implicit class runtimeConfOps[Self <: runtimeConf] (val x: Self) extends AnyVal {
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
    def setCodeKey(value: String): Self = this.set("codeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataKey(value: String): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsgKey(value: String): Self = this.set("msgKey", value.asInstanceOf[js.Any])
  }
  
}

