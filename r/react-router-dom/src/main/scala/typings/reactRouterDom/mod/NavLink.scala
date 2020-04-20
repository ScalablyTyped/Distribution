package typings.reactRouterDom.mod

import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.std.HTMLAnchorElement
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-dom", "NavLink")
@js.native
object NavLink extends js.Object {
  def apply[S](
    // TODO: Define this as ...params: Parameters<NavLink<S>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[NavLinkProps[S]] with RefAttributes[HTMLAnchorElement]
  ): ReturnType[NavLink[S]] = js.native
}

