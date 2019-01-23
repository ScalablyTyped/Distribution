package typings
package rollupDashPluginDashCommonjsLib.rollupDashPluginDashCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Non-CommonJS modules will be ignored, but you can also
    * specifically exclude files.
    * @default undefined
    */
  var exclude: js.UndefOr[java.lang.String | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  /**
    * Search for files other than .js files (must already
    * be transpiled by a previous plugin).
    * @default [ '.js' ]
    */
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Sometimes you have to leave require statements
    * unconverted. Pass an array containing the IDs
    * or a `id => boolean` function. Only use this
    * option if you know what you're doing!
    * @default undefined
    */
  var ignore: js.UndefOr[IgnoreFunction | js.Array[java.lang.String]] = js.undefined
  /**
    * If `true`, then uses of `global` won't be dealt with by this plugin.
    * @default false
    */
  var ignoreGlobal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Non-CommonJS modules will be ignored, but you can also
    * specifically include files.
    * @default undefined
    */
  var include: js.UndefOr[java.lang.String | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  /**
    * Explicitly specify unresolvable named exports.
    * @default undefined
    */
  var namedExports: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  /**
    * If false, then skip sourceMap generation for CommonJS modules.
    * @default true
    */
  var sourceMap: js.UndefOr[scala.Boolean] = js.undefined
}

