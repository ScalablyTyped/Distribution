package typings.reactRouterBootstrap

import org.scalablytyped.runtime.Shortcut
import typings.history.mod.LocationState
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactRouterDom.mod.NavLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkContainerMod extends Shortcut {
  
  @JSImport("react-router-bootstrap/lib/LinkContainer", JSImport.Default)
  @js.native
  val default: LinkContainer = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-router-bootstrap/lib/LinkContainer", JSImport.Default)
  @js.native
  class defaultCls protected ()
    extends Component[NavLinkProps[LocationState], ComponentState, js.Any] {
    def this(props: NavLinkProps[LocationState]) = this()
    def this(props: NavLinkProps[LocationState], context: js.Any) = this()
  }
  
  type LinkContainer = ComponentClass[NavLinkProps[LocationState], ComponentState]
  
  type _To = LinkContainer
  
  /* This means you don't have to write `default`, but can instead just say `linkContainerMod.foo` */
  override def _to: LinkContainer = default
}
