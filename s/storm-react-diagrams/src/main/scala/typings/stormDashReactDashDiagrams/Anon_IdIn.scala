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
    val __obj = js.Dynamic.literal(id = id, in = in, label = label, links = links, maximumLinks = maximumLinks, name = name, parentNode = parentNode, selected = selected)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IdIn]
  }
}

