package typings.rollupPluginCommonjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupCommonJSOptions extends js.Object {
  /**
  	 * non-CommonJS modules will be ignored, but you can also
  	 * specifically include/exclude files
  	 * @default undefined
  	 */
  var exclude: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  /**
  	 * search for files other than .js files (must already
  	 * be transpiled by a previous plugin!)
  	 * @default [ '.js' ]
  	 */
  var extensions: js.UndefOr[js.Array[String | RegExp]] = js.native
  /**
  	 * sometimes you have to leave require statements
  	 * unconverted. Pass an array containing the IDs
  	 * or a `id => boolean` function. Only use this
  	 * option if you know what you're doing!
  	 */
  var ignore: js.UndefOr[js.Array[String | (js.Function1[/* id */ String, Boolean])]] = js.native
  /**
  	 * if true then uses of `global` won't be dealt with by this plugin
  	 * @default false
  	 */
  var ignoreGlobal: js.UndefOr[Boolean] = js.native
  /**
  	 * non-CommonJS modules will be ignored, but you can also
  	 * specifically include/exclude files
  	 * @default undefined
  	 */
  var include: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  /**
  	 * explicitly specify unresolvable named exports
  	 * ([see below for more details](https://github.com/rollup/rollup-plugin-commonjs#custom-named-exports))
  	 * @default undefined
  	 */
  var namedExports: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
  	 * if false then skip sourceMap generation for CommonJS modules
  	 * @default true
  	 */
  var sourceMap: js.UndefOr[Boolean] = js.native
}

object RollupCommonJSOptions {
  @scala.inline
  def apply(): RollupCommonJSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupCommonJSOptions]
  }
  @scala.inline
  implicit class RollupCommonJSOptionsOps[Self <: RollupCommonJSOptions] (val x: Self) extends AnyVal {
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
    def setExcludeVarargs(value: (String | RegExp)*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: (String | RegExp)*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String | RegExp]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: (String | (js.Function1[/* id */ String, Boolean]))*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[String | (js.Function1[/* id */ String, Boolean])]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setIgnoreGlobal(value: Boolean): Self = this.set("ignoreGlobal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreGlobal: Self = this.set("ignoreGlobal", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: (String | RegExp)*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setNamedExports(value: StringDictionary[js.Array[String]]): Self = this.set("namedExports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedExports: Self = this.set("namedExports", js.undefined)
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
  }
  
}

