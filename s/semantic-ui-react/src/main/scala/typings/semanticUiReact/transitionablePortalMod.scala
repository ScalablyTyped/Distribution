package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionablePortalMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/addons/TransitionablePortal", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[TransitionablePortalProps, ComponentState, js.Any] {
    def this(props: TransitionablePortalProps) = this()
    def this(props: TransitionablePortalProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/TransitionablePortal", JSImport.Default)
  @js.native
  val default: ComponentClass[TransitionablePortalProps, ComponentState] = js.native
  
  type _To = ComponentClass[TransitionablePortalProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `transitionablePortalMod.foo` */
  override def _to: ComponentClass[TransitionablePortalProps, ComponentState] = default
}
