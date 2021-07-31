package typings.reactMixin

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Mixin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-mixin", JSImport.Namespace)
  @js.native
  val ^ : ReactMixin = js.native
  
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | Unit]
  
  @js.native
  trait ReactMixin extends StObject {
    
    def apply[S](clazz: js.Any, mixin: Mixin[js.Any, js.Any]): ComponentClass[S, ComponentState] = js.native
    
    def decorate(mixin: Mixin[js.Any, js.Any]): ClassDecorator = js.native
    
    def onClass[S](clazz: js.Any, mixin: Mixin[js.Any, js.Any]): ComponentClass[S, ComponentState] = js.native
  }
  
  type _To = ReactMixin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ReactMixin = ^
}
