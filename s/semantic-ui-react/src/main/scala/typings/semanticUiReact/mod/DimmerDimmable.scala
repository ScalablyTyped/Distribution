package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.dimmerDimmableMod.DimmerDimmableProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "DimmerDimmable")
@js.native
class DimmerDimmable protected ()
  extends Component[DimmerDimmableProps, ComponentState, js.Any] {
  def this(props: DimmerDimmableProps) = this()
  def this(props: DimmerDimmableProps, context: js.Any) = this()
}
object DimmerDimmable {
  
  @scala.inline
  def apply: ComponentClass[DimmerDimmableProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("DimmerDimmable").asInstanceOf[ComponentClass[DimmerDimmableProps, ComponentState]]
}
