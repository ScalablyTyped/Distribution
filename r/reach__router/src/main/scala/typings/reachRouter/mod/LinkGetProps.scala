package typings.reachRouter.mod

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
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], isCurrent = isCurrent.asInstanceOf[js.Any], isPartiallyCurrent = isPartiallyCurrent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LinkGetProps]
  }
}

