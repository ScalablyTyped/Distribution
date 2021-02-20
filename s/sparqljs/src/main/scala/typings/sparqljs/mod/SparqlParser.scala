package typings.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparqlParser extends StObject {
  
  def parse(query: String): SparqlQuery = js.native
}
object SparqlParser {
  
  @scala.inline
  def apply(parse: String => SparqlQuery): SparqlParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[SparqlParser]
  }
  
  @scala.inline
  implicit class SparqlParserMutableBuilder[Self <: SparqlParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParse(value: String => SparqlQuery): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
