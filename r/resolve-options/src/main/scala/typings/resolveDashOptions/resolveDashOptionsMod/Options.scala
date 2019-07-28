package typings.resolveDashOptions.resolveDashOptionsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowEmpty: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.undefined
  var base: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, String])] = js.undefined
  var buffer: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.undefined
  var cwd: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, String])] = js.undefined
  var deep: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.undefined
  var dirMode: js.UndefOr[String | Double | (js.Function1[/* repeated */ js.Any, String | Double])] = js.undefined
  var mode: js.UndefOr[String | Double | (js.Function1[/* repeated */ js.Any, String | Double])] = js.undefined
  var overwrite: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.undefined
  var passthrough: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.undefined
  var read: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.undefined
  var since: js.UndefOr[Date | Double | (js.Function1[/* repeated */ js.Any, Date | Double])] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowEmpty: Boolean | (js.Function1[/* repeated */ js.Any, Boolean]) = null,
    base: String | (js.Function1[/* repeated */ js.Any, String]) = null,
    buffer: Boolean | (js.Function1[/* repeated */ js.Any, Boolean]) = null,
    cwd: String | (js.Function1[/* repeated */ js.Any, String]) = null,
    deep: Boolean | (js.Function1[/* repeated */ js.Any, Boolean]) = null,
    dirMode: String | Double | (js.Function1[/* repeated */ js.Any, String | Double]) = null,
    mode: String | Double | (js.Function1[/* repeated */ js.Any, String | Double]) = null,
    overwrite: Boolean | (js.Function1[/* repeated */ js.Any, Boolean]) = null,
    passthrough: Boolean | (js.Function1[/* repeated */ js.Any, Boolean]) = null,
    read: Boolean | (js.Function1[/* repeated */ js.Any, Boolean]) = null,
    since: Date | Double | (js.Function1[/* repeated */ js.Any, Date | Double]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (allowEmpty != null) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (deep != null) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (dirMode != null) __obj.updateDynamic("dirMode")(dirMode.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (overwrite != null) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (passthrough != null) __obj.updateDynamic("passthrough")(passthrough.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

