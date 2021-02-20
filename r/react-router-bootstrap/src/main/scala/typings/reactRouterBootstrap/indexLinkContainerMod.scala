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

object indexLinkContainerMod extends Shortcut {
  
  @JSImport("react-router-bootstrap/lib/IndexLinkContainer", JSImport.Default)
  @js.native
  val default: IndexLinkContainer = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-router-bootstrap/lib/IndexLinkContainer", JSImport.Default)
  @js.native
  class defaultCls protected ()
    extends Component[NavLinkProps[LocationState], ComponentState, js.Any] {
    def this(props: NavLinkProps[LocationState]) = this()
    def this(props: NavLinkProps[LocationState], context: js.Any) = this()
  }
  
  //IndexLink is removed in react-router, but continues there in react-router-bootstrap for backwards compatibility.
  //Better use <LinkContainer exact/>
  type IndexLinkContainer = ComponentClass[NavLinkProps[LocationState], ComponentState]
  
  type _To = IndexLinkContainer
  
  /* This means you don't have to write `default`, but can instead just say `indexLinkContainerMod.foo` */
  override def _to: IndexLinkContainer = default
}
