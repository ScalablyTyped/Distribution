package typings.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparqlGenerator extends js.Object {
  def stringify(query: SparqlQuery): String = js.native
}

object SparqlGenerator {
  @scala.inline
  def apply(stringify: SparqlQuery => String): SparqlGenerator = {
    val __obj = js.Dynamic.literal(stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[SparqlGenerator]
  }
  @scala.inline
  implicit class SparqlGeneratorOps[Self <: SparqlGenerator] (val x: Self) extends AnyVal {
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
    def setStringify(value: SparqlQuery => String): Self = this.set("stringify", js.Any.fromFunction1(value))
  }
  
}

