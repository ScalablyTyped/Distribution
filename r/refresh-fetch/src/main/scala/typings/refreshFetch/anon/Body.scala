package typings.refreshFetch.anon

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body[ResponseBody] extends js.Object {
  
  /* tslint:disable-next-line no-unnecessary-generics */
  var body: ResponseBody = js.native
  
  var response: Response = js.native
}
object Body {
  
  @scala.inline
  def apply[ResponseBody](body: ResponseBody, response: Response): Body[ResponseBody] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body[ResponseBody]]
  }
  
  @scala.inline
  implicit class BodyOps[Self <: Body[_], ResponseBody] (val x: Self with Body[ResponseBody]) extends AnyVal {
    
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
    def setBody(value: ResponseBody): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Response): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
