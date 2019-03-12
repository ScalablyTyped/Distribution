package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparqlParser extends js.Object {
  def parse(query: java.lang.String): SparqlQuery
}

object SparqlParser {
  @scala.inline
  def apply(parse: java.lang.String => SparqlQuery): SparqlParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[SparqlParser]
  }
}

