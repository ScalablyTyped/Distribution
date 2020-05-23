package typings.snykDepGraph.typesMod

import typings.snykDepGraph.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionProvenance extends js.Object {
  var location: String
  var property: js.UndefOr[Name] = js.undefined
  var `type`: String
}

object VersionProvenance {
  @scala.inline
  def apply(location: String, `type`: String, property: Name = null): VersionProvenance = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionProvenance]
  }
}

