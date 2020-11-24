package typings.sailsIoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectConfig extends js.Object {
  
  var initialConnectionHeaders: js.UndefOr[InitialConnectionHeaders] = js.native
}
object ConnectConfig {
  
  @scala.inline
  def apply(): ConnectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectConfig]
  }
  
  @scala.inline
  implicit class ConnectConfigOps[Self <: ConnectConfig] (val x: Self) extends AnyVal {
    
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
    def setInitialConnectionHeaders(value: InitialConnectionHeaders): Self = this.set("initialConnectionHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialConnectionHeaders: Self = this.set("initialConnectionHeaders", js.undefined)
  }
}
