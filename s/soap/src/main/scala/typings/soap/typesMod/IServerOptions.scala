package typings.soap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServerOptions extends IWsdlBaseOptions {
  
  var callback: js.UndefOr[js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]] = js.native
  
  /** A boolean for controlling chunked transfer encoding in response. Some client (such as Windows 10's MDM enrollment SOAP client) is sensitive to transfer-encoding mode and can't accept chunked response. This option let user disable chunked transfer encoding for such a client. Default to true for backward compatibility. */
  var enableChunkedEncoding: js.UndefOr[Boolean] = js.native
  
  var oneWay: js.UndefOr[IOneWayOptions] = js.native
  
  var path: String = js.native
  
  var services: IServices = js.native
  
  /** suppress the full stack trace for error messages. */
  var suppressStack: js.UndefOr[Boolean] = js.native
  
  var uri: js.UndefOr[String] = js.native
  
  var xml: js.UndefOr[String] = js.native
}
object IServerOptions {
  
  @scala.inline
  def apply(path: String, services: IServices): IServerOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServerOptions]
  }
  
  @scala.inline
  implicit class IServerOptionsOps[Self <: IServerOptions] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServices(value: IServices): Self = this.set("services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback(value: (/* err */ js.Any, /* res */ js.Any) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setEnableChunkedEncoding(value: Boolean): Self = this.set("enableChunkedEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableChunkedEncoding: Self = this.set("enableChunkedEncoding", js.undefined)
    
    @scala.inline
    def setOneWay(value: IOneWayOptions): Self = this.set("oneWay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneWay: Self = this.set("oneWay", js.undefined)
    
    @scala.inline
    def setSuppressStack(value: Boolean): Self = this.set("suppressStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressStack: Self = this.set("suppressStack", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setXml(value: String): Self = this.set("xml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXml: Self = this.set("xml", js.undefined)
  }
}
