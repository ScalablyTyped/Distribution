package typings.resolveOptions.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowEmpty: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
  var base: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, String])] = js.native
  var buffer: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
  var cwd: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, String])] = js.native
  var deep: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
  var dirMode: js.UndefOr[String | Double | (js.Function1[/* repeated */ js.Any, String | Double])] = js.native
  var mode: js.UndefOr[String | Double | (js.Function1[/* repeated */ js.Any, String | Double])] = js.native
  var overwrite: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
  var passthrough: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
  var read: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
  var since: js.UndefOr[Date | Double | (js.Function1[/* repeated */ js.Any, Date | Double])] = js.native
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
    def setAllowEmptyFunction1(value: /* repeated */ js.Any => Boolean): Self = this.set("allowEmpty", js.Any.fromFunction1(value))
    @scala.inline
    def setAllowEmpty(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    @scala.inline
    def setBaseFunction1(value: /* repeated */ js.Any => String): Self = this.set("base", js.Any.fromFunction1(value))
    @scala.inline
    def setBase(value: String | (js.Function1[/* repeated */ js.Any, String])): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setBufferFunction1(value: /* repeated */ js.Any => Boolean): Self = this.set("buffer", js.Any.fromFunction1(value))
    @scala.inline
    def setBuffer(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setCwdFunction1(value: /* repeated */ js.Any => String): Self = this.set("cwd", js.Any.fromFunction1(value))
    @scala.inline
    def setCwd(value: String | (js.Function1[/* repeated */ js.Any, String])): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setDeepFunction1(value: /* repeated */ js.Any => Boolean): Self = this.set("deep", js.Any.fromFunction1(value))
    @scala.inline
    def setDeep(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = this.set("deep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    @scala.inline
    def setDirModeFunction1(value: /* repeated */ js.Any => String | Double): Self = this.set("dirMode", js.Any.fromFunction1(value))
    @scala.inline
    def setDirMode(value: String | Double | (js.Function1[/* repeated */ js.Any, String | Double])): Self = this.set("dirMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirMode: Self = this.set("dirMode", js.undefined)
    @scala.inline
    def setModeFunction1(value: /* repeated */ js.Any => String | Double): Self = this.set("mode", js.Any.fromFunction1(value))
    @scala.inline
    def setMode(value: String | Double | (js.Function1[/* repeated */ js.Any, String | Double])): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOverwriteFunction1(value: /* repeated */ js.Any => Boolean): Self = this.set("overwrite", js.Any.fromFunction1(value))
    @scala.inline
    def setOverwrite(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    @scala.inline
    def setPassthroughFunction1(value: /* repeated */ js.Any => Boolean): Self = this.set("passthrough", js.Any.fromFunction1(value))
    @scala.inline
    def setPassthrough(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = this.set("passthrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassthrough: Self = this.set("passthrough", js.undefined)
    @scala.inline
    def setReadFunction1(value: /* repeated */ js.Any => Boolean): Self = this.set("read", js.Any.fromFunction1(value))
    @scala.inline
    def setRead(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setSinceFunction1(value: /* repeated */ js.Any => Date | Double): Self = this.set("since", js.Any.fromFunction1(value))
    @scala.inline
    def setSince(value: Date | Double | (js.Function1[/* repeated */ js.Any, Date | Double])): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
  }
  
}

