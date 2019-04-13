package typings
package atStorybookRouterLib.distRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLocationProps extends js.Object {
  def children(renderData: RenderData): reactLib.reactMod.ReactNode
}

object QueryLocationProps {
  @scala.inline
  def apply(children: RenderData => reactLib.reactMod.ReactNode): QueryLocationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[QueryLocationProps]
  }
}

