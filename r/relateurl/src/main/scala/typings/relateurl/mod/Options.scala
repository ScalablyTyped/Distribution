package typings.relateurl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Type: Object
    * Default value: {ftp:21, http:80, https:443}
    *
    * Extend the list with any ports you need. Any URLs containing these default ports will have them removed. Example: http://example.com:80/ will become http://example.com/.
    */
  var defaultPorts: js.UndefOr[js.Object] = js.native
  /**
    * Type: Array
    * Default value: ["index.html"]
    *
    * Extend the list with any resources you need. Works with options.removeDirectoryIndexes.
    */
  var directoryIndexes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Type: Boolean
    * Default value: false
    *
    * This will, for example, consider any domains containing http://www.example.com/ to be related to any that contain http://example.com/.
    */
  var ignore_www: js.UndefOr[Boolean] = js.native
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
  var output: js.UndefOr[String] = js.native
  /**
    * Type: Array
    * Default value: ["data","javascript","mailto"]
    *
    * Extend the list with any additional schemes. Example: javascript:something will not be modified.
    */
  var rejectedSchemes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Type: Boolean
    * Default value: false
    *
    * Remove user authentication information from the output URL.
    */
  var removeAuth: js.UndefOr[Boolean] = js.native
  /**
    * Type: Boolean
    * Default value: true
    *
    * Remove any resources that match any found in options.directoryIndexes.
    */
  var removeDirectoryIndexes: js.UndefOr[Boolean] = js.native
  /**
    * Type: Boolean
    * Default value: false
    *
    * Remove empty query variables. Example: http://domain.com/?var1&var2=&var3=asdf will become http://domain.com/?var3=adsf. This does not apply to unrelated URLs (with other protocols, auths, hosts and/or ports).
    */
  var removeEmptyQueries: js.UndefOr[Boolean] = js.native
  /**
    * Type: Boolean
    * Default value: true
    *
    * Remove trailing slashes from root paths. Example: http://domain.com/?var will become http://domain.com?var while http://domain.com/dir/?var will not be modified.
    */
  var removeRootTrailingSlash: js.UndefOr[Boolean] = js.native
  /**
    * Type: Boolean
    * Default value: true
    *
    * Output URLs relative to the scheme. Example: http://example.com/ will become //example.com/.
    */
  var schemeRelative: js.UndefOr[Boolean] = js.native
  /**
    * Type: String
    * Default value: undefined
    *
    * An options-based version of the from argument. If both are specified, from takes priority.
    */
  var site: js.UndefOr[String] = js.native
  /**
    * Type: Boolean
    * Default value: true
    *
    * Passed to Node's url.parse.
    */
  var slashesDenoteHost: js.UndefOr[Boolean] = js.native
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
    def setDefaultPorts(value: js.Object): Self = this.set("defaultPorts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPorts: Self = this.set("defaultPorts", js.undefined)
    @scala.inline
    def setDirectoryIndexesVarargs(value: String*): Self = this.set("directoryIndexes", js.Array(value :_*))
    @scala.inline
    def setDirectoryIndexes(value: js.Array[String]): Self = this.set("directoryIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryIndexes: Self = this.set("directoryIndexes", js.undefined)
    @scala.inline
    def setIgnore_www(value: Boolean): Self = this.set("ignore_www", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore_www: Self = this.set("ignore_www", js.undefined)
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setRejectedSchemesVarargs(value: String*): Self = this.set("rejectedSchemes", js.Array(value :_*))
    @scala.inline
    def setRejectedSchemes(value: js.Array[String]): Self = this.set("rejectedSchemes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectedSchemes: Self = this.set("rejectedSchemes", js.undefined)
    @scala.inline
    def setRemoveAuth(value: Boolean): Self = this.set("removeAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveAuth: Self = this.set("removeAuth", js.undefined)
    @scala.inline
    def setRemoveDirectoryIndexes(value: Boolean): Self = this.set("removeDirectoryIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveDirectoryIndexes: Self = this.set("removeDirectoryIndexes", js.undefined)
    @scala.inline
    def setRemoveEmptyQueries(value: Boolean): Self = this.set("removeEmptyQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveEmptyQueries: Self = this.set("removeEmptyQueries", js.undefined)
    @scala.inline
    def setRemoveRootTrailingSlash(value: Boolean): Self = this.set("removeRootTrailingSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveRootTrailingSlash: Self = this.set("removeRootTrailingSlash", js.undefined)
    @scala.inline
    def setSchemeRelative(value: Boolean): Self = this.set("schemeRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemeRelative: Self = this.set("schemeRelative", js.undefined)
    @scala.inline
    def setSite(value: String): Self = this.set("site", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSite: Self = this.set("site", js.undefined)
    @scala.inline
    def setSlashesDenoteHost(value: Boolean): Self = this.set("slashesDenoteHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlashesDenoteHost: Self = this.set("slashesDenoteHost", js.undefined)
  }
  
}

