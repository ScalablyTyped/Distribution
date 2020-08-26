package typings.rollupPluginNodeResolve.mod

import typings.resolve.mod.AsyncOpts
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  	 * some package.json files have a "browser" field which specifies
  	 * alternative files to load for people bundling for the browser. If
  	 * that's you, either use this option or add "browser" to the
  	 * "mainfields" option, otherwise pkg.browser will be ignored
  	 * @default false
  	 */
  var browser: js.UndefOr[Boolean] = js.native
  /**
  	 * Any additional options that should be passed through
  	 * to node-resolve
  	 */
  var customResolveOptions: js.UndefOr[AsyncOpts] = js.native
  /**
  	 * Force resolving for these modules to root's node_modules that helps
  	 * to prevent bundling the same package multiple times if package is
  	 * imported from dependencies.
  	 */
  var dedupe: js.UndefOr[js.Array[String] | (js.Function1[/* importee */ String, Boolean])] = js.native
  /**
  	 * not all files you want to resolve are .js files
  	 * @default [ '.mjs', '.js', '.json', '.node' ]
  	 */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  /**
  	 * Lock the module search in this path (like a chroot). Module defined
  	 * outside this path will be marked as external
  	 * @default '/'
  	 */
  var jail: js.UndefOr[String] = js.native
  /**
  	 * @deprecated use "mainFields" instead
  	 * use "jsnext:main" if possible
  	 * legacy field pointing to ES6 module in third-party libraries,
  	 * deprecated in favor of "pkg.module":
  	 * - see: https://github.com/rollup/rollup/wiki/pkg.module
  	 * @default false
  	 */
  var jsnext: js.UndefOr[Boolean] = js.native
  /**
  	 * @deprecated use "mainFields" instead
  	 * use "main" field or index.js, even if it's not an ES6 module
  	 * (needs to be converted from CommonJS to ES6)
  	 * – see https://github.com/rollup/rollup-plugin-commonjs
  	 * @default true
  	 */
  var main: js.UndefOr[Boolean] = js.native
  /**
  	 * the fields to scan in a package.json to determine the entry point
  	 * if this list contains "browser", overrides specified in "pkg.browser"
  	 * will be used
  	 * @default ['module', 'main']
  	 */
  var mainFields: js.UndefOr[js.Array[String]] = js.native
  /**
  	 * @deprecated use "mainFields" instead
  	 * use "module" field for ES6 module if possible
  	 * @default true
  	 */
  var module: js.UndefOr[Boolean] = js.native
  /**
  	 * If true, inspect resolved files to check that they are
  	 * ES2015 modules
  	 * @default false
  	 */
  var modulesOnly: js.UndefOr[Boolean] = js.native
  /**
  	 * Set to an array of strings and/or regexps to lock the module search
  	 * to modules that match at least one entry. Modules not matching any
  	 * entry will be marked as external
  	 * @default null
  	 */
  var only: js.UndefOr[(js.Array[String | RegExp]) | Null] = js.native
  /**
  	 * whether to prefer built-in modules (e.g. `fs`, `path`) or
  	 * local ones with the same names
  	 * @default true
  	 */
  var preferBuiltins: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBrowser(value: Boolean): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    @scala.inline
    def setCustomResolveOptions(value: AsyncOpts): Self = this.set("customResolveOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomResolveOptions: Self = this.set("customResolveOptions", js.undefined)
    @scala.inline
    def setDedupeVarargs(value: String*): Self = this.set("dedupe", js.Array(value :_*))
    @scala.inline
    def setDedupeFunction1(value: /* importee */ String => Boolean): Self = this.set("dedupe", js.Any.fromFunction1(value))
    @scala.inline
    def setDedupe(value: js.Array[String] | (js.Function1[/* importee */ String, Boolean])): Self = this.set("dedupe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDedupe: Self = this.set("dedupe", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setJail(value: String): Self = this.set("jail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJail: Self = this.set("jail", js.undefined)
    @scala.inline
    def setJsnext(value: Boolean): Self = this.set("jsnext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsnext: Self = this.set("jsnext", js.undefined)
    @scala.inline
    def setMain(value: Boolean): Self = this.set("main", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    @scala.inline
    def setMainFieldsVarargs(value: String*): Self = this.set("mainFields", js.Array(value :_*))
    @scala.inline
    def setMainFields(value: js.Array[String]): Self = this.set("mainFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainFields: Self = this.set("mainFields", js.undefined)
    @scala.inline
    def setModule(value: Boolean): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    @scala.inline
    def setModulesOnly(value: Boolean): Self = this.set("modulesOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModulesOnly: Self = this.set("modulesOnly", js.undefined)
    @scala.inline
    def setOnlyVarargs(value: (String | RegExp)*): Self = this.set("only", js.Array(value :_*))
    @scala.inline
    def setOnly(value: js.Array[String | RegExp]): Self = this.set("only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    @scala.inline
    def setOnlyNull: Self = this.set("only", null)
    @scala.inline
    def setPreferBuiltins(value: Boolean): Self = this.set("preferBuiltins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferBuiltins: Self = this.set("preferBuiltins", js.undefined)
  }
  
}

