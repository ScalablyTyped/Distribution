package typings.reactBlessed

import typings.blessed.mod.Widgets.Screen
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-blessed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createBlessedRenderer(bls: js.Any): renderer = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlessedRenderer")(bls.asInstanceOf[js.Any]).asInstanceOf[renderer]
  
  @scala.inline
  def render(c: Element, s: Screen): (Component[js.Any, js.Any, js.Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(c.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[(Component[js.Any, js.Any, js.Any]) | Null]
  @scala.inline
  def render(c: Element, s: Screen, callback: Callback): (Component[js.Any, js.Any, js.Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(c.asInstanceOf[js.Any], s.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[(Component[js.Any, js.Any, js.Any]) | Null]
  
  type Callback = js.Function0[js.UndefOr[Unit | Null]]
  
  type renderer = js.Function3[
    /* c */ Element, 
    /* s */ Screen, 
    /* callback */ js.UndefOr[Callback], 
    (Component[js.Any, js.Any, js.Any]) | Null
  ]
}
