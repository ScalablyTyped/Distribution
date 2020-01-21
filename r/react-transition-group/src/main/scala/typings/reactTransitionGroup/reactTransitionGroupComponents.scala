package typings.reactTransitionGroup

import typings.react.mod.ComponentType
import typings.reactTransitionGroup.reactTransitionGroupStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactTransitionGroupComponents extends reactTransitionGroupProps {
  @scala.inline
  def CSSTransition: ComponentType[CSSTransitionProps] = js.constructorOf[typings.reactTransitionGroup.csstransitionMod.default].asInstanceOf[typings.react.mod.ComponentType[CSSTransitionProps]]
  @scala.inline
  def SwitchTransition: ComponentType[SwitchTransitionProps] = js.constructorOf[typings.reactTransitionGroup.switchTransitionMod.default].asInstanceOf[typings.react.mod.ComponentType[SwitchTransitionProps]]
  @scala.inline
  def Transition: ComponentType[TransitionProps] = js.constructorOf[typings.reactTransitionGroup.transitionMod.default].asInstanceOf[typings.react.mod.ComponentType[TransitionProps]]
  @scala.inline
  def TransitionGroup: ComponentType[TransitionGroupProps[div, js.Any]] = js.constructorOf[typings.reactTransitionGroup.transitionGroupMod.default].asInstanceOf[typings.react.mod.ComponentType[
  TransitionGroupProps[typings.reactTransitionGroup.reactTransitionGroupStrings.div, js.Any]]]
}

