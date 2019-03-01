package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageDto extends js.Object {
  var full: java.lang.String
  var group: java.lang.String
  var h: scala.Double
  var sprite: java.lang.String
  var w: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object ImageDto {
  @scala.inline
  def apply(
    full: java.lang.String,
    group: java.lang.String,
    h: scala.Double,
    sprite: java.lang.String,
    w: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): ImageDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("full")(full)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("sprite")(sprite)
    __obj.updateDynamic("w")(w)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[ImageDto]
  }
}

