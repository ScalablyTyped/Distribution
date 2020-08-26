package typings.standardEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined standard-engine.standard-engine.PickWithSomeRequired<standard-engine.standard-engine.Options & {  eslintConfig :standard-engine.standard-engine.ESLintConfig}, 'ignore' | 'cwd' | 'fix' | 'eslintConfig'> */
@js.native
trait ParseOptions extends js.Object {
  var cwd: String = js.native
  var env: js.UndefOr[String | js.Array[String]] = js.native
  var envs: js.UndefOr[String | js.Array[String]] = js.native
  var eslintConfig: ESLintConfig = js.native
  var filename: js.UndefOr[String] = js.native
  var fix: Boolean = js.native
  var global: js.UndefOr[String | js.Array[String]] = js.native
  var globals: js.UndefOr[String | js.Array[String]] = js.native
  var ignore: js.Array[String] = js.native
  var parser: js.UndefOr[String] = js.native
  var plugin: js.UndefOr[String | js.Array[String]] = js.native
  var plugins: js.UndefOr[String | js.Array[String]] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(cwd: String, eslintConfig: ESLintConfig, fix: Boolean, ignore: js.Array[String]): ParseOptions = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], eslintConfig = eslintConfig.asInstanceOf[js.Any], fix = fix.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def setEslintConfig(value: ESLintConfig): Self = this.set("eslintConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setFix(value: Boolean): Self = this.set("fix", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvVarargs(value: String*): Self = this.set("env", js.Array(value :_*))
    @scala.inline
    def setEnv(value: String | js.Array[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setEnvsVarargs(value: String*): Self = this.set("envs", js.Array(value :_*))
    @scala.inline
    def setEnvs(value: String | js.Array[String]): Self = this.set("envs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvs: Self = this.set("envs", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setGlobalVarargs(value: String*): Self = this.set("global", js.Array(value :_*))
    @scala.inline
    def setGlobal(value: String | js.Array[String]): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setGlobalsVarargs(value: String*): Self = this.set("globals", js.Array(value :_*))
    @scala.inline
    def setGlobals(value: String | js.Array[String]): Self = this.set("globals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    @scala.inline
    def setParser(value: String): Self = this.set("parser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    @scala.inline
    def setPluginVarargs(value: String*): Self = this.set("plugin", js.Array(value :_*))
    @scala.inline
    def setPlugin(value: String | js.Array[String]): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: String | js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
  
}

