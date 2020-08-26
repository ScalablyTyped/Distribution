package typings.reactJsonPretty.anon

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: Requireable[_] = js.native
  var json: Requireable[_] = js.native
  var onJSONPrettyError: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var replacer: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var silent: Requireable[Boolean] = js.native
  var space: Requireable[String | Double] = js.native
  var theme: Requireable[js.Object] = js.native
  var themeClassName: Requireable[String] = js.native
}

object Data {
  @scala.inline
  def apply(
    data: Requireable[_],
    json: Requireable[_],
    onJSONPrettyError: Requireable[js.Function1[/* repeated */ _, _]],
    replacer: Requireable[js.Function1[/* repeated */ _, _]],
    silent: Requireable[Boolean],
    space: Requireable[String | Double],
    theme: Requireable[js.Object],
    themeClassName: Requireable[String]
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], onJSONPrettyError = onJSONPrettyError.asInstanceOf[js.Any], replacer = replacer.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], themeClassName = themeClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setData(value: Requireable[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson(value: Requireable[_]): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnJSONPrettyError(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onJSONPrettyError", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacer(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("replacer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Requireable[Boolean]): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpace(value: Requireable[String | Double]): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: Requireable[js.Object]): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setThemeClassName(value: Requireable[String]): Self = this.set("themeClassName", value.asInstanceOf[js.Any])
  }
  
}

