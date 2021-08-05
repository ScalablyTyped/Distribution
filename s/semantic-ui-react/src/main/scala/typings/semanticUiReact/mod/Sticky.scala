package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.mod.^
import typings.semanticUiReact.stickyStickyMod.StickyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Sticky")
@js.native
class Sticky protected ()
  extends Component[StickyProps, ComponentState, js.Any] {
  def this(props: StickyProps) = this()
  def this(props: StickyProps, context: js.Any) = this()
}
object Sticky {
  
  inline def apply: ComponentClass[StickyProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("Sticky").asInstanceOf[ComponentClass[StickyProps, ComponentState]]
}
