package typings
package stormDashReactDashDiagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLinks extends js.Object {
  var id: java.lang.String
  var links: js.Array[java.lang.String]
  var maximumLinks: scala.Double
  var name: java.lang.String
  var parentNode: java.lang.String
  var selected: scala.Boolean
  var `type`: java.lang.String
}

object Anon_IdLinks {
  @scala.inline
  def apply(
    id: java.lang.String,
    links: js.Array[java.lang.String],
    maximumLinks: scala.Double,
    name: java.lang.String,
    parentNode: java.lang.String,
    selected: scala.Boolean,
    `type`: java.lang.String
  ): Anon_IdLinks = {
    val __obj = js.Dynamic.literal(id = id, links = links, maximumLinks = maximumLinks, name = name, parentNode = parentNode, selected = selected)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IdLinks]
  }
}

