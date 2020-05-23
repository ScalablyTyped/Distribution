package typings.rdflib.anon

import typings.rdflib.statementMod.default
import typings.rdflib.typesMod.GraphType
import typings.rdflib.typesMod.ObjectType
import typings.rdflib.typesMod.PredicateType
import typings.rdflib.typesMod.SubjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends js.Object {
  var delete: js.UndefOr[js.Array[default[SubjectType, PredicateType, ObjectType, GraphType]]] = js.undefined
  var patch: js.UndefOr[js.Array[default[SubjectType, PredicateType, ObjectType, GraphType]]] = js.undefined
  var where: js.UndefOr[js.Any] = js.undefined
}

object Delete {
  @scala.inline
  def apply(
    delete: js.Array[default[SubjectType, PredicateType, ObjectType, GraphType]] = null,
    patch: js.Array[default[SubjectType, PredicateType, ObjectType, GraphType]] = null,
    where: js.Any = null
  ): Delete = {
    val __obj = js.Dynamic.literal()
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (patch != null) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
}

