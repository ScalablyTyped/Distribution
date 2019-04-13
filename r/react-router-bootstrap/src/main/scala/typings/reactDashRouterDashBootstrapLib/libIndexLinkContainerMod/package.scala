package typings
package reactDashRouterDashBootstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIndexLinkContainerMod {
  //IndexLink is removed in react-router, but continues there in react-router-bootstrap for backwards compatibility.
  //Better use <LinkContainer exact/>
  type IndexLinkContainer = reactLib.reactMod.ComponentClass[
    reactDashRouterDashDomLib.reactDashRouterDashDomMod.NavLinkProps, 
    reactLib.reactMod.ComponentState
  ]
}
