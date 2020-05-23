package typings.reactAxe

import typings.axeCore.mod.Spec
import typings.reactAxe.anon.TypeofReact
import typings.reactAxe.anon.TypeofReactDOM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-axe", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(react: TypeofReact, reactDOM: TypeofReactDOM, timeout: Double): Unit = js.native
  def apply(react: TypeofReact, reactDOM: TypeofReactDOM, timeout: Double, config: ReactAxeConfig): Unit = js.native
  type ReactAxeConfig = Spec
}

