package typings.reactBlessed

import typings.blessed.mod.Widgets.Screen
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-blessed", "createBlessedRenderer")
  @js.native
  def createBlessedRenderer(bls: js.Any): renderer = js.native
  
  @JSImport("react-blessed", "render")
  @js.native
  def render(c: Element, s: Screen): (Component[_, _, _]) | Null = js.native
  @JSImport("react-blessed", "render")
  @js.native
  def render(c: Element, s: Screen, callback: Callback): (Component[_, _, _]) | Null = js.native
  
  type Callback = js.Function0[js.UndefOr[Unit | Null]]
  
  type renderer = js.Function3[
    /* c */ Element, 
    /* s */ Screen, 
    /* callback */ js.UndefOr[Callback], 
    (Component[js.Any, js.Any, js.Any]) | Null
  ]
}
