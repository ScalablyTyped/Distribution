package typings.rollupPluginBuble.mod

import typings.buble.anon.Arrow
import typings.buble.anon.Chrome
import typings.buble.mod.TransformOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends TransformOptions {
  var exclude: js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null] = js.undefined
  // Every files will be parsed by default, but you can specify which files to include or exclude
  var include: js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exclude: js.UndefOr[Null | (js.Array[String | RegExp]) | String | RegExp] = js.undefined,
    file: String = null,
    include: js.UndefOr[Null | (js.Array[String | RegExp]) | String | RegExp] = js.undefined,
    includeContent: js.UndefOr[Boolean] = js.undefined,
    jsx: String = null,
    namedFunctionExpressions: js.UndefOr[Boolean] = js.undefined,
    objectAssign: String | Boolean = null,
    source: String = null,
    target: Chrome = null,
    transforms: Arrow = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclude)) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(include)) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(includeContent)) __obj.updateDynamic("includeContent")(includeContent.get.asInstanceOf[js.Any])
    if (jsx != null) __obj.updateDynamic("jsx")(jsx.asInstanceOf[js.Any])
    if (!js.isUndefined(namedFunctionExpressions)) __obj.updateDynamic("namedFunctionExpressions")(namedFunctionExpressions.get.asInstanceOf[js.Any])
    if (objectAssign != null) __obj.updateDynamic("objectAssign")(objectAssign.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

