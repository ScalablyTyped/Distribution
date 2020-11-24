package typings.reduxApiMiddleware.mod

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RSAASuccessTypeDescriptor[State, Payload, Meta] extends js.Object {
  
  var meta: js.UndefOr[
    (js.Function3[
      /* action */ RSAAAction[_, _, _], 
      /* state */ State, 
      /* res */ Response, 
      Meta | js.Promise[Meta]
    ]) | Meta
  ] = js.native
  
  var payload: js.UndefOr[
    (js.Function3[
      /* action */ RSAAAction[_, _, _], 
      /* state */ State, 
      /* res */ Response, 
      Payload | js.Promise[Payload]
    ]) | Payload
  ] = js.native
  
  var `type`: String | js.Symbol = js.native
}
object RSAASuccessTypeDescriptor {
  
  @scala.inline
  def apply[State, Payload, Meta](`type`: String | js.Symbol): RSAASuccessTypeDescriptor[State, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAASuccessTypeDescriptor[State, Payload, Meta]]
  }
  
  @scala.inline
  implicit class RSAASuccessTypeDescriptorOps[Self <: RSAASuccessTypeDescriptor[_, _, _], State, Payload, Meta] (val x: Self with (RSAASuccessTypeDescriptor[State, Payload, Meta])) extends AnyVal {
    
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
    def setType(value: String | js.Symbol): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaFunction3(
      value: (/* action */ RSAAAction[_, _, _], /* state */ State, /* res */ Response) => Meta | js.Promise[Meta]
    ): Self = this.set("meta", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMeta(
      value: (js.Function3[
          /* action */ RSAAAction[_, _, _], 
          /* state */ State, 
          /* res */ Response, 
          Meta | js.Promise[Meta]
        ]) | Meta
    ): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setPayloadFunction3(
      value: (/* action */ RSAAAction[_, _, _], /* state */ State, /* res */ Response) => Payload | js.Promise[Payload]
    ): Self = this.set("payload", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPayload(
      value: (js.Function3[
          /* action */ RSAAAction[_, _, _], 
          /* state */ State, 
          /* res */ Response, 
          Payload | js.Promise[Payload]
        ]) | Payload
    ): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}
