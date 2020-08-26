package typings.rdflib.anon

import typings.rdflib.tfTypesMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Setobject extends js.Object {
  var statement: js.UndefOr[js.Array[Term]] = js.native
  var statementNT: js.UndefOr[String] = js.native
  var where: String = js.native
  def set_object(obj: js.Any, callbackFunction: js.Any): Unit = js.native
}

object Setobject {
  @scala.inline
  def apply(set_object: (js.Any, js.Any) => Unit, where: String): Setobject = {
    val __obj = js.Dynamic.literal(set_object = js.Any.fromFunction2(set_object), where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[Setobject]
  }
  @scala.inline
  implicit class SetobjectOps[Self <: Setobject] (val x: Self) extends AnyVal {
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
    def setSet_object(value: (js.Any, js.Any) => Unit): Self = this.set("set_object", js.Any.fromFunction2(value))
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatementVarargs(value: Term*): Self = this.set("statement", js.Array(value :_*))
    @scala.inline
    def setStatement(value: js.Array[Term]): Self = this.set("statement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement: Self = this.set("statement", js.undefined)
    @scala.inline
    def setStatementNT(value: String): Self = this.set("statementNT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatementNT: Self = this.set("statementNT", js.undefined)
  }
  
}

