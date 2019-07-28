package typings.rollupDashPluginDashNodeDashResolve.rollupDashPluginDashNodeDashResolveMod

import typings.resolve.resolveMod.AsyncOpts
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  	 * some package.json files have a "browser" field which specifies
  	 * alternative files to load for people bundling for the browser. If
  	 * that's you, either use this option or add "browser" to the
  	 * "mainfields" option, otherwise pkg.browser will be ignored
  	 * @default false
  	 */
  var browser: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Any additional options that should be passed through
  	 * to node-resolve
  	 */
  var customResolveOptions: js.UndefOr[AsyncOpts] = js.undefined
  /**
  	 * Force resolving for these modules to root's node_modules that helps
  	 * to prevent bundling the same package multiple times if package is
  	 * imported from dependencies.
  	 */
  var dedupe: js.UndefOr[js.Array[String] | (js.Function1[/* importee */ String, Boolean])] = js.undefined
  /**
  	 * not all files you want to resolve are .js files
  	 * @default [ '.mjs', '.js', '.json', '.node' ]
  	 */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  /**
  	 * Lock the module search in this path (like a chroot). Module defined
  	 * outside this path will be marked as external
  	 * @default '/'
  	 */
  var jail: js.UndefOr[String] = js.undefined
  /**
  	 * @deprecated use "mainFields" instead
  	 * use "jsnext:main" if possible
  	 * legacy field pointing to ES6 module in third-party libraries,
  	 * deprecated in favor of "pkg.module":
  	 * - see: https://github.com/rollup/rollup/wiki/pkg.module
  	 * @default false
  	 */
  var jsnext: js.UndefOr[Boolean] = js.undefined
  /**
  	 * @deprecated use "mainFields" instead
  	 * use "main" field or index.js, even if it's not an ES6 module
  	 * (needs to be converted from CommonJS to ES6)
  	 * – see https://github.com/rollup/rollup-plugin-commonjs
  	 * @default true
  	 */
  var main: js.UndefOr[Boolean] = js.undefined
  /**
  	 * the fields to scan in a package.json to determine the entry point
  	 * if this list contains "browser", overrides specified in "pkg.browser"
  	 * will be used
  	 * @default ['module', 'main']
  	 */
  var mainFields: js.UndefOr[js.Array[String]] = js.undefined
  /**
  	 * @deprecated use "mainFields" instead
  	 * use "module" field for ES6 module if possible
  	 * @default true
  	 */
  var module: js.UndefOr[Boolean] = js.undefined
  /**
  	 * If true, inspect resolved files to check that they are
  	 * ES2015 modules
  	 * @default false
  	 */
  var modulesOnly: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set to an array of strings and/or regexps to lock the module search
  	 * to modules that match at least one entry. Modules not matching any
  	 * entry will be marked as external
  	 * @default null
  	 */
  var only: js.UndefOr[(js.Array[String | RegExp]) | Null] = js.undefined
  /**
  	 * whether to prefer built-in modules (e.g. `fs`, `path`) or
  	 * local ones with the same names
  	 * @default true
  	 */
  var preferBuiltins: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    browser: js.UndefOr[Boolean] = js.undefined,
    customResolveOptions: AsyncOpts = null,
    dedupe: js.Array[String] | (js.Function1[/* importee */ String, Boolean]) = null,
    extensions: js.Array[String] = null,
    jail: String = null,
    jsnext: js.UndefOr[Boolean] = js.undefined,
    main: js.UndefOr[Boolean] = js.undefined,
    mainFields: js.Array[String] = null,
    module: js.UndefOr[Boolean] = js.undefined,
    modulesOnly: js.UndefOr[Boolean] = js.undefined,
    only: js.Array[String | RegExp] = null,
    preferBuiltins: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(browser)) __obj.updateDynamic("browser")(browser)
    if (customResolveOptions != null) __obj.updateDynamic("customResolveOptions")(customResolveOptions)
    if (dedupe != null) __obj.updateDynamic("dedupe")(dedupe.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (jail != null) __obj.updateDynamic("jail")(jail)
    if (!js.isUndefined(jsnext)) __obj.updateDynamic("jsnext")(jsnext)
    if (!js.isUndefined(main)) __obj.updateDynamic("main")(main)
    if (mainFields != null) __obj.updateDynamic("mainFields")(mainFields)
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module)
    if (!js.isUndefined(modulesOnly)) __obj.updateDynamic("modulesOnly")(modulesOnly)
    if (only != null) __obj.updateDynamic("only")(only)
    if (!js.isUndefined(preferBuiltins)) __obj.updateDynamic("preferBuiltins")(preferBuiltins)
    __obj.asInstanceOf[Options]
  }
}

