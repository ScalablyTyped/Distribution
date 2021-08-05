package typings.saucelabs.mod

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SauceConnectInstance extends StObject {
  
  /**
    * shutdown Sauce Connect
    */
  def close(): js.Promise[Unit]
  
  /**
    * Sauce Connect child process
    */
  var cp: ChildProcess
}
object SauceConnectInstance {
  
  inline def apply(close: () => js.Promise[Unit], cp: ChildProcess): SauceConnectInstance = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), cp = cp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SauceConnectInstance]
  }
  
  extension [Self <: SauceConnectInstance](x: Self) {
    
    inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCp(value: ChildProcess): Self = StObject.set(x, "cp", value.asInstanceOf[js.Any])
  }
}
