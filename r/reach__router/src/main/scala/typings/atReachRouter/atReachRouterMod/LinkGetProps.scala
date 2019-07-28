package typings.atReachRouter.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkGetProps extends js.Object {
  var href: String
  var isCurrent: Boolean
  var isPartiallyCurrent: Boolean
  var location: WindowLocation
}

object LinkGetProps {
  @scala.inline
  def apply(href: String, isCurrent: Boolean, isPartiallyCurrent: Boolean, location: WindowLocation): LinkGetProps = {
    val __obj = js.Dynamic.literal(href = href, isCurrent = isCurrent, isPartiallyCurrent = isPartiallyCurrent, location = location)
  
    __obj.asInstanceOf[LinkGetProps]
  }
}

