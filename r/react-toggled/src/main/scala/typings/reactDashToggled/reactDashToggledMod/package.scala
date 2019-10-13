package typings.reactDashToggled

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashToggledMod {
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.ReactNode

  type ChildrenFunction = js.Function1[/* options */ TogglerStateAndHelpers, ReactNode]
  type ReactToggledInterface = ComponentClass[ReactToggledProps, ComponentState]
}
