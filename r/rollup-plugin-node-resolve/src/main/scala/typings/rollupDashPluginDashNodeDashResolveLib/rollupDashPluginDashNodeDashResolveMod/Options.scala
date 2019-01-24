package typings
package rollupDashPluginDashNodeDashResolveLib.rollupDashPluginDashNodeDashResolveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Some package.json files have a `browser` field which
    * specifies alternative files to load for people bundling
    * for the browser. If that's you, use this option, otherwise
    * pkg.browser will be ignored.
    * @default false
    */
  var browser: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Any additional options that should be passed through to node-resolve
    */
  var customResolveOptions: js.UndefOr[resolveLib.resolveMod.resolveNs.AsyncOpts] = js.undefined
  /**
    * Not all files you want to resolve are .js files.
    * @default ['.mjs', '.js', '.json', '.node']
    */
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Lock the module search in this path (like a chroot). Module defined
    * outside this path will be marked as external.
    * @default '/'
    */
  var jail: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use "jsnext:main" if possible.
    * Legacy field pointing to ES6 module in third-party libraries,
    * deprecated in favor of "pkg.module".
    * See: https://github.com/rollup/rollup/wiki/pkg.module
    * @default false
    */
  var jsnext: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use "main" field or index.js, even if it's not an ES6 module
    * (needs to be converted from CommonJS to ES6).
    * See https://github.com/rollup/rollup-plugin-commonjs
    * @default true
    */
  var main: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use "module" field for ES6 module if possible.
    * @default true
    */
  var module: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, inspect resolved files to check that they are ES2015 modules
    * @default false
    */
  var modulesOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to an array of strings and/or regexps to lock the module search
    * to modules that match at least one entry. Modules not matching any
    * entry will be marked as external.
    */
  var only: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  /**
    * Whether to prefer built-in modules (e.g. `fs`, `path`) or
    * local ones with the same names.
    * @default true
    */
  var preferBuiltins: js.UndefOr[scala.Boolean] = js.undefined
}

