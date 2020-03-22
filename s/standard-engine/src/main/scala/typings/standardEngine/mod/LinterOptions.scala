package typings.standardEngine.mod

import typings.standardEngine.Typeofeslint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinterOptions extends js.Object {
  var bugs: js.UndefOr[String] = js.undefined
  var cmd: String
  /** @default process.cwd() */
  var cwd: js.UndefOr[String] = js.undefined
  var eslint: Typeofeslint
  var eslintConfig: js.UndefOr[ESLintConfig] = js.undefined
  var homepage: js.UndefOr[String] = js.undefined
  /**
    * This function is called with the current options object (opts),
    * any options extracted from the project's package.json (packageOpts),
    * and the directory that contained that package.json file
    * (rootDir, equivalent to opts.cwd if no file was found).
    * Modify and return opts, or return a new object with the options that are to be used.
    */
  var parseOpts: js.UndefOr[
    js.Function3[/* opts */ ParseOptions, /* packageOpts */ js.Any, /* rootDir */ String, ParseOptions]
  ] = js.undefined
  var tagline: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object LinterOptions {
  @scala.inline
  def apply(
    cmd: String,
    eslint: Typeofeslint,
    bugs: String = null,
    cwd: String = null,
    eslintConfig: ESLintConfig = null,
    homepage: String = null,
    parseOpts: (/* opts */ ParseOptions, /* packageOpts */ js.Any, /* rootDir */ String) => ParseOptions = null,
    tagline: String = null,
    version: String = null
  ): LinterOptions = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], eslint = eslint.asInstanceOf[js.Any])
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (eslintConfig != null) __obj.updateDynamic("eslintConfig")(eslintConfig.asInstanceOf[js.Any])
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (parseOpts != null) __obj.updateDynamic("parseOpts")(js.Any.fromFunction3(parseOpts))
    if (tagline != null) __obj.updateDynamic("tagline")(tagline.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinterOptions]
  }
}

