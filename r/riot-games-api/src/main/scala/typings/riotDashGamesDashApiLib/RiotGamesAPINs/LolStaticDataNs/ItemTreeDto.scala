package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemTreeDto extends js.Object {
  var header: java.lang.String
  var tags: js.Array[java.lang.String]
}

object ItemTreeDto {
  @scala.inline
  def apply(header: java.lang.String, tags: js.Array[java.lang.String]): ItemTreeDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("header")(header)
    __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ItemTreeDto]
  }
}

