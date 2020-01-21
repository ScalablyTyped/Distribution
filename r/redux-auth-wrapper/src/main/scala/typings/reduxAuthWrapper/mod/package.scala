package typings.reduxAuthWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AuthWrapperDecorator[Props] = js.Function1[
    /* component */ typings.react.mod.ComponentType[Props], 
    typings.react.mod.ComponentClass[Props, typings.react.mod.ComponentState]
  ]
  type StateSelector[State, OwnProps, R] = js.Function2[/* state */ State, /* props */ OwnProps, R]
}
