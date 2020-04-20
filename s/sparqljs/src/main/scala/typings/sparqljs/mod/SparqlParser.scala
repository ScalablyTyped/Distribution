package typings.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparqlParser extends js.Object {
  def parse(query: String): SparqlQuery
}

object SparqlParser {
  @scala.inline
  def apply(parse: String => SparqlQuery): SparqlParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[SparqlParser]
  }
}

