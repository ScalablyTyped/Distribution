package typings.reactTransitionGroup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object csstransitionMod {
  type CSSTransition[Ref /* <: js.UndefOr[typings.std.HTMLElement] */] = typings.react.mod.Component[
    typings.reactTransitionGroup.csstransitionMod.CSSTransitionProps[Ref], 
    js.Object, 
    js.Any
  ]
  type CSSTransitionProps[Ref /* <: js.UndefOr[typings.std.HTMLElement] */] = typings.reactTransitionGroup.transitionMod.TransitionProps[Ref] with typings.reactTransitionGroup.anon.ClassNames
}
