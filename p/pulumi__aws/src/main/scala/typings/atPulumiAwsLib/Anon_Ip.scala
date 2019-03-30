package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ip extends js.Object {
  var ip: java.lang.String
  var ipId: java.lang.String
  var subnetId: java.lang.String
}

object Anon_Ip {
  @scala.inline
  def apply(ip: java.lang.String, ipId: java.lang.String, subnetId: java.lang.String): Anon_Ip = {
    val __obj = js.Dynamic.literal(ip = ip, ipId = ipId, subnetId = subnetId)
  
    __obj.asInstanceOf[Anon_Ip]
  }
}

