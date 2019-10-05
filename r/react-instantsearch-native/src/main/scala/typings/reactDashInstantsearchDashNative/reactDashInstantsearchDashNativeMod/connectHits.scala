package typings.reactDashInstantsearchDashNative.reactDashInstantsearchDashNativeMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectedComponentClass
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.HitsProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectHits")
@js.native
object connectHits extends js.Object {
  def apply[THit](stateless: StatelessComponent[HitsProvided[THit]]): ComponentClass[js.Object, ComponentState] = js.native
  def apply[TProps /* <: HitsProvided[THit] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HitsProvided[THit], js.Object] = js.native
}

