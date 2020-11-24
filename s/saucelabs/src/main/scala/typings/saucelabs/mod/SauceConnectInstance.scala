package typings.saucelabs.mod

import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SauceConnectInstance extends js.Object {
  
  /**
    * shutdown Sauce Connect
    */
  def close(): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  
  /**
    * Sauce Connect child process
    */
  var cp: ChildProcess = js.native
}
object SauceConnectInstance {
  
  @scala.inline
  def apply(close: () => js.Promise[js.UndefOr[scala.Nothing]], cp: ChildProcess): SauceConnectInstance = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), cp = cp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SauceConnectInstance]
  }
  
  @scala.inline
  implicit class SauceConnectInstanceOps[Self <: SauceConnectInstance] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => js.Promise[js.UndefOr[scala.Nothing]]): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCp(value: ChildProcess): Self = this.set("cp", value.asInstanceOf[js.Any])
  }
}
