package typings.reactRouterDom.mod

import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.std.HTMLAnchorElement
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-dom", "Link")
@js.native
object Link extends js.Object {
  def apply[S](
    // TODO: Define this as ...params: Parameters<Link<S>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[LinkProps[S]] with RefAttributes[HTMLAnchorElement]
  ): ReturnType[Link[S]] = js.native
}

