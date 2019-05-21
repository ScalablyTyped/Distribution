package typings
package atReachRouterLib.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationProps extends js.Object {
  var children: LocationProviderRenderFn
}

object LocationProps {
  @scala.inline
  def apply(children: LocationProviderRenderFn): LocationProps = {
    val __obj = js.Dynamic.literal(children = children)
  
    __obj.asInstanceOf[LocationProps]
  }
}

