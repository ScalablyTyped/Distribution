package typings.sparqljs.sparqljsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sparqljs", "Generator")
@js.native
class Generator () extends SparqlGenerator {
  def this(options: GeneratorOptions) = this()
  /* CompleteClass */
  override def stringify(query: SparqlQuery): String = js.native
}

@JSImport("sparqljs", "Generator")
@js.native
object Generator
  extends Instantiable0[SparqlGenerator]
     with Instantiable1[/* options */ GeneratorOptions, SparqlGenerator]

