package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ip extends js.Object {
  var ip: String
  var ipId: String
  var subnetId: String
}

object Anon_Ip {
  @scala.inline
  def apply(ip: String, ipId: String, subnetId: String): Anon_Ip = {
    val __obj = js.Dynamic.literal(ip = ip, ipId = ipId, subnetId = subnetId)
  
    __obj.asInstanceOf[Anon_Ip]
  }
}

