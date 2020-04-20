package typings.reactTransitionGroup

import typings.react.mod.ComponentType
import typings.reactTransitionGroup.csstransitionMod.default
import typings.reactTransitionGroup.reactTransitionGroupStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactTransitionGroupComponents extends reactTransitionGroupProps {
  @scala.inline
  def CSSTransition: ComponentType[CSSTransitionProps] = js.constructorOf[default].asInstanceOf[ComponentType[CSSTransitionProps]]
  @scala.inline
  def SwitchTransition: ComponentType[SwitchTransitionProps] = js.constructorOf[typings.reactTransitionGroup.switchTransitionMod.default].asInstanceOf[ComponentType[SwitchTransitionProps]]
  @scala.inline
  def Transition: ComponentType[TransitionProps] = js.constructorOf[typings.reactTransitionGroup.transitionMod.default].asInstanceOf[ComponentType[TransitionProps]]
  @scala.inline
  def TransitionGroup: ComponentType[TransitionGroupProps[div, js.Any]] = js.constructorOf[typings.reactTransitionGroup.transitionGroupMod.default].asInstanceOf[ComponentType[TransitionGroupProps[div, js.Any]]]
}

