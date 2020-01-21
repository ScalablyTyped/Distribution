package typings.sparqljs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sparqljs", "Parser")
@js.native
class Parser () extends SparqlParser {
  def this(prefixes: StringDictionary[String]) = this()
  def this(prefixes: StringDictionary[String], baseIRI: String) = this()
  /* CompleteClass */
  override def parse(query: String): SparqlQuery = js.native
}

@JSImport("sparqljs", "Parser")
@js.native
object Parser
  extends Instantiable0[SparqlParser]
     with Instantiable1[/* prefixes */ StringDictionary[String], SparqlParser]
     with Instantiable2[/* prefixes */ StringDictionary[String], /* baseIRI */ String, SparqlParser]

