package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsModulesEmbedEmbedMod.EmbedProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Embed")
@js.native
open class Embed protected () extends Component[EmbedProps, ComponentState, Any] {
  def this(props: EmbedProps) = this()
  def this(props: EmbedProps, context: Any) = this()
}
object Embed {
  
  inline def apply: ComponentClass[EmbedProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("Embed").asInstanceOf[ComponentClass[EmbedProps, ComponentState]]
}
