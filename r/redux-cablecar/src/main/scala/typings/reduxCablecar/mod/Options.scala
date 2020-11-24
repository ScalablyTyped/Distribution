package typings.reduxCablecar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var connected: js.UndefOr[js.Function0[Unit]] = js.native
  
  var disconnected: js.UndefOr[js.Function0[Unit]] = js.native
  
  var optimisticOnFail: js.UndefOr[Boolean] = js.native
  
  var params: js.UndefOr[js.Object] = js.native
  
  var prefix: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setConnected(value: () => Unit): Self = this.set("connected", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteConnected: Self = this.set("connected", js.undefined)
    
    @scala.inline
    def setDisconnected(value: () => Unit): Self = this.set("disconnected", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisconnected: Self = this.set("disconnected", js.undefined)
    
    @scala.inline
    def setOptimisticOnFail(value: Boolean): Self = this.set("optimisticOnFail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimisticOnFail: Self = this.set("optimisticOnFail", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
