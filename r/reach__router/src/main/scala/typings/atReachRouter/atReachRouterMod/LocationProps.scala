package typings.atReachRouter.atReachRouterMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationProps extends js.Object {
  var children: LocationProviderRenderFn
}

object LocationProps {
  @scala.inline
  def apply(children: /* context */ LocationContext => ReactNode): LocationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[LocationProps]
  }
}

