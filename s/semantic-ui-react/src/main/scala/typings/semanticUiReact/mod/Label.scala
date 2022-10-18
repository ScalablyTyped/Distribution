package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsElementsLabelLabelMod.LabelComponent
import typings.semanticUiReact.distCommonjsElementsLabelLabelMod.LabelProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Label")
@js.native
open class Label protected () extends Component[LabelProps, ComponentState, Any] {
  def this(props: LabelProps) = this()
  def this(props: LabelProps, context: Any) = this()
}
object Label {
  
  inline def apply: LabelComponent = ^.asInstanceOf[js.Dynamic].selectDynamic("Label").asInstanceOf[LabelComponent]
}
