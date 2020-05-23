package typings.rollupPluginSourcemaps.mod

import typings.node.Buffer
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var exclude: js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null] = js.undefined
  var include: js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null] = js.undefined
  var readFile: js.UndefOr[ReadFileFunction] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exclude: js.UndefOr[Null | (js.Array[String | RegExp]) | String | RegExp] = js.undefined,
    include: js.UndefOr[Null | (js.Array[String | RegExp]) | String | RegExp] = js.undefined,
    readFile: (/* file */ String | Buffer | Double, /* encoding */ String, /* callback */ ReadFileCallback) => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclude)) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(include)) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (readFile != null) __obj.updateDynamic("readFile")(js.Any.fromFunction3(readFile))
    __obj.asInstanceOf[Options]
  }
}

