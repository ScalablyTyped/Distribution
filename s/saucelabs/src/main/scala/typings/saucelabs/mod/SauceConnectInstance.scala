package typings.saucelabs.mod

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SauceConnectInstance extends StObject {
  
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
  implicit class SauceConnectInstanceMutableBuilder[Self <: SauceConnectInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => js.Promise[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCp(value: ChildProcess): Self = StObject.set(x, "cp", value.asInstanceOf[js.Any])
  }
}
