package typings.sparqljs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.sparqljs.anon.BaseIRI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sparqljs", "Parser")
@js.native
class Parser () extends SparqlParser {
  def this(options: BaseIRI) = this()
  /* CompleteClass */
  override def parse(query: String): SparqlQuery = js.native
}

@JSImport("sparqljs", "Parser")
@js.native
object Parser
  extends Instantiable0[SparqlParser]
     with Instantiable1[/* options */ BaseIRI, SparqlParser]

