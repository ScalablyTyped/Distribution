package typings.rdflib

import typings.rdflib.libQueryMod.Query
import typings.rdflib.rdflibBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSparqlToQueryMod {
  
  @JSImport("rdflib/lib/sparql-to-query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(SPARQL: Any, testMode: Any, kb: Any): `false` | Query = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(SPARQL.asInstanceOf[js.Any], testMode.asInstanceOf[js.Any], kb.asInstanceOf[js.Any])).asInstanceOf[`false` | Query]
}
