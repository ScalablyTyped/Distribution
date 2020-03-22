package typings.standardEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * current working directory
    * @default process.cwd()
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * custom eslint environment
    * @default []
    */
  var env: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * custom eslint environment
    * @default []
    */
  var envs: js.UndefOr[String | js.Array[String]] = js.undefined
  /** path of the file containing the text being linted */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * automatically fix problems
    * @default false
    */
  var fix: js.UndefOr[Boolean] = js.undefined
  /**
    * custom global variables to declare
    * @default [];
    */
  var global: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * custom global variables to declare
    * @default [];
    */
  var globals: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * file globs to ignore
    * @default []
    */
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  /** custom js parser (e.g. babel-eslint) */
  var parser: js.UndefOr[String] = js.undefined
  /**
    * custom eslint plugins
    * @default []
    */
  var plugin: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * custom eslint plugins
    * @default []
    */
  var plugins: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cwd: String = null,
    env: String | js.Array[String] = null,
    envs: String | js.Array[String] = null,
    filename: String = null,
    fix: js.UndefOr[Boolean] = js.undefined,
    global: String | js.Array[String] = null,
    globals: String | js.Array[String] = null,
    ignore: js.Array[String] = null,
    parser: String = null,
    plugin: String | js.Array[String] = null,
    plugins: String | js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (envs != null) __obj.updateDynamic("envs")(envs.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

