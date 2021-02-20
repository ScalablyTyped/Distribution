package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.stickyStickyMod.StickyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickyMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sticky", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[StickyProps, ComponentState, js.Any] {
    def this(props: StickyProps) = this()
    def this(props: StickyProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sticky", JSImport.Default)
  @js.native
  val default: ComponentClass[StickyProps, ComponentState] = js.native
  
  type _To = ComponentClass[StickyProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `stickyMod.foo` */
  override def _to: ComponentClass[StickyProps, ComponentState] = default
}
