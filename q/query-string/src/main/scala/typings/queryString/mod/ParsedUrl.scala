package typings.queryString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedUrl extends js.Object {
  
  /**
  	The fragment identifier of the URL.
  	Present when the `parseFragmentIdentifier` option is `true`.
  	*/
  val fragmentIdentifier: js.UndefOr[String] = js.native
  
  val query: ParsedQuery[String] = js.native
  
  val url: String = js.native
}
object ParsedUrl {
  
  @scala.inline
  def apply(query: ParsedQuery[String], url: String): ParsedUrl = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedUrl]
  }
  
  @scala.inline
  implicit class ParsedUrlOps[Self <: ParsedUrl] (val x: Self) extends AnyVal {
    
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
    def setQuery(value: ParsedQuery[String]): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentIdentifier(value: String): Self = this.set("fragmentIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragmentIdentifier: Self = this.set("fragmentIdentifier", js.undefined)
  }
}
