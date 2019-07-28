package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IpAddresses extends js.Object {
  var ipAddresses: js.Array[String]
  var ipFamily: String
}

object Anon_IpAddresses {
  @scala.inline
  def apply(ipAddresses: js.Array[String], ipFamily: String): Anon_IpAddresses = {
    val __obj = js.Dynamic.literal(ipAddresses = ipAddresses, ipFamily = ipFamily)
  
    __obj.asInstanceOf[Anon_IpAddresses]
  }
}

