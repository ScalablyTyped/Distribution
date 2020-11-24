package typings.reactAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchOptions[T] extends AsyncOptions[T] {
  
  var defer: js.UndefOr[Boolean] = js.native
  
  var json: js.UndefOr[Boolean] = js.native
}
object FetchOptions {
  
  @scala.inline
  def apply[T](): FetchOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions[T]]
  }
  
  @scala.inline
  implicit class FetchOptionsOps[Self <: FetchOptions[_], T] (val x: Self with FetchOptions[T]) extends AnyVal {
    
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
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
  }
}
