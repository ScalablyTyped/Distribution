package typings.reactDashFns

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[
    /* component */ CompositeComponent[TMergedProps], 
    ComponentClass[TOwnProps, ComponentState]
  ]
  type CompositeComponent[P] = (ComponentClass[P, ComponentState]) | StatelessComponent[P]
  type InferableComponentDecorator[TOwnProps] = js.Function1[/* component */ CompositeComponent[TOwnProps], CompositeComponent[TOwnProps]]
}
