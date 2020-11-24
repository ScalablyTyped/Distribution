package typings.reactRelay.entryPointTypesMod

import typings.relayRuntime.relayConcreteNodeMod.RequestParameters
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreloadableConcreteRequest[TQuery /* <: OperationType */] extends js.Object {
  
  var kind: typings.reactRelay.reactRelayStrings.PreloadableConcreteRequest = js.native
  
  var params: RequestParameters = js.native
}
object PreloadableConcreteRequest {
  
  @scala.inline
  def apply[TQuery /* <: OperationType */](kind: typings.reactRelay.reactRelayStrings.PreloadableConcreteRequest, params: RequestParameters): PreloadableConcreteRequest[TQuery] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadableConcreteRequest[TQuery]]
  }
  
  @scala.inline
  implicit class PreloadableConcreteRequestOps[Self <: PreloadableConcreteRequest[_], TQuery /* <: OperationType */] (val x: Self with PreloadableConcreteRequest[TQuery]) extends AnyVal {
    
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
    def setKind(value: typings.reactRelay.reactRelayStrings.PreloadableConcreteRequest): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: RequestParameters): Self = this.set("params", value.asInstanceOf[js.Any])
  }
}
