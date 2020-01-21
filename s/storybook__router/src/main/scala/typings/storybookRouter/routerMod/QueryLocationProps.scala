package typings.storybookRouter.routerMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLocationProps extends js.Object {
  def children(renderData: RenderData): ReactNode
}

object QueryLocationProps {
  @scala.inline
  def apply(children: RenderData => ReactNode): QueryLocationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[QueryLocationProps]
  }
}

