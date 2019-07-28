package typings.stormDashReactDashDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLinks extends js.Object {
  var id: String
  var links: js.Array[String]
  var maximumLinks: Double
  var name: String
  var parentNode: String
  var selected: Boolean
  var `type`: String
}

object Anon_IdLinks {
  @scala.inline
  def apply(
    id: String,
    links: js.Array[String],
    maximumLinks: Double,
    name: String,
    parentNode: String,
    selected: Boolean,
    `type`: String
  ): Anon_IdLinks = {
    val __obj = js.Dynamic.literal(id = id, links = links, maximumLinks = maximumLinks, name = name, parentNode = parentNode, selected = selected)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IdLinks]
  }
}

