package typings.reactDashYoutube.reactDashYoutubeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var height: js.UndefOr[String] = js.undefined
  var playerVars: js.UndefOr[PlayerVars] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(height: String = null, playerVars: PlayerVars = null, width: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (playerVars != null) __obj.updateDynamic("playerVars")(playerVars)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Options]
  }
}

