package typings.reduxSentryMiddleware.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.sentryBrowser.mod.Transports.BaseTransport
import typings.sentryBrowser.mod.Transports.FetchTransport
import typings.sentryBrowser.mod.Transports.XHRTransport
import typings.sentryTypes.transportMod.TransportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTransports extends js.Object {
  
  var BaseTransport: Instantiable1[/* options */ TransportOptions, typings.sentryBrowser.mod.Transports.BaseTransport] = js.native
  
  var FetchTransport: Instantiable0[typings.sentryBrowser.mod.Transports.FetchTransport] = js.native
  
  var XHRTransport: Instantiable0[typings.sentryBrowser.mod.Transports.XHRTransport] = js.native
}
object TypeofTransports {
  
  @scala.inline
  def apply(
    BaseTransport: Instantiable1[/* options */ TransportOptions, BaseTransport],
    FetchTransport: Instantiable0[FetchTransport],
    XHRTransport: Instantiable0[XHRTransport]
  ): TypeofTransports = {
    val __obj = js.Dynamic.literal(BaseTransport = BaseTransport.asInstanceOf[js.Any], FetchTransport = FetchTransport.asInstanceOf[js.Any], XHRTransport = XHRTransport.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTransports]
  }
  
  @scala.inline
  implicit class TypeofTransportsOps[Self <: TypeofTransports] (val x: Self) extends AnyVal {
    
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
    def setBaseTransport(value: Instantiable1[/* options */ TransportOptions, BaseTransport]): Self = this.set("BaseTransport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchTransport(value: Instantiable0[FetchTransport]): Self = this.set("FetchTransport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXHRTransport(value: Instantiable0[XHRTransport]): Self = this.set("XHRTransport", value.asInstanceOf[js.Any])
  }
}
