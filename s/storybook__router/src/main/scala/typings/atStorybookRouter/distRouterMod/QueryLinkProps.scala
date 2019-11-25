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
  def apply(to: String, children: ReactNode = null): QueryLinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLinkProps]
  }
}

