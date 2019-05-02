package typings
package simplecrawlerLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupAddress extends js.Object {
  var address: java.lang.String
  var family: scala.Double
}

object LookupAddress {
  @scala.inline
  def apply(address: java.lang.String, family: scala.Double): LookupAddress = {
    val __obj = js.Dynamic.literal(address = address, family = family)
  
    __obj.asInstanceOf[LookupAddress]
  }
}

