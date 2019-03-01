package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkinDto extends js.Object {
  var id: scala.Double
  var name: java.lang.String
  var num: scala.Double
}

object SkinDto {
  @scala.inline
  def apply(id: scala.Double, name: java.lang.String, num: scala.Double): SkinDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("num")(num)
    __obj.asInstanceOf[SkinDto]
  }
}

