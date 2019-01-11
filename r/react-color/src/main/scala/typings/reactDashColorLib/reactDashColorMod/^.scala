package typings
package reactDashColorLib.reactDashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def CustomPicker[A](
    component: reactLib.reactMod.ReactNs.ComponentClass[
      A with reactDashColorLib.libComponentsCommonColorWrapMod.InjectedColorProps, 
      reactLib.reactMod.ReactNs.ComponentState
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[
    A with reactDashColorLib.libComponentsCommonColorWrapMod.ExportedColorProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def CustomPicker[A](
    component: reactLib.reactMod.ReactNs.StatelessComponent[A with reactDashColorLib.libComponentsCommonColorWrapMod.InjectedColorProps]
  ): reactLib.reactMod.ReactNs.ComponentClass[
    A with reactDashColorLib.libComponentsCommonColorWrapMod.ExportedColorProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
}

