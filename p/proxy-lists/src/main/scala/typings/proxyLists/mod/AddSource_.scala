package typings.proxyLists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSource_ extends js.Object {
  
  def getProxies(options: InternalOptions): GetProxiesEventEmitter = js.native
  
  var homeUrl: String = js.native
}
object AddSource_ {
  
  @scala.inline
  def apply(getProxies: InternalOptions => GetProxiesEventEmitter, homeUrl: String): AddSource_ = {
    val __obj = js.Dynamic.literal(getProxies = js.Any.fromFunction1(getProxies), homeUrl = homeUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSource_]
  }
  
  @scala.inline
  implicit class AddSource_Ops[Self <: AddSource_] (val x: Self) extends AnyVal {
    
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
    def setGetProxies(value: InternalOptions => GetProxiesEventEmitter): Self = this.set("getProxies", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHomeUrl(value: String): Self = this.set("homeUrl", value.asInstanceOf[js.Any])
  }
}
