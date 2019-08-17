package typings.reactDashRouterDashBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIndexLinkContainerMod {
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.reactDashRouterDashDom.reactDashRouterDashDomMod.NavLinkProps

  //IndexLink is removed in react-router, but continues there in react-router-bootstrap for backwards compatibility.
  //Better use <LinkContainer exact/>
  type IndexLinkContainer = ComponentClass[NavLinkProps, ComponentState]
}
