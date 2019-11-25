package typings.stormDashReactDashDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdIn extends js.Object {
  var id: String
  var in: Boolean
  var label: String
  var links: js.Array[String]
  var maximumLinks: Double
  var name: String
  var parentNode: String
  var selected: Boolean
  var `type`: String
}

object Anon_IdIn {
  @scala.inline
  def apply(
    id: String,
    in: Boolean,
    label: String,
    links: js.Array[String],
    maximumLinks: Double,
    name: String,
    parentNode: String,
    selected: Boolean,
    `type`: String
  ): Anon_IdIn = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], maximumLinks = maximumLinks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdIn]
  }
}

