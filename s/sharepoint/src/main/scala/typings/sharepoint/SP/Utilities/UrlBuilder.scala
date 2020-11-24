package typings.sharepoint.SP.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlBuilder extends js.Object {
  
  def addKeyValueQueryString(key: String, value: String): Unit = js.native
  
  def combinePath(path: String): Unit = js.native
  
  /** Returns the resulting url */
  def get_url(): String = js.native
}
object UrlBuilder {
  
  @scala.inline
  def apply(
    addKeyValueQueryString: (String, String) => Unit,
    combinePath: String => Unit,
    get_url: () => String
  ): UrlBuilder = {
    val __obj = js.Dynamic.literal(addKeyValueQueryString = js.Any.fromFunction2(addKeyValueQueryString), combinePath = js.Any.fromFunction1(combinePath), get_url = js.Any.fromFunction0(get_url))
    __obj.asInstanceOf[UrlBuilder]
  }
  
  @scala.inline
  implicit class UrlBuilderOps[Self <: UrlBuilder] (val x: Self) extends AnyVal {
    
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
    def setAddKeyValueQueryString(value: (String, String) => Unit): Self = this.set("addKeyValueQueryString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCombinePath(value: String => Unit): Self = this.set("combinePath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_url(value: () => String): Self = this.set("get_url", js.Any.fromFunction0(value))
  }
}
