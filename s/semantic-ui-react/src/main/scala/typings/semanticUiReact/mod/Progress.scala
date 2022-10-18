package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsModulesProgressProgressMod.ProgressProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Progress")
@js.native
open class Progress protected () extends Component[ProgressProps, ComponentState, Any] {
  def this(props: ProgressProps) = this()
  def this(props: ProgressProps, context: Any) = this()
}
object Progress {
  
  inline def apply: ComponentClass[ProgressProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("Progress").asInstanceOf[ComponentClass[ProgressProps, ComponentState]]
}
