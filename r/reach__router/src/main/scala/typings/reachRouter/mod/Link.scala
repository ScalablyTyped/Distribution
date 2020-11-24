package typings.reachRouter.mod

import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.std.HTMLAnchorElement
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@reach/router", "Link")
@js.native
object Link extends js.Object {
  
  def apply[TState](
    // TODO: Define this as ...params: Parameters<Link<TState>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[LinkProps[TState]] with RefAttributes[HTMLAnchorElement]
  ): ReturnType[Link[TState]] = js.native
}
