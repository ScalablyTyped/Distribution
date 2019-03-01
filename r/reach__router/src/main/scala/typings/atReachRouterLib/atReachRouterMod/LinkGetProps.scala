package typings
package atReachRouterLib.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkGetProps extends js.Object {
  var href: java.lang.String
  var isCurrent: scala.Boolean
  var isPartiallyCurrent: scala.Boolean
  var location: WindowLocation
}

object LinkGetProps {
  @scala.inline
  def apply(
    href: java.lang.String,
    isCurrent: scala.Boolean,
    isPartiallyCurrent: scala.Boolean,
    location: WindowLocation
  ): LinkGetProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("isCurrent")(isCurrent)
    __obj.updateDynamic("isPartiallyCurrent")(isPartiallyCurrent)
    __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[LinkGetProps]
  }
}

