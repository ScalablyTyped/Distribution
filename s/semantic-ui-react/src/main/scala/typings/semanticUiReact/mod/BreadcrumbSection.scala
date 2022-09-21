package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.breadcrumbSectionMod.BreadcrumbSectionProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "BreadcrumbSection")
@js.native
open class BreadcrumbSection protected () extends Component[BreadcrumbSectionProps, ComponentState, Any] {
  def this(props: BreadcrumbSectionProps) = this()
  def this(props: BreadcrumbSectionProps, context: Any) = this()
}
object BreadcrumbSection {
  
  inline def apply: ComponentClass[BreadcrumbSectionProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("BreadcrumbSection").asInstanceOf[ComponentClass[BreadcrumbSectionProps, ComponentState]]
}
