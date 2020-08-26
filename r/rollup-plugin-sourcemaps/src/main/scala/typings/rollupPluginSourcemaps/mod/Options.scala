package typings.rollupPluginSourcemaps.mod

import typings.node.Buffer
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var exclude: js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null] = js.native
  var include: js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null] = js.native
  var readFile: js.UndefOr[ReadFileFunction] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setExcludeVarargs(value: (String | RegExp)*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: (js.Array[String | RegExp]) | String | RegExp): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExcludeNull: Self = this.set("exclude", null)
    @scala.inline
    def setIncludeVarargs(value: (String | RegExp)*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: (js.Array[String | RegExp]) | String | RegExp): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setIncludeNull: Self = this.set("include", null)
    @scala.inline
    def setReadFile(
      value: (/* file */ String | Buffer | Double, /* encoding */ String, /* callback */ ReadFileCallback) => Unit
    ): Self = this.set("readFile", js.Any.fromFunction3(value))
    @scala.inline
    def deleteReadFile: Self = this.set("readFile", js.undefined)
  }
  
}

