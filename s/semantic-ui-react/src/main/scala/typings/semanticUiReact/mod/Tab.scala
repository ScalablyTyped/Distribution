package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.mod.^
import typings.semanticUiReact.tabTabMod.TabComponent
import typings.semanticUiReact.tabTabMod.TabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Tab")
@js.native
class Tab protected ()
  extends Component[TabProps, ComponentState, js.Any] {
  def this(props: TabProps) = this()
  def this(props: TabProps, context: js.Any) = this()
}
object Tab {
  
  inline def apply: TabComponent = ^.asInstanceOf[js.Dynamic].selectDynamic("Tab").asInstanceOf[TabComponent]
}
