package typings.reactDashLive.reactDashLiveMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-live", "withLive")
@js.native
object withLive extends js.Object {
  def apply[P](wrappedComponent: ComponentType[P]): ComponentClass[P, ComponentState] = js.native
}

