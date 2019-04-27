package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentListTokenType extends SqlTokenType {
  var namedAssignment: NamedAssignmentType
  var `type`: js.Symbol
}

object AssignmentListTokenType {
  @scala.inline
  def apply(namedAssignment: NamedAssignmentType, `type`: js.Symbol): AssignmentListTokenType = {
    val __obj = js.Dynamic.literal(namedAssignment = namedAssignment)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AssignmentListTokenType]
  }
}

