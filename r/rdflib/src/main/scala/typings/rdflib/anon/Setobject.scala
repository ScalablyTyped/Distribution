package typings.rdflib.anon

import typings.rdflib.tfTypesMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setobject extends js.Object {
  var statement: js.UndefOr[js.Array[Term]] = js.undefined
  var statementNT: js.UndefOr[String] = js.undefined
  var where: String
  def set_object(obj: js.Any, callbackFunction: js.Any): Unit
}

object Setobject {
  @scala.inline
  def apply(
    set_object: (js.Any, js.Any) => Unit,
    where: String,
    statement: js.Array[Term] = null,
    statementNT: String = null
  ): Setobject = {
    val __obj = js.Dynamic.literal(set_object = js.Any.fromFunction2(set_object), where = where.asInstanceOf[js.Any])
    if (statement != null) __obj.updateDynamic("statement")(statement.asInstanceOf[js.Any])
    if (statementNT != null) __obj.updateDynamic("statementNT")(statementNT.asInstanceOf[js.Any])
    __obj.asInstanceOf[Setobject]
  }
}

