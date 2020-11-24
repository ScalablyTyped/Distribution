package typings.reactMdUtils.caseInsensitiveFilterMod

import typings.reactMdUtils.utilsMod.SearchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseInsensitiveOptions[T] extends SearchOptions[T] {
  
  /**
    * Boolean if the filter should also exclude all items that do not start with
    * the query string. The default behavior is to return all matches that
    * contain the query string anywhere.
    */
  var startsWith: js.UndefOr[Boolean] = js.native
}
object CaseInsensitiveOptions {
  
  @scala.inline
  def apply[T](): CaseInsensitiveOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaseInsensitiveOptions[T]]
  }
  
  @scala.inline
  implicit class CaseInsensitiveOptionsOps[Self <: CaseInsensitiveOptions[_], T] (val x: Self with CaseInsensitiveOptions[T]) extends AnyVal {
    
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
    def setStartsWith(value: Boolean): Self = this.set("startsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartsWith: Self = this.set("startsWith", js.undefined)
  }
}
