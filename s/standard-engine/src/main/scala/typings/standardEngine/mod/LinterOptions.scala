package typings.standardEngine.mod

import typings.standardEngine.anon.Typeofeslint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinterOptions extends js.Object {
  var bugs: js.UndefOr[String] = js.native
  var cmd: String = js.native
  /** @default process.cwd() */
  var cwd: js.UndefOr[String] = js.native
  var eslint: Typeofeslint = js.native
  var eslintConfig: js.UndefOr[ESLintConfig] = js.native
  var homepage: js.UndefOr[String] = js.native
  /**
    * This function is called with the current options object (opts),
    * any options extracted from the project's package.json (packageOpts),
    * and the directory that contained that package.json file
    * (rootDir, equivalent to opts.cwd if no file was found).
    * Modify and return opts, or return a new object with the options that are to be used.
    */
  var parseOpts: js.UndefOr[
    js.Function3[/* opts */ ParseOptions, /* packageOpts */ js.Any, /* rootDir */ String, ParseOptions]
  ] = js.native
  var tagline: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object LinterOptions {
  @scala.inline
  def apply(cmd: String, eslint: Typeofeslint): LinterOptions = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], eslint = eslint.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinterOptions]
  }
  @scala.inline
  implicit class LinterOptionsOps[Self <: LinterOptions] (val x: Self) extends AnyVal {
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
    def setCmd(value: String): Self = this.set("cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def setEslint(value: Typeofeslint): Self = this.set("eslint", value.asInstanceOf[js.Any])
    @scala.inline
    def setBugs(value: String): Self = this.set("bugs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBugs: Self = this.set("bugs", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setEslintConfig(value: ESLintConfig): Self = this.set("eslintConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEslintConfig: Self = this.set("eslintConfig", js.undefined)
    @scala.inline
    def setHomepage(value: String): Self = this.set("homepage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomepage: Self = this.set("homepage", js.undefined)
    @scala.inline
    def setParseOpts(value: (/* opts */ ParseOptions, /* packageOpts */ js.Any, /* rootDir */ String) => ParseOptions): Self = this.set("parseOpts", js.Any.fromFunction3(value))
    @scala.inline
    def deleteParseOpts: Self = this.set("parseOpts", js.undefined)
    @scala.inline
    def setTagline(value: String): Self = this.set("tagline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagline: Self = this.set("tagline", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

