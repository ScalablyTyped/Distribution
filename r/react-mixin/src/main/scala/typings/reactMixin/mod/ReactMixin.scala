package typings.reactMixin.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Mixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactMixin extends js.Object {
  
  def apply[S](clazz: js.Any, mixin: Mixin[_, _]): ComponentClass[S, ComponentState] = js.native
  
  def decorate(mixin: Mixin[_, _]): ClassDecorator = js.native
  
  def onClass[S](clazz: js.Any, mixin: Mixin[_, _]): ComponentClass[S, ComponentState] = js.native
}
