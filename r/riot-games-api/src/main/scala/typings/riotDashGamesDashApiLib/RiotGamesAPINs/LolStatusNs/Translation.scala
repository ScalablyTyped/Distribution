package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStatusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translation extends js.Object {
  var content: java.lang.String
  var locale: java.lang.String
  var updated_at: java.lang.String
}

object Translation {
  @scala.inline
  def apply(content: java.lang.String, locale: java.lang.String, updated_at: java.lang.String): Translation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("locale")(locale)
    __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[Translation]
  }
}

