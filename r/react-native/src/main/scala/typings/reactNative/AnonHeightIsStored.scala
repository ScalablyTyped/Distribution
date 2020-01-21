package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeightIsStored extends js.Object {
  var height: Double
  var isStored: js.UndefOr[Boolean] = js.undefined
  var playableDuration: Double
  var uri: String
  var width: Double
}

object AnonHeightIsStored {
  @scala.inline
  def apply(
    height: Double,
    playableDuration: Double,
    uri: String,
    width: Double,
    isStored: js.UndefOr[Boolean] = js.undefined
  ): AnonHeightIsStored = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], playableDuration = playableDuration.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(isStored)) __obj.updateDynamic("isStored")(isStored.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeightIsStored]
  }
}

