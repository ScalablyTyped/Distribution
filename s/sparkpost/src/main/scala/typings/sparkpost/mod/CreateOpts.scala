package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOpts extends js.Object {
  /**
    * Domain (or subdomain) name for which SparkPost will receive inbound emails
    *
    */
  var domain: String
}

object CreateOpts {
  @scala.inline
  def apply(domain: String): CreateOpts = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateOpts]
  }
}

