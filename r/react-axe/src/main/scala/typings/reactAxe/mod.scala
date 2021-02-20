package typings.reactAxe

import typings.axeCore.mod.Spec
import typings.reactAxe.anon.TypeofReact
import typings.reactAxe.anon.TypeofReactDOM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-axe", JSImport.Namespace)
  @js.native
  def apply(react: TypeofReact, reactDOM: TypeofReactDOM, timeout: Double): Unit = js.native
  @JSImport("react-axe", JSImport.Namespace)
  @js.native
  def apply(react: TypeofReact, reactDOM: TypeofReactDOM, timeout: Double, config: ReactAxeConfig): Unit = js.native
  
  type ReactAxeConfig = Spec
}
