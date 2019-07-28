package typings.spotifyDashWebDashApiDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Position extends js.Object {
  var position: js.UndefOr[Double] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object Anon_Position {
  @scala.inline
  def apply(position: Int | Double = null, uri: String = null): Anon_Position = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_Position]
  }
}

