package typings.reactAxe

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAfterMod {
  
  inline def apply(host: Component[js.Object, js.Object, Any], name: String, cb: js.Function): Unit = (^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any], name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("react-axe/dist/after", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-axe/dist/after", "restorePatchedMethods")
  @js.native
  def restorePatchedMethods: js.Function0[Unit] = js.native
  inline def restorePatchedMethods_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restorePatchedMethods")(x.asInstanceOf[js.Any])
}
