package typings.raygun4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracekitStack extends js.Object {
  var column: Double = js.native
  var context: js.Any = js.native
  var func: String = js.native
  var line: Double = js.native
  var url: String = js.native
}

object TracekitStack {
  @scala.inline
  def apply(column: Double, context: js.Any, func: String, line: Double, url: String): TracekitStack = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracekitStack]
  }
  @scala.inline
  implicit class TracekitStackOps[Self <: TracekitStack] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunc(value: String): Self = this.set("func", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

