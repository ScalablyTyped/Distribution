package typings.pug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** The root directory of all absolute inclusion. */
  var basedir: js.UndefOr[String] = js.undefined
  /** If set to true, compiled functions are cached. filename must be set as the cache key. Only applies to render functions. Defaults to false. */
  var cache: js.UndefOr[Boolean] = js.undefined
  /** If set to true, the function source will be included in the compiled template for better error messages (sometimes useful in development). It is enabled by default unless used with Express in production mode. */
  var compileDebug: js.UndefOr[Boolean] = js.undefined
  /** If set to true, the tokens and function body are logged to stdout. */
  var debug: js.UndefOr[Boolean] = js.undefined
  /** If the doctype is not specified as part of the template, you can specify it here. It is sometimes useful to get self-closing tags and remove mirroring of boolean attributes; see doctype documentation for more information. */
  var doctype: js.UndefOr[String] = js.undefined
  /** The name of the file being compiled. Used in exceptions, and required for relative includes and extends. Defaults to 'Pug'. */
  var filename: js.UndefOr[String] = js.undefined
  /** Hash table of custom filters. Defaults to undefined. */
  var filters: js.UndefOr[js.Any] = js.undefined
  /** Add a list of global names to make accessible in templates. */
  var globals: js.UndefOr[js.Array[String]] = js.undefined
  /** Inline runtime functions instead of require-ing them from a shared version. For compileClient functions, the default is true so that one does not have to include the runtime. For all other compilation or rendering types, the default is false. */
  var inlineRuntimeFunctions: js.UndefOr[Boolean] = js.undefined
  /** The name of the template function. Only applies to compileClient functions. Defaults to 'template'. */
  var name: js.UndefOr[String] = js.undefined
  /** Adds whitespace to the resulting HTML to make it easier for a human to read using '  ' as indentation. If a string is specified, that will be used as indentation instead (e.g. '\t'). Defaults to false. */
  var pretty: js.UndefOr[Boolean | String] = js.undefined
  /** Use a self namespace to hold the locals. It will speed up the compilation, but instead of writing variable you will have to write self.variable to access a property of the locals object. Defaults to false. */
  var self: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basedir: String = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    compileDebug: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    doctype: String = null,
    filename: String = null,
    filters: js.Any = null,
    globals: js.Array[String] = null,
    inlineRuntimeFunctions: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    pretty: Boolean | String = null,
    self: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compileDebug)) __obj.updateDynamic("compileDebug")(compileDebug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (doctype != null) __obj.updateDynamic("doctype")(doctype.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineRuntimeFunctions)) __obj.updateDynamic("inlineRuntimeFunctions")(inlineRuntimeFunctions.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pretty != null) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

