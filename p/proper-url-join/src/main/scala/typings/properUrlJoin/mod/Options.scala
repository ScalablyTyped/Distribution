package typings.properUrlJoin.mod

import org.scalablytyped.runtime.StringDictionary
import typings.queryString.mod.StringifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Add a leading slash.
    *
    * **Default**: `true`
    */
  var leadingSlash: js.UndefOr[Boolean] = js.native
  
  /**
    * Protocol relative URLs.
    *
    * **Default**: `false`
    */
  var protocolRelative: js.UndefOr[Boolean] = js.native
  
  /**
    * Query string object that will be properly stringified and appended to the url.
    * It will be merged with the query string in the url, if it exists.
    */
  var query: js.UndefOr[StringDictionary[String | Double | (js.Array[String | Double])]] = js.native
  
  /**
    * [query-string](https://github.com/sindresorhus/query-string#stringifyobject-options) singify method options to be considered when stringifying the query.
    */
  var queryOptions: js.UndefOr[StringifyOptions] = js.native
  
  /**
    * Add a trailing slash.
    *
    * **Default**: `false`
    */
  var trailingSlash: js.UndefOr[Boolean] = js.native
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
    def setLeadingSlash(value: Boolean): Self = this.set("leadingSlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadingSlash: Self = this.set("leadingSlash", js.undefined)
    
    @scala.inline
    def setProtocolRelative(value: Boolean): Self = this.set("protocolRelative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolRelative: Self = this.set("protocolRelative", js.undefined)
    
    @scala.inline
    def setQuery(value: StringDictionary[String | Double | (js.Array[String | Double])]): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setQueryOptions(value: StringifyOptions): Self = this.set("queryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryOptions: Self = this.set("queryOptions", js.undefined)
    
    @scala.inline
    def setTrailingSlash(value: Boolean): Self = this.set("trailingSlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailingSlash: Self = this.set("trailingSlash", js.undefined)
  }
}
