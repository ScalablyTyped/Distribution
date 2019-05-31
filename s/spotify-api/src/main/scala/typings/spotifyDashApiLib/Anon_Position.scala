package typings
package spotifyDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Position extends js.Object {
  var position: js.UndefOr[scala.Double] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Position {
  @scala.inline
  def apply(position: scala.Int | scala.Double = null, uri: java.lang.String = null): Anon_Position = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_Position]
  }
}

