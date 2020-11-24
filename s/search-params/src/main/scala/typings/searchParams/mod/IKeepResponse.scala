package typings.searchParams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeepResponse extends js.Object {
  
  var keptParams: js.Object = js.native
  
  var querystring: String = js.native
}
object IKeepResponse {
  
  @scala.inline
  def apply(keptParams: js.Object, querystring: String): IKeepResponse = {
    val __obj = js.Dynamic.literal(keptParams = keptParams.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeepResponse]
  }
  
  @scala.inline
  implicit class IKeepResponseOps[Self <: IKeepResponse] (val x: Self) extends AnyVal {
    
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
    def setKeptParams(value: js.Object): Self = this.set("keptParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuerystring(value: String): Self = this.set("querystring", value.asInstanceOf[js.Any])
  }
}
