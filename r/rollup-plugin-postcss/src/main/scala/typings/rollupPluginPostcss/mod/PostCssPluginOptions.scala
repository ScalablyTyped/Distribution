package typings.rollupPluginPostcss.mod

import typings.cssnano.mod.CssNanoOptions
import typings.rollupPluginPostcss.anon.Ctx
import typings.rollupPluginPostcss.anon.InsertAt
import typings.rollupPluginPostcss.rollupPluginPostcssStrings.`inline`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCssPluginOptions extends js.Object {
  var autoModules: js.UndefOr[Boolean] = js.undefined
  var config: js.UndefOr[Boolean | Ctx] = js.undefined
  var exec: js.UndefOr[Boolean] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var extract: js.UndefOr[Boolean | String] = js.undefined
  var inject: js.UndefOr[Boolean | InsertAt] = js.undefined
  var loaders: js.UndefOr[js.Array[_]] = js.undefined
  var minimize: js.UndefOr[Boolean | CssNanoOptions] = js.undefined
  var modules: js.UndefOr[Boolean | js.Any] = js.undefined
  var name: js.UndefOr[js.Array[_ | js.Array[_]]] = js.undefined
  var namedExports: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | Boolean]] = js.undefined
  var onImport: js.UndefOr[js.Function1[/* id */ js.Any, Unit]] = js.undefined
  var parser: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | String]] = js.undefined
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  var sourceMap: js.UndefOr[Boolean | `inline`] = js.undefined
  var stringifier: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | String]] = js.undefined
  var syntax: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | String]] = js.undefined
}

object PostCssPluginOptions {
  @scala.inline
  def apply(
    autoModules: js.UndefOr[Boolean] = js.undefined,
    config: Boolean | Ctx = null,
    exec: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] = null,
    extract: Boolean | String = null,
    inject: Boolean | InsertAt = null,
    loaders: js.Array[_] = null,
    minimize: Boolean | CssNanoOptions = null,
    modules: Boolean | js.Any = null,
    name: js.Array[_ | js.Array[_]] = null,
    namedExports: /* repeated */ js.Any => Unit | Boolean = null,
    onImport: /* id */ js.Any => Unit = null,
    parser: /* repeated */ js.Any => Unit | String = null,
    plugins: js.Array[_] = null,
    sourceMap: Boolean | `inline` = null,
    stringifier: /* repeated */ js.Any => Unit | String = null,
    syntax: /* repeated */ js.Any => Unit | String = null
  ): PostCssPluginOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoModules)) __obj.updateDynamic("autoModules")(autoModules.get.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(exec)) __obj.updateDynamic("exec")(exec.get.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (extract != null) __obj.updateDynamic("extract")(extract.asInstanceOf[js.Any])
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (loaders != null) __obj.updateDynamic("loaders")(loaders.asInstanceOf[js.Any])
    if (minimize != null) __obj.updateDynamic("minimize")(minimize.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namedExports != null) __obj.updateDynamic("namedExports")(js.Any.fromFunction1(namedExports))
    if (onImport != null) __obj.updateDynamic("onImport")(js.Any.fromFunction1(onImport))
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1(parser))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (stringifier != null) __obj.updateDynamic("stringifier")(js.Any.fromFunction1(stringifier))
    if (syntax != null) __obj.updateDynamic("syntax")(js.Any.fromFunction1(syntax))
    __obj.asInstanceOf[PostCssPluginOptions]
  }
}

