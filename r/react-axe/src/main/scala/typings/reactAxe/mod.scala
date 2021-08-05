package typings.reactAxe

import typings.axeCore.mod.Spec
import typings.reactAxe.anon.TypeofReact
import typings.reactAxe.anon.TypeofReactDOM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(react: TypeofReact, reactDOM: TypeofReactDOM, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(react.asInstanceOf[js.Any], reactDOM.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(react: TypeofReact, reactDOM: TypeofReactDOM, timeout: Double, config: ReactAxeConfig): Unit = (^.asInstanceOf[js.Dynamic].apply(react.asInstanceOf[js.Any], reactDOM.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("react-axe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ReactAxeConfig = Spec
}
