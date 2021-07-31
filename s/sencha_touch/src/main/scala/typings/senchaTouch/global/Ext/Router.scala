package typings.senchaTouch.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Router")
@js.native
class Router ()
  extends StObject
     with typings.senchaTouch.Ext.Router
/* static members */
object Router {
  
  @JSGlobal("Ext.Router")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Application s onDependenciesLoaded has a deprecated wrapped line that calls this
    * @param app Object
    */
  @scala.inline
  def setAppInstance(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAppInstance")().asInstanceOf[Unit]
  @scala.inline
  def setAppInstance(app: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAppInstance")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
