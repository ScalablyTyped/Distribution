package typings.atStorybookRouter.distRouterMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLinkProps extends js.Object {
  var children: ReactNode
  var to: String
}

object QueryLinkProps {
  @scala.inline
  def apply(children: ReactNode, to: String): QueryLinkProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], to = to)
  
    __obj.asInstanceOf[QueryLinkProps]
  }
}

