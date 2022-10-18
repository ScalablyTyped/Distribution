package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Visibility")
@js.native
open class Visibility protected () extends Component[VisibilityProps, ComponentState, Any] {
  def this(props: VisibilityProps) = this()
  def this(props: VisibilityProps, context: Any) = this()
}
object Visibility {
  
  inline def apply: ComponentClass[VisibilityProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("Visibility").asInstanceOf[ComponentClass[VisibilityProps, ComponentState]]
}
