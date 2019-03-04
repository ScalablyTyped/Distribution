package typings
package raygun4jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var Host: java.lang.String
  var Referer: java.lang.String
  var `User-Agent`: java.lang.String
}

object Anon_Host {
  @scala.inline
  def apply(Host: java.lang.String, Referer: java.lang.String, `User-Agent`: java.lang.String): Anon_Host = {
    val __obj = js.Dynamic.literal(Host = Host, Referer = Referer)
    __obj.updateDynamic("User-Agent")(`User-Agent`)
    __obj.asInstanceOf[Anon_Host]
  }
}

