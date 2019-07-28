package typings.prettier.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveConfigOptions extends js.Object {
  /**
    * Pass directly the path of the config file if you don't wish to search for it.
    */
  var config: js.UndefOr[String] = js.undefined
  /**
    * If set to `true` and an `.editorconfig` file is in your project,
    * Prettier will parse it and convert its properties to the corresponding prettier configuration.
    * This configuration will be overridden by `.prettierrc`, etc. Currently,
    * the following EditorConfig properties are supported:
    * - indent_style
    * - indent_size/tab_width
    * - max_line_length
    */
  var editorconfig: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to `false`, all caching will be bypassed.
    */
  var useCache: js.UndefOr[Boolean] = js.undefined
}

object ResolveConfigOptions {
  @scala.inline
  def apply(
    config: String = null,
    editorconfig: js.UndefOr[Boolean] = js.undefined,
    useCache: js.UndefOr[Boolean] = js.undefined
  ): ResolveConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(editorconfig)) __obj.updateDynamic("editorconfig")(editorconfig)
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache)
    __obj.asInstanceOf[ResolveConfigOptions]
  }
}

