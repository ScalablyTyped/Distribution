package typings.reactRouterDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  type Link[S] = typings.react.mod.ForwardRefExoticComponent[
    typings.react.mod.PropsWithoutRef[typings.reactRouterDom.mod.LinkProps[S]] with typings.react.mod.RefAttributes[typings.std.HTMLAnchorElement]
  ]
  type NavLink[S] = typings.react.mod.ForwardRefExoticComponent[
    typings.react.mod.PropsWithoutRef[typings.reactRouterDom.mod.NavLinkProps[S]] with typings.react.mod.RefAttributes[typings.std.HTMLAnchorElement]
  ]
}
