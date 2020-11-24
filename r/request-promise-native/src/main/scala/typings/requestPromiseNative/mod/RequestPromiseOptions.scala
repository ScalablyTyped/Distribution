package typings.requestPromiseNative.mod

import typings.request.mod.CoreOptions
import typings.request.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestPromiseOptions extends CoreOptions {
  
  var resolveWithFullResponse: js.UndefOr[Boolean] = js.native
  
  var simple: js.UndefOr[Boolean] = js.native
  
  var transform: js.UndefOr[
    js.Function3[
      /* body */ js.Any, 
      /* response */ Response, 
      /* resolveWithFullResponse */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  
  var transform2xxOnly: js.UndefOr[Boolean] = js.native
}
object RequestPromiseOptions {
  
  @scala.inline
  def apply(): RequestPromiseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestPromiseOptions]
  }
  
  @scala.inline
  implicit class RequestPromiseOptionsOps[Self <: RequestPromiseOptions] (val x: Self) extends AnyVal {
    
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
    def setResolveWithFullResponse(value: Boolean): Self = this.set("resolveWithFullResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveWithFullResponse: Self = this.set("resolveWithFullResponse", js.undefined)
    
    @scala.inline
    def setSimple(value: Boolean): Self = this.set("simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimple: Self = this.set("simple", js.undefined)
    
    @scala.inline
    def setTransform(
      value: (/* body */ js.Any, /* response */ Response, /* resolveWithFullResponse */ js.UndefOr[Boolean]) => _
    ): Self = this.set("transform", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setTransform2xxOnly(value: Boolean): Self = this.set("transform2xxOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform2xxOnly: Self = this.set("transform2xxOnly", js.undefined)
  }
}
