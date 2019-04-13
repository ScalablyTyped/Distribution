package typings
package atStorybookRouterLib.distRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var hideOnly: scala.Boolean
  var path: java.lang.String
  var startsWith: scala.Boolean
  def children(renderData: RenderData): reactLib.reactMod.ReactNode
}

object RouteProps {
  @scala.inline
  def apply(
    children: RenderData => reactLib.reactMod.ReactNode,
    hideOnly: scala.Boolean,
    path: java.lang.String,
    startsWith: scala.Boolean
  ): RouteProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), hideOnly = hideOnly, path = path, startsWith = startsWith)
  
    __obj.asInstanceOf[RouteProps]
  }
}

