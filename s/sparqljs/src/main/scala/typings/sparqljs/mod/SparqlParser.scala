package typings.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparqlParser extends js.Object {
  def parse(query: String): SparqlQuery = js.native
}

object SparqlParser {
  @scala.inline
  def apply(parse: String => SparqlQuery): SparqlParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[SparqlParser]
  }
  @scala.inline
  implicit class SparqlParserOps[Self <: SparqlParser] (val x: Self) extends AnyVal {
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
    def setParse(value: String => SparqlQuery): Self = this.set("parse", js.Any.fromFunction1(value))
  }
  
}

