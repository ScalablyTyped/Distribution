package typings.raygun4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracekitStackTrace extends js.Object {
  var message: String = js.native
  var mode: String = js.native
  var name: String = js.native
  var stack: js.Array[TracekitStack] = js.native
  var url: String = js.native
  var useragent: String = js.native
}

object TracekitStackTrace {
  @scala.inline
  def apply(
    message: String,
    mode: String,
    name: String,
    stack: js.Array[TracekitStack],
    url: String,
    useragent: String
  ): TracekitStackTrace = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], useragent = useragent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracekitStackTrace]
  }
  @scala.inline
  implicit class TracekitStackTraceOps[Self <: TracekitStackTrace] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackVarargs(value: TracekitStack*): Self = this.set("stack", js.Array(value :_*))
    @scala.inline
    def setStack(value: js.Array[TracekitStack]): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseragent(value: String): Self = this.set("useragent", value.asInstanceOf[js.Any])
  }
  
}

