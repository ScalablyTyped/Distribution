package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sparqljs", "Parser")
@js.native
class Parser () extends SparqlParser {
  def this(prefixes: org.scalablytyped.runtime.StringDictionary[java.lang.String]) = this()
  def this(prefixes: org.scalablytyped.runtime.StringDictionary[java.lang.String], baseIRI: java.lang.String) = this()
  /* CompleteClass */
  override def parse(query: java.lang.String): SparqlQuery = js.native
}

@JSImport("sparqljs", "Parser")
@js.native
object Parser
  extends org.scalablytyped.runtime.Instantiable0[SparqlParser]
     with org.scalablytyped.runtime.Instantiable1[
      /* prefixes */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
      SparqlParser
    ]
     with org.scalablytyped.runtime.Instantiable2[
      /* prefixes */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
      /* baseIRI */ java.lang.String, 
      SparqlParser
    ]

