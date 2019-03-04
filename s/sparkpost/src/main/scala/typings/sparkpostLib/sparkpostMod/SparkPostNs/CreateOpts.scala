package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOpts extends js.Object {
  /**
    * Domain (or subdomain) name for which SparkPost will receive inbound emails
    *
    */
  var domain: java.lang.String
}

object CreateOpts {
  @scala.inline
  def apply(domain: java.lang.String): CreateOpts = {
    val __obj = js.Dynamic.literal(domain = domain)
  
    __obj.asInstanceOf[CreateOpts]
  }
}

