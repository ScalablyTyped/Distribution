package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.mod.^
import typings.semanticUiReact.sidebarSidebarMod.SidebarComponent
import typings.semanticUiReact.sidebarSidebarMod.SidebarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Sidebar")
@js.native
class Sidebar protected ()
  extends Component[SidebarProps, ComponentState, js.Any] {
  def this(props: SidebarProps) = this()
  def this(props: SidebarProps, context: js.Any) = this()
}
object Sidebar {
  
  inline def apply: SidebarComponent = ^.asInstanceOf[js.Dynamic].selectDynamic("Sidebar").asInstanceOf[SidebarComponent]
}
