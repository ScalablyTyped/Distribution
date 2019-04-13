package typings
package reactDashColorLib.reactDashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def CustomPicker[A](
    component: reactLib.reactMod.ComponentClass[
      A with reactDashColorLib.libComponentsCommonColorWrapMod.InjectedColorProps, 
      reactLib.reactMod.ComponentState
    ]
  ): reactLib.reactMod.ComponentClass[
    A with reactDashColorLib.libComponentsCommonColorWrapMod.ExportedColorProps, 
    reactLib.reactMod.ComponentState
  ] = js.native
  def CustomPicker[A](
    component: reactLib.reactMod.StatelessComponent[A with reactDashColorLib.libComponentsCommonColorWrapMod.InjectedColorProps]
  ): reactLib.reactMod.ComponentClass[
    A with reactDashColorLib.libComponentsCommonColorWrapMod.ExportedColorProps, 
    reactLib.reactMod.ComponentState
  ] = js.native
}

