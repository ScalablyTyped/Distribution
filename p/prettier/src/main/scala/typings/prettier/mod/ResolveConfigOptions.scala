package typings.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveConfigOptions extends js.Object {
  /**
    * Pass directly the path of the config file if you don't wish to search for it.
    */
  var config: js.UndefOr[String] = js.native
  /**
    * If set to `true` and an `.editorconfig` file is in your project,
    * Prettier will parse it and convert its properties to the corresponding prettier configuration.
    * This configuration will be overridden by `.prettierrc`, etc. Currently,
    * the following EditorConfig properties are supported:
    * - indent_style
    * - indent_size/tab_width
    * - max_line_length
    */
  var editorconfig: js.UndefOr[Boolean] = js.native
  /**
    * If set to `false`, all caching will be bypassed.
    */
  var useCache: js.UndefOr[Boolean] = js.native
}

object ResolveConfigOptions {
  @scala.inline
  def apply(): ResolveConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveConfigOptions]
  }
  @scala.inline
  implicit class ResolveConfigOptionsOps[Self <: ResolveConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setEditorconfig(value: Boolean): Self = this.set("editorconfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorconfig: Self = this.set("editorconfig", js.undefined)
    @scala.inline
    def setUseCache(value: Boolean): Self = this.set("useCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCache: Self = this.set("useCache", js.undefined)
  }
  
}

