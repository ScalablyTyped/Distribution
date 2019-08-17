package typings.reduxDashAuthDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashAuthDashWrapperMod {
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.ComponentType

  type AuthWrapperDecorator[Props] = js.Function1[/* component */ ComponentType[Props], ComponentClass[Props, ComponentState]]
  type StateSelector[State, OwnProps, R] = js.Function2[/* state */ State, /* props */ OwnProps, R]
}
