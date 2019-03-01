package typings
package relateurlLib.relateurlMod.RelateUrlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Type: Object
    * Default value: {ftp:21, http:80, https:443}
    *
    * Extend the list with any ports you need. Any URLs containing these default ports will have them removed. Example: http://example.com:80/ will become http://example.com/.
    */
  var defaultPorts: js.UndefOr[js.Object] = js.undefined
  /**
    * Type: Array
    * Default value: ["index.html"]
    *
    * Extend the list with any resources you need. Works with options.removeDirectoryIndexes.
    */
  var directoryIndexes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Type: Boolean
    * Default value: false
    *
    * This will, for example, consider any domains containing http://www.example.com/ to be related to any that contain http://example.com/.
    */
  var ignore_www: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type: constant or String
    * Choices: RelateUrl.ABSOLUTE,RelateUrl.PATH_RELATIVE,RelateUrl.ROOT_RELATIVE,RelateUrl.SHORTEST
    * Choices: "absolute","pathRelative","rootRelative","shortest"
    * Default value: RelateUrl.SHORTEST
    *
    * RelateUrl.ABSOLUTE will produce an absolute URL. Overrides options.schemeRelative with a value of false.
    * RelateUrl.PATH_RELATIVE will produce something like ../child-of-parent/etc/.
    * RelateUrl.ROOT_RELATIVE will produce something like /child-of-root/etc/.
    * RelateUrl.SHORTEST will choose whichever is shortest between root- and path-relative.
    */
  var output: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type: Array
    * Default value: ["data","javascript","mailto"]
    *
    * Extend the list with any additional schemes. Example: javascript:something will not be modified.
    */
  var rejectedSchemes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Type: Boolean
    * Default value: false
    *
    * Remove user authentication information from the output URL.
    */
  var removeAuth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type: Boolean
    * Default value: true
    *
    * Remove any resources that match any found in options.directoryIndexes.
    */
  var removeDirectoryIndexes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type: Boolean
    * Default value: false
    *
    * Remove empty query variables. Example: http://domain.com/?var1&var2=&var3=asdf will become http://domain.com/?var3=adsf. This does not apply to unrelated URLs (with other protocols, auths, hosts and/or ports).
    */
  var removeEmptyQueries: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type: Boolean
    * Default value: true
    *
    * Remove trailing slashes from root paths. Example: http://domain.com/?var will become http://domain.com?var while http://domain.com/dir/?var will not be modified.
    */
  var removeRootTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type: Boolean
    * Default value: true
    *
    * Output URLs relative to the scheme. Example: http://example.com/ will become //example.com/.
    */
  var schemeRelative: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type: String
    * Default value: undefined
    *
    * An options-based version of the from argument. If both are specified, from takes priority.
    */
  var site: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type: Boolean
    * Default value: true
    *
    * Passed to Node's url.parse.
    */
  var slashesDenoteHost: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultPorts: js.Object = null,
    directoryIndexes: js.Array[java.lang.String] = null,
    ignore_www: js.UndefOr[scala.Boolean] = js.undefined,
    output: java.lang.String = null,
    rejectedSchemes: js.Array[java.lang.String] = null,
    removeAuth: js.UndefOr[scala.Boolean] = js.undefined,
    removeDirectoryIndexes: js.UndefOr[scala.Boolean] = js.undefined,
    removeEmptyQueries: js.UndefOr[scala.Boolean] = js.undefined,
    removeRootTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined,
    schemeRelative: js.UndefOr[scala.Boolean] = js.undefined,
    site: java.lang.String = null,
    slashesDenoteHost: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultPorts != null) __obj.updateDynamic("defaultPorts")(defaultPorts)
    if (directoryIndexes != null) __obj.updateDynamic("directoryIndexes")(directoryIndexes)
    if (!js.isUndefined(ignore_www)) __obj.updateDynamic("ignore_www")(ignore_www)
    if (output != null) __obj.updateDynamic("output")(output)
    if (rejectedSchemes != null) __obj.updateDynamic("rejectedSchemes")(rejectedSchemes)
    if (!js.isUndefined(removeAuth)) __obj.updateDynamic("removeAuth")(removeAuth)
    if (!js.isUndefined(removeDirectoryIndexes)) __obj.updateDynamic("removeDirectoryIndexes")(removeDirectoryIndexes)
    if (!js.isUndefined(removeEmptyQueries)) __obj.updateDynamic("removeEmptyQueries")(removeEmptyQueries)
    if (!js.isUndefined(removeRootTrailingSlash)) __obj.updateDynamic("removeRootTrailingSlash")(removeRootTrailingSlash)
    if (!js.isUndefined(schemeRelative)) __obj.updateDynamic("schemeRelative")(schemeRelative)
    if (site != null) __obj.updateDynamic("site")(site)
    if (!js.isUndefined(slashesDenoteHost)) __obj.updateDynamic("slashesDenoteHost")(slashesDenoteHost)
    __obj.asInstanceOf[Options]
  }
}

