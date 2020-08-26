package typings.rdflib.anon

import typings.rdflib.statementMod.default
import typings.rdflib.typesMod.GraphType
import typings.rdflib.typesMod.ObjectType
import typings.rdflib.typesMod.PredicateType
import typings.rdflib.typesMod.SubjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delete extends js.Object {
  var delete: js.UndefOr[js.Array[default[SubjectType, PredicateType, ObjectType, GraphType]]] = js.native
  var patch: js.UndefOr[js.Array[default[SubjectType, PredicateType, ObjectType, GraphType]]] = js.native
  var where: js.UndefOr[js.Any] = js.native
}

object Delete {
  @scala.inline
  def apply(): Delete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delete]
  }
  @scala.inline
  implicit class DeleteOps[Self <: Delete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeleteVarargs(value: (default[SubjectType, PredicateType, ObjectType, GraphType])*): Self = this.set("delete", js.Array(value :_*))
    @scala.inline
    def setDelete(value: js.Array[default[SubjectType, PredicateType, ObjectType, GraphType]]): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setPatchVarargs(value: (default[SubjectType, PredicateType, ObjectType, GraphType])*): Self = this.set("patch", js.Array(value :_*))
    @scala.inline
    def setPatch(value: js.Array[default[SubjectType, PredicateType, ObjectType, GraphType]]): Self = this.set("patch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
    @scala.inline
    def setWhere(value: js.Any): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
  
}

