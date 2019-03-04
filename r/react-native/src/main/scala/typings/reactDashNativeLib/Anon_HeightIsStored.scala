package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightIsStored extends js.Object {
  var height: scala.Double
  var isStored: js.UndefOr[scala.Boolean] = js.undefined
  var playableDuration: scala.Double
  var uri: java.lang.String
  var width: scala.Double
}

object Anon_HeightIsStored {
  @scala.inline
  def apply(
    height: scala.Double,
    playableDuration: scala.Double,
    uri: java.lang.String,
    width: scala.Double,
    isStored: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_HeightIsStored = {
    val __obj = js.Dynamic.literal(height = height, playableDuration = playableDuration, uri = uri, width = width)
    if (!js.isUndefined(isStored)) __obj.updateDynamic("isStored")(isStored)
    __obj.asInstanceOf[Anon_HeightIsStored]
  }
}

