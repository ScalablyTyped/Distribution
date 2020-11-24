package typings.request.mod

import typings.request.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Multipart extends js.Object {
  
  var chunked: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[js.Array[Body]] = js.native
}
object Multipart {
  
  @scala.inline
  def apply(): Multipart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multipart]
  }
  
  @scala.inline
  implicit class MultipartOps[Self <: Multipart] (val x: Self) extends AnyVal {
    
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
    def setChunked(value: Boolean): Self = this.set("chunked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunked: Self = this.set("chunked", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: Body*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[Body]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
