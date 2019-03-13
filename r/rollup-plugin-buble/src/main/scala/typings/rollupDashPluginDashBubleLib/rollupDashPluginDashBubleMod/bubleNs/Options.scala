package typings
package rollupDashPluginDashBubleLib.rollupDashPluginDashBubleMod.bubleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends bubleLib.bubleMod.TransformOptions {
  var exclude: js.UndefOr[
    (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp | scala.Null
  ] = js.undefined
  // Every files will be parsed by default, but you can specify which files to include or exclude
  var include: js.UndefOr[
    (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp | scala.Null
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exclude: (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp = null,
    file: java.lang.String = null,
    include: (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp = null,
    includeContent: js.UndefOr[scala.Boolean] = js.undefined,
    jsx: java.lang.String = null,
    namedFunctionExpressions: js.UndefOr[scala.Boolean] = js.undefined,
    objectAssign: java.lang.String | scala.Boolean = null,
    source: java.lang.String = null,
    target: bubleLib.Anon_010 = null,
    transforms: bubleLib.Anon_Arrow = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file)
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(includeContent)) __obj.updateDynamic("includeContent")(includeContent)
    if (jsx != null) __obj.updateDynamic("jsx")(jsx)
    if (!js.isUndefined(namedFunctionExpressions)) __obj.updateDynamic("namedFunctionExpressions")(namedFunctionExpressions)
    if (objectAssign != null) __obj.updateDynamic("objectAssign")(objectAssign.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (target != null) __obj.updateDynamic("target")(target)
    if (transforms != null) __obj.updateDynamic("transforms")(transforms)
    __obj.asInstanceOf[Options]
  }
}

