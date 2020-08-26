package typings.reactJsonPretty.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Json extends js.Object {
  var data: String = js.native
  var json: String = js.native
  var silent: Boolean = js.native
  var space: Double = js.native
  var themeClassName: String = js.native
}

object Json {
  @scala.inline
  def apply(data: String, json: String, silent: Boolean, space: Double, themeClassName: String): Json = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], themeClassName = themeClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Json]
  }
  @scala.inline
  implicit class JsonOps[Self <: Json] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson(value: String): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpace(value: Double): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def setThemeClassName(value: String): Self = this.set("themeClassName", value.asInstanceOf[js.Any])
  }
  
}

