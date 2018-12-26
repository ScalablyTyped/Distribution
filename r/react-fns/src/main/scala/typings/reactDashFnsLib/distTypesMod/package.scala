package typings
package reactDashFnsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[
    /* component */ CompositeComponent[TMergedProps], 
    reactLib.reactMod.ReactNs.ComponentClass[TOwnProps, reactLib.reactMod.ReactNs.ComponentState]
  ]
  type CompositeComponent[P] = (reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[P]
  type InferableComponentDecorator[TOwnProps] = js.Function1[/* component */ CompositeComponent[TOwnProps], CompositeComponent[TOwnProps]]
}
