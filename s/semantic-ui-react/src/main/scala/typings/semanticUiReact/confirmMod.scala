package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.confirmConfirmMod.ConfirmProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/addons/Confirm", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ConfirmProps, ComponentState, js.Any] {
    def this(props: ConfirmProps) = this()
    def this(props: ConfirmProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/Confirm", JSImport.Default)
  @js.native
  val default: ComponentClass[ConfirmProps, ComponentState] = js.native
  
  type _To = ComponentClass[ConfirmProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `confirmMod.foo` */
  override def _to: ComponentClass[ConfirmProps, ComponentState] = default
}
