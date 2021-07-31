package typings.reactAddonsPureRenderMixin

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Mixin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-addons-pure-render-mixin", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PureRenderMixin = js.native
  
  type PureRenderMixin = Mixin[js.Any, js.Any]
  
  type _To = js.Object & PureRenderMixin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & PureRenderMixin = ^
}
