package typings.reactDashToggled

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashToggledMod {
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.HTMLProps
  import typings.react.reactMod.ReactNode
  import typings.std.HTMLButtonElement
  import typings.std.HTMLElement
  import typings.std.HTMLInputElement

  type ChildrenFunction = js.Function1[/* options */ TogglerStateAndHelpers, ReactNode]
  type GetButtonPropsOptions = HTMLProps[HTMLButtonElement]
  type GetElementPropsOptions = HTMLProps[HTMLElement]
  type GetInputPropsOptions = HTMLProps[HTMLInputElement]
  type ReactToggledInterface = ComponentClass[ReactToggledProps, ComponentState]
}
