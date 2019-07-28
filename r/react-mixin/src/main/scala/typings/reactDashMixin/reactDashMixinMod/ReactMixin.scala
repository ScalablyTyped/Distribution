package typings.reactDashMixin.reactDashMixinMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Mixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactMixin extends js.Object {
  def apply[S](clazz: js.Any, mixin: Mixin[_, _]): ComponentClass[S, ComponentState] = js.native
  def decorate(mixin: Mixin[_, _]): ClassDecorator = js.native
  def onClass[S](clazz: js.Any, mixin: Mixin[_, _]): ComponentClass[S, ComponentState] = js.native
}

