package typings
package resolveDashOptionsLib.resolveDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowEmpty: js.UndefOr[scala.Boolean | (js.Function1[/* repeated */ js.Any, scala.Boolean])] = js.undefined
  var base: js.UndefOr[java.lang.String | (js.Function1[/* repeated */ js.Any, java.lang.String])] = js.undefined
  var buffer: js.UndefOr[scala.Boolean | (js.Function1[/* repeated */ js.Any, scala.Boolean])] = js.undefined
  var cwd: js.UndefOr[java.lang.String | (js.Function1[/* repeated */ js.Any, java.lang.String])] = js.undefined
  var deep: js.UndefOr[scala.Boolean | (js.Function1[/* repeated */ js.Any, scala.Boolean])] = js.undefined
  var dirMode: js.UndefOr[
    java.lang.String | scala.Double | (js.Function1[/* repeated */ js.Any, java.lang.String | scala.Double])
  ] = js.undefined
  var mode: js.UndefOr[
    java.lang.String | scala.Double | (js.Function1[/* repeated */ js.Any, java.lang.String | scala.Double])
  ] = js.undefined
  var overwrite: js.UndefOr[scala.Boolean | (js.Function1[/* repeated */ js.Any, scala.Boolean])] = js.undefined
  var passthrough: js.UndefOr[scala.Boolean | (js.Function1[/* repeated */ js.Any, scala.Boolean])] = js.undefined
  var read: js.UndefOr[scala.Boolean | (js.Function1[/* repeated */ js.Any, scala.Boolean])] = js.undefined
  var since: js.UndefOr[
    stdLib.Date | scala.Double | (js.Function1[/* repeated */ js.Any, stdLib.Date | scala.Double])
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowEmpty: scala.Boolean | (js.Function1[/* repeated */ js.Any, scala.Boolean]) = null,
    base: java.lang.String | (js.Function1[/* repeated */ js.Any, java.lang.String]) = null,
    buffer: scala.Boolean | (js.Function1[/* repeated */ js.Any, scala.Boolean]) = null,
    cwd: java.lang.String | (js.Function1[/* repeated */ js.Any, java.lang.String]) = null,
    deep: scala.Boolean | (js.Function1[/* repeated */ js.Any, scala.Boolean]) = null,
    dirMode: java.lang.String | scala.Double | (js.Function1[/* repeated */ js.Any, java.lang.String | scala.Double]) = null,
    mode: java.lang.String | scala.Double | (js.Function1[/* repeated */ js.Any, java.lang.String | scala.Double]) = null,
    overwrite: scala.Boolean | (js.Function1[/* repeated */ js.Any, scala.Boolean]) = null,
    passthrough: scala.Boolean | (js.Function1[/* repeated */ js.Any, scala.Boolean]) = null,
    read: scala.Boolean | (js.Function1[/* repeated */ js.Any, scala.Boolean]) = null,
    since: stdLib.Date | scala.Double | (js.Function1[/* repeated */ js.Any, stdLib.Date | scala.Double]) = null
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

