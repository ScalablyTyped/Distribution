package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookLinks extends js.Object {
  var links: js.Array[sparkpostLib.Anon_Href]
}

object WebhookLinks {
  @scala.inline
  def apply(links: js.Array[sparkpostLib.Anon_Href]): WebhookLinks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("links")(links)
    __obj.asInstanceOf[WebhookLinks]
  }
}

