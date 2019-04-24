package typings
package rollupDashPluginDashCommonjsLib.rollupDashPluginDashCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupCommonJSOptions extends js.Object {
  /**
  	 * non-CommonJS modules will be ignored, but you can also
  	 * specifically include/exclude files
  	 * @default undefined
  	 */
  var exclude: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  /**
  	 * search for files other than .js files (must already
  	 * be transpiled by a previous plugin!)
  	 * @default [ '.js' ]
  	 */
  var extensions: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  /**
  	 * sometimes you have to leave require statements
  	 * unconverted. Pass an array containing the IDs
  	 * or a `id => boolean` function. Only use this
  	 * option if you know what you're doing!
  	 */
  var ignore: js.UndefOr[
    js.Array[java.lang.String | (js.Function1[/* id */ java.lang.String, scala.Boolean])]
  ] = js.undefined
  /**
  	 * if true then uses of `global` won't be dealt with by this plugin
  	 * @default false
  	 */
  var ignoreGlobal: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * non-CommonJS modules will be ignored, but you can also
  	 * specifically include/exclude files
  	 * @default undefined
  	 */
  var include: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  /**
  	 * explicitly specify unresolvable named exports
  	 * ([see below for more details](https://github.com/rollup/rollup-plugin-commonjs#custom-named-exports))
  	 * @default undefined
  	 */
  var namedExports: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  /**
  	 * if false then skip sourceMap generation for CommonJS modules
  	 * @default true
  	 */
  var sourceMap: js.UndefOr[scala.Boolean] = js.undefined
}

object RollupCommonJSOptions {
  @scala.inline
  def apply(
    exclude: java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) = null,
    extensions: js.Array[java.lang.String | stdLib.RegExp] = null,
    ignore: js.Array[java.lang.String | (js.Function1[/* id */ java.lang.String, scala.Boolean])] = null,
    ignoreGlobal: js.UndefOr[scala.Boolean] = js.undefined,
    include: java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) = null,
    namedExports: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    sourceMap: js.UndefOr[scala.Boolean] = js.undefined
  ): RollupCommonJSOptions = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (!js.isUndefined(ignoreGlobal)) __obj.updateDynamic("ignoreGlobal")(ignoreGlobal)
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (namedExports != null) __obj.updateDynamic("namedExports")(namedExports)
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap)
    __obj.asInstanceOf[RollupCommonJSOptions]
  }
}

