package typings
package reduxDashAuthDashWrapperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashAuthDashWrapperMod {
  type AuthWrapperDecorator[Props] = js.Function1[
    /* component */ reactLib.reactMod.ComponentType[Props], 
    reactLib.reactMod.ComponentClass[Props, reactLib.reactMod.ComponentState]
  ]
  type StateSelector[State, OwnProps, R] = js.Function2[/* state */ State, /* props */ OwnProps, R]
}
