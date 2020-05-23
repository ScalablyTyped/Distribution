package typings.spotifyApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var position: js.UndefOr[Double] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object Position {
  @scala.inline
  def apply(position: js.UndefOr[Double] = js.undefined, uri: String = null): Position = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

