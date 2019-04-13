package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sparqljs", "Generator")
@js.native
class Generator () extends SparqlGenerator {
  def this(options: GeneratorOptions) = this()
  /* CompleteClass */
  override def stringify(query: SparqlQuery): java.lang.String = js.native
}

@JSImport("sparqljs", "Generator")
@js.native
object Generator
  extends org.scalablytyped.runtime.Instantiable0[SparqlGenerator]
     with org.scalablytyped.runtime.Instantiable1[/* options */ GeneratorOptions, SparqlGenerator]

