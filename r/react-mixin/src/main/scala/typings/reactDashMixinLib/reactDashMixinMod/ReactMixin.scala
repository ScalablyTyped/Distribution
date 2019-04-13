package typings
package reactDashMixinLib.reactDashMixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactMixin extends js.Object {
  def apply[S](clazz: js.Any, mixin: reactLib.reactMod.Mixin[_, _]): reactLib.reactMod.ComponentClass[S, reactLib.reactMod.ComponentState] = js.native
  def decorate(mixin: reactLib.reactMod.Mixin[_, _]): ClassDecorator = js.native
  def onClass[S](clazz: js.Any, mixin: reactLib.reactMod.Mixin[_, _]): reactLib.reactMod.ComponentClass[S, reactLib.reactMod.ComponentState] = js.native
}

