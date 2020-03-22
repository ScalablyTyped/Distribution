package typings.standardEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined standard-engine.standard-engine.PickWithSomeRequired<standard-engine.standard-engine.Options & {  eslintConfig  :standard-engine.standard-engine.ESLintConfig}, 'ignore' | 'cwd' | 'fix' | 'eslintConfig'> */
trait ParseOptions extends js.Object {
  var cwd: String
  var env: js.UndefOr[String | js.Array[String]] = js.undefined
  var envs: js.UndefOr[String | js.Array[String]] = js.undefined
  var eslintConfig: ESLintConfig
  var filename: js.UndefOr[String] = js.undefined
  var fix: Boolean
  var global: js.UndefOr[String | js.Array[String]] = js.undefined
  var globals: js.UndefOr[String | js.Array[String]] = js.undefined
  var ignore: js.Array[String]
  var parser: js.UndefOr[String] = js.undefined
  var plugin: js.UndefOr[String | js.Array[String]] = js.undefined
  var plugins: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    cwd: String,
    eslintConfig: ESLintConfig,
    fix: Boolean,
    ignore: js.Array[String],
    env: String | js.Array[String] = null,
    envs: String | js.Array[String] = null,
    filename: String = null,
    global: String | js.Array[String] = null,
    globals: String | js.Array[String] = null,
    parser: String = null,
    plugin: String | js.Array[String] = null,
    plugins: String | js.Array[String] = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], eslintConfig = eslintConfig.asInstanceOf[js.Any], fix = fix.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (envs != null) __obj.updateDynamic("envs")(envs.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

