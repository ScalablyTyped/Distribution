package typings.reconnectCore.mod

import typings.backoff.mod.Backoff
import typings.backoff.mod.ExponentialOptions
import typings.reconnectCore.reconnectCoreStrings.exponential
import typings.reconnectCore.reconnectCoreStrings.fibonacci
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleOptions[ConnectionType] extends ExponentialOptions {
  
  var failAfter: js.UndefOr[Double] = js.native
  
  var immediate: js.UndefOr[Boolean] = js.native
  
  var onConnect: js.UndefOr[js.Function1[/* con */ ConnectionType, Unit]] = js.native
  
  var strategy: js.UndefOr[fibonacci | exponential | Backoff] = js.native
}
object ModuleOptions {
  
  @scala.inline
  def apply[ConnectionType](): ModuleOptions[ConnectionType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleOptions[ConnectionType]]
  }
  
  @scala.inline
  implicit class ModuleOptionsOps[Self <: ModuleOptions[_], ConnectionType] (val x: Self with ModuleOptions[ConnectionType]) extends AnyVal {
    
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
    def setFailAfter(value: Double): Self = this.set("failAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailAfter: Self = this.set("failAfter", js.undefined)
    
    @scala.inline
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
    
    @scala.inline
    def setOnConnect(value: /* con */ ConnectionType => Unit): Self = this.set("onConnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnConnect: Self = this.set("onConnect", js.undefined)
    
    @scala.inline
    def setStrategy(value: fibonacci | exponential | Backoff): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
}
