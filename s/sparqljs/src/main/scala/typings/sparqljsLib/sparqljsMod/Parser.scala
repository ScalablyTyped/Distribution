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

