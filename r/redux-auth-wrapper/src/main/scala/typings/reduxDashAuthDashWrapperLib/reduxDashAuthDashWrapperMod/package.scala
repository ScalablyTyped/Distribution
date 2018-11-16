package typings
package reduxDashAuthDashWrapperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashAuthDashWrapperMod {
  type AuthWrapperDecorator[Props] = js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[Props], 
    reactLib.reactMod.ReactNs.ComponentClass[Props, reactLib.reactMod.ReactNs.ComponentState]
  ]
  type StateSelector[State, OwnProps, R] = js.Function2[/* state */ State, /* props */ OwnProps, R]
}
