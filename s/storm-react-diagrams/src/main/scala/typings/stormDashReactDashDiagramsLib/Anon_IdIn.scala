package typings
package stormDashReactDashDiagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdIn extends js.Object {
  var id: java.lang.String
  var in: scala.Boolean
  var label: java.lang.String
  var links: js.Array[java.lang.String]
  var maximumLinks: scala.Double
  var name: java.lang.String
  var parentNode: java.lang.String
  var selected: scala.Boolean
  var `type`: java.lang.String
}

object Anon_IdIn {
  @scala.inline
  def apply(
    id: java.lang.String,
    in: scala.Boolean,
    label: java.lang.String,
    links: js.Array[java.lang.String],
    maximumLinks: scala.Double,
    name: java.lang.String,
    parentNode: java.lang.String,
    selected: scala.Boolean,
    `type`: java.lang.String
  ): Anon_IdIn = {
    val __obj = js.Dynamic.literal(id = id, in = in, label = label, links = links, maximumLinks = maximumLinks, name = name, parentNode = parentNode, selected = selected)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IdIn]
  }
}

