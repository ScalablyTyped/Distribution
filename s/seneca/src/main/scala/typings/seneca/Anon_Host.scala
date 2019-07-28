package typings.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object Anon_Host {
  @scala.inline
  def apply(host: String = null, port: Int | Double = null): Anon_Host = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Host]
  }
}

