package typings
package simplecrawlerLib.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteInfo extends js.Object {
  var address: java.lang.String
  var family: java.lang.String
  var port: scala.Double
}

object RemoteInfo {
  @scala.inline
  def apply(address: java.lang.String, family: java.lang.String, port: scala.Double): RemoteInfo = {
    val __obj = js.Dynamic.literal(address = address, family = family, port = port)
  
    __obj.asInstanceOf[RemoteInfo]
  }
}

