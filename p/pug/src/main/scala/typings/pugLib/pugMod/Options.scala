package typings
package pugLib.pugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** The root directory of all absolute inclusion. */
  var basedir: js.UndefOr[java.lang.String] = js.undefined
  /** If set to true, compiled functions are cached. filename must be set as the cache key. Only applies to render functions. Defaults to false. */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /** If set to true, the function source will be included in the compiled template for better error messages (sometimes useful in development). It is enabled by default unless used with Express in production mode. */
  var compileDebug: js.UndefOr[scala.Boolean] = js.undefined
  /** If set to true, the tokens and function body are logged to stdout. */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /** If the doctype is not specified as part of the template, you can specify it here. It is sometimes useful to get self-closing tags and remove mirroring of boolean attributes; see doctype documentation for more information. */
  var doctype: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the file being compiled. Used in exceptions, and required for relative includes and extends. Defaults to 'Pug'. */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /** Hash table of custom filters. Defaults to undefined. */
  var filters: js.UndefOr[js.Any] = js.undefined
  /** Add a list of global names to make accessible in templates. */
  var globals: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Inline runtime functions instead of require-ing them from a shared version. For compileClient functions, the default is true so that one does not have to include the runtime. For all other compilation or rendering types, the default is false. */
  var inlineRuntimeFunctions: js.UndefOr[scala.Boolean] = js.undefined
  /** The name of the template function. Only applies to compileClient functions. Defaults to 'template'. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Adds whitespace to the resulting HTML to make it easier for a human to read using '  ' as indentation. If a string is specified, that will be used as indentation instead (e.g. '\t'). Defaults to false. */
  var pretty: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /** Use a self namespace to hold the locals. It will speed up the compilation, but instead of writing variable you will have to write self.variable to access a property of the locals object. Defaults to false. */
  var self: js.UndefOr[scala.Boolean] = js.undefined
}

