package typings.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparqlGenerator extends js.Object {
  def stringify(query: SparqlQuery): String
}

object SparqlGenerator {
  @scala.inline
  def apply(stringify: SparqlQuery => String): SparqlGenerator = {
    val __obj = js.Dynamic.literal(stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[SparqlGenerator]
  }
}

