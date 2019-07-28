package typings.raygun4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var Host: String
  var Referer: String
  var `User-Agent`: String
}

object Anon_Host {
  @scala.inline
  def apply(Host: String, Referer: String, `User-Agent`: String): Anon_Host = {
    val __obj = js.Dynamic.literal(Host = Host, Referer = Referer)
    __obj.updateDynamic("User-Agent")(`User-Agent`)
    __obj.asInstanceOf[Anon_Host]
  }
}

