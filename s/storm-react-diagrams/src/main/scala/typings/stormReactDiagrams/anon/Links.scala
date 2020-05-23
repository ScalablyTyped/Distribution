package typings.stormReactDiagrams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Links extends js.Object {
  var id: String
  var links: js.Array[String]
  var maximumLinks: Double
  var name: String
  var parentNode: String
  var selected: Boolean
  var `type`: String
}

object Links {
  @scala.inline
  def apply(
    id: String,
    links: js.Array[String],
    maximumLinks: Double,
    name: String,
    parentNode: String,
    selected: Boolean,
    `type`: String
  ): Links = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], maximumLinks = maximumLinks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
}

