package typings.searchParams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOmitResponse extends js.Object {
  
  var querystring: String = js.native
  
  var removedParams: js.Object = js.native
}
object IOmitResponse {
  
  @scala.inline
  def apply(querystring: String, removedParams: js.Object): IOmitResponse = {
    val __obj = js.Dynamic.literal(querystring = querystring.asInstanceOf[js.Any], removedParams = removedParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOmitResponse]
  }
  
  @scala.inline
  implicit class IOmitResponseOps[Self <: IOmitResponse] (val x: Self) extends AnyVal {
    
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
    def setQuerystring(value: String): Self = this.set("querystring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedParams(value: js.Object): Self = this.set("removedParams", value.asInstanceOf[js.Any])
  }
}
