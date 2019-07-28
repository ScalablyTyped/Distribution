package typings.riotDashGamesDashApi.RiotGamesAPINs.FeaturedGamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer extends js.Object {
  var encryptionKey: String
}

object Observer {
  @scala.inline
  def apply(encryptionKey: String): Observer = {
    val __obj = js.Dynamic.literal(encryptionKey = encryptionKey)
  
    __obj.asInstanceOf[Observer]
  }
}

