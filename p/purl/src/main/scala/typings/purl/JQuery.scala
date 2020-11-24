package typings.purl

import typings.purl.mod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  /** 
    * extract the URL from the selected element and parse that - will work on any element with a `src`, `href` or `action` attribute.
    */
  def url(): Url = js.native
}
object JQuery {
  
  @scala.inline
  def apply(url: () => Url): JQuery = {
    val __obj = js.Dynamic.literal(url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryOps[Self <: JQuery] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: () => Url): Self = this.set("url", js.Any.fromFunction0(value))
  }
}
