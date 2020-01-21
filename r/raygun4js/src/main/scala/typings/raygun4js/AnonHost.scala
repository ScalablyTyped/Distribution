package typings.raygun4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends js.Object {
  var Host: String
  var Referer: String
  var `User-Agent`: String
}

object AnonHost {
  @scala.inline
  def apply(Host: String, Referer: String, `User-Agent`: String): AnonHost = {
    val __obj = js.Dynamic.literal(Host = Host.asInstanceOf[js.Any], Referer = Referer.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHost]
  }
}

