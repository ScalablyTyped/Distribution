package typings.standardEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ESLintConfig extends js.Object {
  /** @default true */
  var cache: js.UndefOr[Boolean] = js.native
  /** @default  path.join(HOME_OR_TMP, `.${this.cmd}-v${majorVersion}-cache/` */
  var cacheLocation: js.UndefOr[String] = js.native
  var configFile: js.UndefOr[String] = js.native
  /** @default [] */
  var envs: js.UndefOr[js.Array[String]] = js.native
  /** @default false */
  var fix: js.UndefOr[Boolean] = js.native
  /** @default [] */
  var globals: js.UndefOr[js.Array[String]] = js.native
  /** @default false */
  var ignore: js.UndefOr[Boolean] = js.native
  /** @default [] */
  var plugins: js.UndefOr[js.Array[String]] = js.native
  /** @default false */
  var useEslintrc: js.UndefOr[Boolean] = js.native
}

object ESLintConfig {
  @scala.inline
  def apply(): ESLintConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ESLintConfig]
  }
  @scala.inline
  implicit class ESLintConfigOps[Self <: ESLintConfig] (val x: Self) extends AnyVal {
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCacheLocation(value: String): Self = this.set("cacheLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheLocation: Self = this.set("cacheLocation", js.undefined)
    @scala.inline
    def setConfigFile(value: String): Self = this.set("configFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigFile: Self = this.set("configFile", js.undefined)
    @scala.inline
    def setEnvsVarargs(value: String*): Self = this.set("envs", js.Array(value :_*))
    @scala.inline
    def setEnvs(value: js.Array[String]): Self = this.set("envs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvs: Self = this.set("envs", js.undefined)
    @scala.inline
    def setFix(value: Boolean): Self = this.set("fix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFix: Self = this.set("fix", js.undefined)
    @scala.inline
    def setGlobalsVarargs(value: String*): Self = this.set("globals", js.Array(value :_*))
    @scala.inline
    def setGlobals(value: js.Array[String]): Self = this.set("globals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    @scala.inline
    def setIgnore(value: Boolean): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setUseEslintrc(value: Boolean): Self = this.set("useEslintrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseEslintrc: Self = this.set("useEslintrc", js.undefined)
  }
  
}

