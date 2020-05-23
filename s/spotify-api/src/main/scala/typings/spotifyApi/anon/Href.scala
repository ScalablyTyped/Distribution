package typings.spotifyApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Href extends js.Object {
  var href: String
  var total: Double
}

object Href {
  @scala.inline
  def apply(href: String, total: Double): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
}

