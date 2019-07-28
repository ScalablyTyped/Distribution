package typings.atStorybookRouter.distRouterMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var hideOnly: Boolean
  var path: String
  var startsWith: Boolean
  def children(renderData: RenderData): ReactNode
}

object RouteProps {
  @scala.inline
  def apply(children: RenderData => ReactNode, hideOnly: Boolean, path: String, startsWith: Boolean): RouteProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), hideOnly = hideOnly, path = path, startsWith = startsWith)
  
    __obj.asInstanceOf[RouteProps]
  }
}

