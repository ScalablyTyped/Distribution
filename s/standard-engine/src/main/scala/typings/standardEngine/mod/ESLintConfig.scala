package typings.standardEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ESLintConfig extends js.Object {
  /** @default true */
  var cache: js.UndefOr[Boolean] = js.undefined
  /** @default  path.join(HOME_OR_TMP, `.${this.cmd}-v${majorVersion}-cache/` */
  var cacheLocation: js.UndefOr[String] = js.undefined
  var configFile: js.UndefOr[String] = js.undefined
  /** @default [] */
  var envs: js.UndefOr[js.Array[String]] = js.undefined
  /** @default false */
  var fix: js.UndefOr[Boolean] = js.undefined
  /** @default [] */
  var globals: js.UndefOr[js.Array[String]] = js.undefined
  /** @default false */
  var ignore: js.UndefOr[Boolean] = js.undefined
  /** @default [] */
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  /** @default false */
  var useEslintrc: js.UndefOr[Boolean] = js.undefined
}

object ESLintConfig {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    cacheLocation: String = null,
    configFile: String = null,
    envs: js.Array[String] = null,
    fix: js.UndefOr[Boolean] = js.undefined,
    globals: js.Array[String] = null,
    ignore: js.UndefOr[Boolean] = js.undefined,
    plugins: js.Array[String] = null,
    useEslintrc: js.UndefOr[Boolean] = js.undefined
  ): ESLintConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (cacheLocation != null) __obj.updateDynamic("cacheLocation")(cacheLocation.asInstanceOf[js.Any])
    if (configFile != null) __obj.updateDynamic("configFile")(configFile.asInstanceOf[js.Any])
    if (envs != null) __obj.updateDynamic("envs")(envs.asInstanceOf[js.Any])
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix.get.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore.get.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(useEslintrc)) __obj.updateDynamic("useEslintrc")(useEslintrc.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESLintConfig]
  }
}

