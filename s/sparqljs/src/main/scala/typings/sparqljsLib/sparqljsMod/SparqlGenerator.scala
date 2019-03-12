package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparqlGenerator extends js.Object {
  def stringify(query: SparqlQuery): java.lang.String
}

object SparqlGenerator {
  @scala.inline
  def apply(stringify: SparqlQuery => java.lang.String): SparqlGenerator = {
    val __obj = js.Dynamic.literal(stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[SparqlGenerator]
  }
}

