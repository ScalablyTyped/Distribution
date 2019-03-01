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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("links")(links)
    __obj.updateDynamic("maximumLinks")(maximumLinks)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parentNode")(parentNode)
    __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[Anon_IdLinks]
  }
}

