package typings
package stormDashReactDashDiagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdSelectedType extends js.Object {
  var id: java.lang.String
  var selected: scala.Boolean
  var `type`: java.lang.String
}

object Anon_IdSelectedType {
  @scala.inline
  def apply(id: java.lang.String, selected: scala.Boolean, `type`: java.lang.String): Anon_IdSelectedType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[Anon_IdSelectedType]
  }
}

