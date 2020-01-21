package typings.rollupPluginBuble.mod

import typings.buble.Anon010
import typings.buble.AnonArrow
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
    exclude: (js.Array[String | RegExp]) | String | RegExp = null,
    file: String = null,
    include: (js.Array[String | RegExp]) | String | RegExp = null,
    includeContent: js.UndefOr[Boolean] = js.undefined,
    jsx: String = null,
    namedFunctionExpressions: js.UndefOr[Boolean] = js.undefined,
    objectAssign: String | Boolean = null,
    source: String = null,
    target: Anon010 = null,
    transforms: AnonArrow = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(includeContent)) __obj.updateDynamic("includeContent")(includeContent.asInstanceOf[js.Any])
    if (jsx != null) __obj.updateDynamic("jsx")(jsx.asInstanceOf[js.Any])
    if (!js.isUndefined(namedFunctionExpressions)) __obj.updateDynamic("namedFunctionExpressions")(namedFunctionExpressions.asInstanceOf[js.Any])
    if (objectAssign != null) __obj.updateDynamic("objectAssign")(objectAssign.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

