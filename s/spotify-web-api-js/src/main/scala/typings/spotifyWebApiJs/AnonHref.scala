package typings.spotifyWebApiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHref extends js.Object {
  var href: String
  var total: Double
}

object AnonHref {
  @scala.inline
  def apply(href: String, total: Double): AnonHref = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHref]
  }
}

