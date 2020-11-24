package typings.reactRouterBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object indexLinkContainerMod {
  
  //IndexLink is removed in react-router, but continues there in react-router-bootstrap for backwards compatibility.
  //Better use <LinkContainer exact/>
  type IndexLinkContainer = typings.react.mod.ComponentClass[
    typings.reactRouterDom.mod.NavLinkProps[typings.history.mod.LocationState], 
    typings.react.mod.ComponentState
  ]
}
